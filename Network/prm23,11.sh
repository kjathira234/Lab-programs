#!/bin/bash
echo "enter the filename to reset permissions:"
read filename
chmod 644 "$filename"
echo "permission reset to default:rw--r--r--"
