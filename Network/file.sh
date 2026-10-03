#!/bin/bash
read -p "Enter the name of file:" filename
if [ -e "$filename" ];then
	echo "File exist"
else 
	echo "File does not exist"
fi
if [ -r "$filename" ];then
	echo "File is readable"
else 
	echo "File is not readable"
fi
if [ -w "$filename" ];then
	echo "File is writeable"
else 
	echo "File is not writeable"
fi
if [ -r "$filename" ] && [ -w "$filename" ];then
	echo "File is both readable and writeable"
else 
	echo "File is not both readable and writeable"
fi
