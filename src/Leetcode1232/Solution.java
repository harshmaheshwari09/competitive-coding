package Leetcode1232;

public class Solution {
    double gradient;
    double yIntercept;
    LineType lineType;

    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n <= 2) {
            return true;
        }

        preProcess(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
        for (int i = 2; i < n; i++) {
            switch (this.lineType) {
                case NORMAL :
                    if (coordinates[i][1] != this.gradient * coordinates[i][0] + this.yIntercept) {
                        return false;
                    }
                    continue;
                case HORIZONTAL:
                    if (coordinates[i][1] != this.gradient) {
                        return false;
                    }
                    continue;
                case VERTICAL:
                    if (this.gradient != coordinates[i][0]) {
                        return false;
                    }
            }
        }
        return true;
    }

    public void preProcess(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            this.lineType = LineType.VERTICAL;
        } else if (y1 == y2) {
            this.lineType = LineType.HORIZONTAL;
        } else {
            this.lineType = LineType.NORMAL;
        }

        switch (this.lineType) {
            case HORIZONTAL :
                this.gradient = y1;
                break;
            case VERTICAL:
                this.gradient = x1;
                break;
            case NORMAL:
                this.gradient = calGradient(x1, y1, x2, y2);
                this.yIntercept = calInterceptOfY(x1, y1, this.gradient);
                break;
        }
    }

    public double calInterceptOfY(int x1, int y1, double m) {
        return y1 - m * x1;
    }

    public double calGradient(int x1, int y1, int x2, int y2) {
        return 1.0 * (y2 - y1) / (x2 - x1);
    }
}
