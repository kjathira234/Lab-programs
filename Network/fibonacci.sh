#!/bin/bash
echo "Enter the no. of terms:"
read n
a=0
b=1
echo "Fibonacci Series:"
for ((i=1;i<=n;i++))
do 
	echo "$a"
	f=$((a+b))
	a=$b
	b=$f
done


