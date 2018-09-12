# longestWord

**About:** 
- Find the longest word in a sentence and its length.

**Pre-requisites:**
1. Maven latest version.
2. JRE and JDK 1.8.

### **Instructions:**
**Before:**
1. Please clone the project using "_git clone https://github.com/saikiranrede/longestWord.git_"

**After:**
1. If command-line use 'mvn clean'.
2. 'mvn install' to build and install.
3. To run the tests, please use 'mvn test'.
4. If run with Eclipse:
	a. Import the project by using File -> Import -> Maven Existing Projects -> <path-to-this-project>.
	b. Project RunAs Maven Clean
	c. Project RunAs Maven Install
	d. which would also run the test cases.
	e. Then Project RunAs 'Run Configurations' and place the Arguments with any string you like then click 'Run'.

**To run the program:**
1. Navigate to 'longestWordInASentence/src/main/java/' and run 'javac longestWordInASentence/LongestWordInASentence.java' to compile.
2. And then run 'java longestWordInASentence.LongestWordInASentence "<Any String>"'. 
   For example: java longestWordInASentence.LongestWordInASentence "This is the longest word in a sentence".
3. That will print the output. (HashMap output)

**Assumptions:**
1. When there are two or more words with the same length it will return the first word encountered.
2. If while running the above command with null value then it will throw ArrayIndexOutOfBoundException.
3. If ever the method lengthOfaWordInASentence(String sentence) is run with an empty string then it would return empty hashmap.