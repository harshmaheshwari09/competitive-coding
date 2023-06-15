#!/bin/bash

# Iterate over all directories in the current directory
for dir in Leetcode_*; do
    if [ -d "$dir" ]; then
        # Extract the number part from the directory name
        num=$(echo "$dir" | sed 's/Leetcode_//')

        # Create the new directory name
        new_dir="leetcode${num}"

        # Rename the directory
        mv "$dir" "$new_dir"

        echo "Renamed directory: $dir -> $new_dir"
    fi
done
