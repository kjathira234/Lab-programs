#!/bin/bash

echo "Enter the movie file name:"
read file

while true
do
    echo "---------------------------"
    echo "1. Search for a movie name"
    echo "2. Count occurrences of a movie name"
    echo "3. Find movies starting or ending with a word"
    echo "4. Display only the first match"
    echo "5. Count total movies (words)"
    echo "6. Replace a movie name"
    echo "7. Exit"
    echo "---------------------------"
    echo "Enter your choice:"
    read choice

    case $choice in

    1)
        echo "Enter movie name to search:"
        read movie
        grep "$movie" "$file"
        ;;

    2)
        echo "Enter movie name to count:"
        read movie
        grep -o "$movie" "$file" | wc -l
        ;;

    3)
        echo "Enter word:"
        read word
        echo "Movies starting with '$word':"
        grep "^$word" "$file"
        echo "Movies ending with '$word':"
        grep "$word$" "$file"
        ;;

    4)
        echo "Enter movie name:"
        read movie
        grep -m 1 "$movie" "$file"
        ;;

    5)
        echo "Total number of words (movies):"
        wc -w "$file"
        ;;

    6)
        echo "Enter movie name to replace:"
        read old
        echo "Enter new movie name:"
        read new
        sed -i "s/$old/$new/g" "$file"
        echo "Replacement done."
        ;;

    7)
        echo "Exiting..."
        break
        ;;

    *)
        echo "Invalid choice"
        ;;
    esac
done
