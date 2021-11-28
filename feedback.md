# mp2 Feedback

## Grade: B

| Compilation | Timeout | Duration |
|:-----------:|:-------:|:--------:|
||NoNoNo|21.38|

## Comments
Some specs are missing and existing specs lack detail. RI/AFs are missing. Variable names are good, but there is a lack of comments and there is commented out code in DWInteractionGraph. Code style is fine.
## Test Results 
### cpen221.mp2.Task1DWTests
| Test Status | Count |
| ----------- | ----- |
|tests|9|
|skipped|0|
|failures|1|
|errors|0|
#### Failed Tests
1. `testRandomSpacesInFile() (java.lang.NumberFormatException: For input string: "")`
### cpen221.mp2.Task1UDWTests
| Test Status | Count |
| ----------- | ----- |
|tests|10|
|skipped|0|
|failures|1|
|errors|0|
#### Failed Tests
1. `testRandomSpacesInFile() (java.lang.NumberFormatException: For input string: "")`
### cpen221.mp2.Task2DWTests
| Test Status | Count |
| ----------- | ----- |
|tests|15|
|skipped|0|
|failures|2|
|errors|0|
#### Failed Tests
1. `testNthMostActiveUserAllReceivers() (java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 6)`
1. `testNthMostActiveUserAllSenders() (org.opentest4j.AssertionFailedError: expected: <2> but was: <1>)`
### cpen221.mp2.Task2UDWTests
| Test Status | Count |
| ----------- | ----- |
|tests|11|
|skipped|0|
|failures|2|
|errors|0|
#### Failed Tests
1. `testNthActiveUserWithNLargerThanUserCount() (java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 4)`
1. `testSingleUserTransactionNthActiveUser() (java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1)`
### cpen221.mp2.Task3DWTests
| Test Status | Count |
| ----------- | ----- |
|tests|12|
|skipped|0|
|failures|3|
|errors|0|
#### Failed Tests
1. `testBFSUserDoesNotExist() (java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 10)`
1. `testBFSGraph2User6ToAllUsers() (org.opentest4j.AssertionFailedError: expected: <[6]> but was: <null>)`
1. `testDFSUserDoesNotExist() (java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 10)`
### cpen221.mp2.Task3UDWTests
| Test Status | Count |
| ----------- | ----- |
|tests|8|
|skipped|0|
|failures|0|
|errors|0|
### cpen221.mp2.Task4DWTests
| Test Status | Count |
| ----------- | ----- |
|tests|6|
|skipped|0|
|failures|5|
|errors|0|
#### Failed Tests
1. `testMaxedBreachedUserCount1() (org.opentest4j.AssertionFailedError: expected: <8> but was: <0>)`
1. `testMaxedBreachedUserCount2() (org.opentest4j.AssertionFailedError: expected: <10> but was: <0>)`
1. `testMaxedBreachedUserCount3() (org.opentest4j.AssertionFailedError: expected: <5> but was: <0>)`
1. `testMaxedBreachedUserCount5() (org.opentest4j.AssertionFailedError: expected: <1> but was: <0>)`
1. `testMaxedBreachedUserCount6() (org.opentest4j.AssertionFailedError: expected: <1> but was: <0>)`

## Code Quality
```
DWInteractionGraph.java:6:	Avoid unused imports such as 'java.lang.reflect.Array'
DWInteractionGraph.java:9:	The class 'DWInteractionGraph' has a Modified Cyclomatic Complexity of 6 (Highest = 11).
DWInteractionGraph.java:9:	The class 'DWInteractionGraph' has a Standard Cyclomatic Complexity of 6 (Highest = 11).
DWInteractionGraph.java:9:	The class 'DWInteractionGraph' has a total cyclomatic complexity of 113 (highest 15).
DWInteractionGraph.java:9:	This class has too many methods, consider refactoring it.
DWInteractionGraph.java:14:	Found non-transient, non-static member. Please mark as transient or provide accessors.
DWInteractionGraph.java:15:	Avoid using implementation types like 'ArrayList'; use the interface instead
DWInteractionGraph.java:15:	Found non-transient, non-static member. Please mark as transient or provide accessors.
DWInteractionGraph.java:15:	The field initializer for 'allUsers' is never used (overwritten on lines 98, 145 and 191)
DWInteractionGraph.java:16:	Found non-transient, non-static member. Please mark as transient or provide accessors.
DWInteractionGraph.java:18:	Avoid using implementation types like 'ArrayList'; use the interface instead
DWInteractionGraph.java:18:	The method 'getalluser(int, List)' has a cyclomatic complexity of 15.
DWInteractionGraph.java:21:	Ensure that resources like this FileReader object are closed after use
DWInteractionGraph.java:25:	Potential violation of Law of Demeter (object not created locally)
DWInteractionGraph.java:30:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:30:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:30:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:30:	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()
DWInteractionGraph.java:32:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:32:	Deeply nested if..then statements are hard to read
DWInteractionGraph.java:36:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:36:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:36:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:36:	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()
DWInteractionGraph.java:38:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:38:	Deeply nested if..then statements are hard to read
DWInteractionGraph.java:48:	System.out.println is used
DWInteractionGraph.java:50:	System.out.println is used
DWInteractionGraph.java:53:	Consider using varargs for methods or constructors which take an array the last parameter.
DWInteractionGraph.java:78:	These nested if statements could be combined
DWInteractionGraph.java:107:	Ensure that resources like this FileReader object are closed after use
DWInteractionGraph.java:120:	System.out.println is used
DWInteractionGraph.java:126:	System.out.print is used
DWInteractionGraph.java:128:	System.out.println is used
DWInteractionGraph.java:143:	Consider using varargs for methods or constructors which take an array the last parameter.
DWInteractionGraph.java:143:	The constructor 'DWInteractionGraph(DWInteractionGraph, int)' has a cyclomatic complexity of 10.
DWInteractionGraph.java:148:	System.out.println is used
DWInteractionGraph.java:172:	System.out.print is used
DWInteractionGraph.java:174:	System.out.println is used
DWInteractionGraph.java:194:	System.out.println is used
DWInteractionGraph.java:213:	System.out.print is used
DWInteractionGraph.java:215:	System.out.println is used
DWInteractionGraph.java:239:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:239:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:255:	Consider using varargs for methods or constructors which take an array the last parameter.
DWInteractionGraph.java:258:	Found 'DD'-anomaly for variable 'interactionCount' (lines '258'-'267').
DWInteractionGraph.java:267:	Found 'DD'-anomaly for variable 'interactionCount' (lines '267'-'267').
DWInteractionGraph.java:290:	Found 'DU'-anomaly for variable 'sendCount' (lines '290'-'316').
DWInteractionGraph.java:291:	Found 'DU'-anomaly for variable 'receiveCount' (lines '291'-'316').
DWInteractionGraph.java:292:	Found 'DU'-anomaly for variable 'uniqueUsers' (lines '292'-'316').
DWInteractionGraph.java:294:	Found 'DU'-anomaly for variable 'user' (lines '294'-'316').
DWInteractionGraph.java:296:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:326:	The method 'NthMostActiveUser' has a Modified Cyclomatic Complexity of 11.
DWInteractionGraph.java:326:	The method 'NthMostActiveUser' has a Standard Cyclomatic Complexity of 11.
DWInteractionGraph.java:326:	The method 'NthMostActiveUser(int, SendOrReceive)' has a cyclomatic complexity of 11.
DWInteractionGraph.java:329:	Found 'DD'-anomaly for variable 'Ranking' (lines '329'-'333').
DWInteractionGraph.java:333:	Found 'DD'-anomaly for variable 'Ranking' (lines '333'-'334').
DWInteractionGraph.java:334:	Found 'DD'-anomaly for variable 'Ranking' (lines '334'-'333').
DWInteractionGraph.java:341:	System.out.println is used
DWInteractionGraph.java:344:	System.out.print is used
DWInteractionGraph.java:346:	System.out.println is used
DWInteractionGraph.java:370:	System.out.println is used
DWInteractionGraph.java:373:	System.out.print is used
DWInteractionGraph.java:375:	System.out.println is used
DWInteractionGraph.java:430:	Avoid using implementation types like 'ArrayList'; use the interface instead
DWInteractionGraph.java:430:	The method 'BFS_helper' has a Modified Cyclomatic Complexity of 10.
DWInteractionGraph.java:430:	The method 'BFS_helper' has a Standard Cyclomatic Complexity of 10.
DWInteractionGraph.java:430:	The method 'BFS_helper(int, ArrayList, Set)' has a cyclomatic complexity of 10.
DWInteractionGraph.java:432:	Found 'DU'-anomaly for variable 'nextList' (lines '432'-'467').
DWInteractionGraph.java:434:	This for loop can be replaced by a foreach loop
DWInteractionGraph.java:438:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:439:	Avoid using Literals in Conditional Statements
DWInteractionGraph.java:439:	These nested if statements could be combined
DWInteractionGraph.java:449:	This for loop can be replaced by a foreach loop
DWInteractionGraph.java:450:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:456:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:460:	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()
DWInteractionGraph.java:485:	System.out.println is used
DWInteractionGraph.java:492:	Avoid using implementation types like 'ArrayList'; use the interface instead
DWInteractionGraph.java:500:	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()
DWInteractionGraph.java:551:	System.out.println is used
DWInteractionGraph.java:555:	Avoid using implementation types like 'ArrayList'; use the interface instead
DWInteractionGraph.java:557:	Avoid unnecessary comparisons in boolean expressions
DWInteractionGraph.java:562:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:8:	The class 'UDWInteractionGraph' has a total cyclomatic complexity of 83 (highest 15).
UDWInteractionGraph.java:12:	Found non-transient, non-static member. Please mark as transient or provide accessors.
UDWInteractionGraph.java:12:	Private field 'fileName' could be made final; it is only initialized in the declaration or constructor.
UDWInteractionGraph.java:13:	Avoid using implementation types like 'ArrayList'; use the interface instead
UDWInteractionGraph.java:13:	Found non-transient, non-static member. Please mark as transient or provide accessors.
UDWInteractionGraph.java:13:	Private field 'allUsers' could be made final; it is only initialized in the declaration or constructor.
UDWInteractionGraph.java:13:	The field initializer for 'allUsers' is never used (overwritten on lines 62, 112, 157 and 192)
UDWInteractionGraph.java:14:	Found non-transient, non-static member. Please mark as transient or provide accessors.
UDWInteractionGraph.java:14:	Private field 'interactionMap' could be made final; it is only initialized in the declaration or constructor.
UDWInteractionGraph.java:17:	Avoid using implementation types like 'ArrayList'; use the interface instead
UDWInteractionGraph.java:17:	The method 'getalluser(int, List)' has a cyclomatic complexity of 15.
UDWInteractionGraph.java:20:	Ensure that resources like this FileReader object are closed after use
UDWInteractionGraph.java:24:	Potential violation of Law of Demeter (object not created locally)
UDWInteractionGraph.java:29:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:29:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:29:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:29:	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()
UDWInteractionGraph.java:31:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:31:	Deeply nested if..then statements are hard to read
UDWInteractionGraph.java:35:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:35:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:35:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:35:	Substitute calls to size() == 0 (or size() != 0, size() > 0, size() < 1) with calls to isEmpty()
UDWInteractionGraph.java:37:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:37:	Deeply nested if..then statements are hard to read
UDWInteractionGraph.java:47:	System.out.println is used
UDWInteractionGraph.java:49:	System.out.println is used
UDWInteractionGraph.java:71:	Ensure that resources like this FileReader object are closed after use
UDWInteractionGraph.java:87:	System.out.println is used
UDWInteractionGraph.java:93:	System.out.print is used
UDWInteractionGraph.java:95:	System.out.println is used
UDWInteractionGraph.java:110:	Consider using varargs for methods or constructors which take an array the last parameter.
UDWInteractionGraph.java:110:	The constructor 'UDWInteractionGraph(UDWInteractionGraph, int)' has a cyclomatic complexity of 10.
UDWInteractionGraph.java:115:	System.out.println is used
UDWInteractionGraph.java:139:	System.out.print is used
UDWInteractionGraph.java:141:	System.out.println is used
UDWInteractionGraph.java:160:	System.out.println is used
UDWInteractionGraph.java:179:	System.out.print is used
UDWInteractionGraph.java:181:	System.out.println is used
UDWInteractionGraph.java:235:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:235:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:249:	Consider using varargs for methods or constructors which take an array the last parameter.
UDWInteractionGraph.java:251:	Found 'DD'-anomaly for variable 'EmailCounter' (lines '251'-'259').
UDWInteractionGraph.java:259:	Found 'DD'-anomaly for variable 'EmailCounter' (lines '259'-'259').
UDWInteractionGraph.java:277:	Found 'DU'-anomaly for variable 'order' (lines '277'-'293').
UDWInteractionGraph.java:278:	Found 'DU'-anomaly for variable 'NumberOfEmails' (lines '278'-'293').
UDWInteractionGraph.java:279:	Found 'DD'-anomaly for variable 'UniqueUsersInteractedWith' (lines '279'-'288').
UDWInteractionGraph.java:279:	Found 'DU'-anomaly for variable 'UniqueUsersInteractedWith' (lines '279'-'293').
UDWInteractionGraph.java:281:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:288:	Found 'DD'-anomaly for variable 'UniqueUsersInteractedWith' (lines '288'-'288').
UDWInteractionGraph.java:291:	System.out.println is used
UDWInteractionGraph.java:300:	Found 'DD'-anomaly for variable 'Ranking' (lines '300'-'304').
UDWInteractionGraph.java:304:	Found 'DD'-anomaly for variable 'Ranking' (lines '304'-'305').
UDWInteractionGraph.java:305:	Found 'DD'-anomaly for variable 'Ranking' (lines '305'-'304').
UDWInteractionGraph.java:312:	System.out.println is used
UDWInteractionGraph.java:315:	System.out.print is used
UDWInteractionGraph.java:317:	System.out.println is used
UDWInteractionGraph.java:331:	Found 'DD'-anomaly for variable 'count' (lines '331'-'341').
UDWInteractionGraph.java:333:	Found 'DU'-anomaly for variable 'graph' (lines '333'-'347').
UDWInteractionGraph.java:335:	This for loop can be replaced by a foreach loop
UDWInteractionGraph.java:336:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:338:	System.out.println is used
UDWInteractionGraph.java:342:	System.out.println is used
UDWInteractionGraph.java:349:	Avoid using implementation types like 'ArrayList'; use the interface instead
UDWInteractionGraph.java:349:	Avoid using implementation types like 'ArrayList'; use the interface instead
UDWInteractionGraph.java:350:	This for loop can be replaced by a foreach loop
UDWInteractionGraph.java:351:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:353:	System.out.println is used
UDWInteractionGraph.java:357:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:359:	System.out.println is used
UDWInteractionGraph.java:373:	System.out.println is used
UDWInteractionGraph.java:377:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:377:	Avoid unnecessary if..then..else statements when returning booleans
UDWInteractionGraph.java:384:	Avoid using implementation types like 'ArrayList'; use the interface instead
UDWInteractionGraph.java:384:	Avoid using implementation types like 'ArrayList'; use the interface instead
UDWInteractionGraph.java:385:	Found 'DD'-anomaly for variable 'check' (lines '385'-'388').
UDWInteractionGraph.java:385:	Found 'DU'-anomaly for variable 'check' (lines '385'-'409').
UDWInteractionGraph.java:388:	Found 'DD'-anomaly for variable 'check' (lines '388'-'388').
UDWInteractionGraph.java:388:	Found 'DU'-anomaly for variable 'check' (lines '388'-'409').
UDWInteractionGraph.java:392:	System.out.println is used
UDWInteractionGraph.java:400:	Avoid unnecessary comparisons in boolean expressions
UDWInteractionGraph.java:401:	System.out.println is used
UDWInteractionGraph.java:406:	System.out.println is used
LoosePackageCoupling	-	No packages or classes specified
```

## Test Coverage
### UDWInteractionGraph
| Metric | Coverage |
| ------ | -------- |
|LINE_MISSED|10|
|LINE_COVERED|186|
|BRANCH_MISSED|7|
|BRANCH_COVERED|127|
### DWInteractionGraph
| Metric | Coverage |
| ------ | -------- |
|LINE_MISSED|13|
|LINE_COVERED|242|
|BRANCH_MISSED|14|
|BRANCH_COVERED|174|

## Checkstyle Results
### `DWInteractionGraph.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 6 | 8 | `Unused import - java.lang.reflect.Array.` |
| 7 | 17 | `Using the '.*' form of import should be avoided - java.util.*.` |
| 14 | 19 | `Variable 'fileName' must be private and have accessor methods.` |
| 15 | 31 | `Variable 'allUsers' must be private and have accessor methods.` |
| 15 | 39 | `'=' is not followed by whitespace.` |
| 15 | 39 | `'=' is not preceded with whitespace.` |
| 16 | 26 | `Variable 'interactionMap' must be private and have accessor methods.` |
| 18 | 59 | `',' is not followed by whitespace.` |
| 18 | 85 | `'{' is not preceded with whitespace.` |
| 19 | 33 | `'=' is not followed by whitespace.` |
| 19 | 33 | `'=' is not preceded with whitespace.` |
| 27 |  | `Line is longer than 100 characters (found 135).` |
| 27 | 17 | `'if' is not followed by whitespace.` |
| 27 | 61 | `'<=' is not followed by whitespace.` |
| 27 | 61 | `'<=' is not preceded with whitespace.` |
| 27 | 76 | `'&&' is not followed by whitespace.` |
| 27 | 76 | `'&&' is not preceded with whitespace.` |
| 27 | 119 | `'>=' is not followed by whitespace.` |
| 27 | 119 | `'>=' is not preceded with whitespace.` |
| 27 | 135 | `'{' is not preceded with whitespace.` |
| 28 | 31 | `'=' is not followed by whitespace.` |
| 28 | 31 | `'=' is not preceded with whitespace.` |
| 29 | 33 | `'=' is not followed by whitespace.` |
| 29 | 33 | `'=' is not preceded with whitespace.` |
| 30 |  | `Line is longer than 100 characters (found 152).` |
| 30 | 21 | `'if' is not followed by whitespace.` |
| 30 | 46 | `'==' is not followed by whitespace.` |
| 30 | 46 | `'==' is not preceded with whitespace.` |
| 30 | 46 | `Expression can be simplified.` |
| 30 | 53 | `'&&' is not followed by whitespace.` |
| 30 | 53 | `'&&' is not preceded with whitespace.` |
| 30 | 86 | `'==' is not followed by whitespace.` |
| 30 | 86 | `'==' is not preceded with whitespace.` |
| 30 | 86 | `Expression can be simplified.` |
| 30 | 92 | `'||' is not followed by whitespace.` |
| 30 | 92 | `'||' is not preceded with whitespace.` |
| 30 | 121 | `'==' is not followed by whitespace.` |
| 30 | 121 | `'==' is not preceded with whitespace.` |
| 30 | 121 | `Expression can be simplified.` |
| 30 | 128 | `'||' is not followed by whitespace.` |
| 30 | 128 | `'||' is not preceded with whitespace.` |
| 30 | 147 | `'==' is not followed by whitespace.` |
| 30 | 147 | `'==' is not preceded with whitespace.` |
| 30 | 152 | `'{' is not preceded with whitespace.` |
| 32 | 25 | `'if' is not followed by whitespace.` |
| 32 | 52 | `'==' is not followed by whitespace.` |
| 32 | 52 | `'==' is not preceded with whitespace.` |
| 32 | 52 | `Expression can be simplified.` |
| 32 | 60 | `'{' is not preceded with whitespace.` |
| 36 |  | `Line is longer than 100 characters (found 154).` |
| 36 | 21 | `'if' is not followed by whitespace.` |
| 36 | 48 | `'==' is not followed by whitespace.` |
| 36 | 48 | `'==' is not preceded with whitespace.` |
| 36 | 48 | `Expression can be simplified.` |
| 36 | 55 | `'&&' is not followed by whitespace.` |
| 36 | 55 | `'&&' is not preceded with whitespace.` |
| 36 | 88 | `'==' is not followed by whitespace.` |
| 36 | 88 | `'==' is not preceded with whitespace.` |
| 36 | 88 | `Expression can be simplified.` |
| 36 | 94 | `'||' is not followed by whitespace.` |
| 36 | 94 | `'||' is not preceded with whitespace.` |
| 36 | 123 | `'==' is not followed by whitespace.` |
| 36 | 123 | `'==' is not preceded with whitespace.` |
| 36 | 123 | `Expression can be simplified.` |
| 36 | 130 | `'||' is not followed by whitespace.` |
| 36 | 130 | `'||' is not preceded with whitespace.` |
| 36 | 149 | `'==' is not followed by whitespace.` |
| 36 | 149 | `'==' is not preceded with whitespace.` |
| 36 | 154 | `'{' is not preceded with whitespace.` |
| 38 | 25 | `'if' is not followed by whitespace.` |
| 38 | 50 | `'==' is not followed by whitespace.` |
| 38 | 50 | `'==' is not preceded with whitespace.` |
| 38 | 50 | `Expression can be simplified.` |
| 38 | 58 | `'{' is not preceded with whitespace.` |
| 46 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 50 | 42 | `'+' is not followed by whitespace.` |
| 50 | 42 | `'+' is not preceded with whitespace.` |
| 50 | 55 | `'+' is not followed by whitespace.` |
| 50 | 55 | `'+' is not preceded with whitespace.` |
| 50 | 62 | `'+' is not followed by whitespace.` |
| 50 | 62 | `'+' is not preceded with whitespace.` |
| 53 | 52 | `'{' is not preceded with whitespace.` |
| 57 | 9 | `'{' at column 9 should be on the previous line.` |
| 59 | 13 | `'{' at column 13 should be on the previous line.` |
| 61 | 17 | `'{' at column 17 should be on the previous line.` |
| 70 | 52 | `',' is not followed by whitespace.` |
| 70 | 63 | `'{' is not preceded with whitespace.` |
| 74 | 9 | `'{' at column 9 should be on the previous line.` |
| 76 | 13 | `'{' at column 13 should be on the previous line.` |
| 77 | 17 | `'if' is not followed by whitespace.` |
| 77 | 34 | `'==' is not followed by whitespace.` |
| 77 | 34 | `'==' is not preceded with whitespace.` |
| 77 | 42 | `'{' is not preceded with whitespace.` |
| 79 | 21 | `'{' at column 21 should be on the previous line.` |
| 97 | 22 | `'=' is not followed by whitespace.` |
| 97 | 22 | `'=' is not preceded with whitespace.` |
| 98 | 22 | `'=' is not followed by whitespace.` |
| 98 | 22 | `'=' is not preceded with whitespace.` |
| 98 | 45 | `',' is not followed by whitespace.` |
| 98 | 65 | `',' is not followed by whitespace.` |
| 100 | 9 | `'for' is not followed by whitespace.` |
| 100 | 18 | `'=' is not followed by whitespace.` |
| 100 | 18 | `'=' is not preceded with whitespace.` |
| 100 | 20 | `';' is not followed by whitespace.` |
| 100 | 22 | `'<' is not followed by whitespace.` |
| 100 | 22 | `'<' is not preceded with whitespace.` |
| 100 | 38 | `';' is not followed by whitespace.` |
| 100 | 43 | `'{' is not preceded with whitespace.` |
| 101 | 13 | `'for' is not followed by whitespace.` |
| 101 | 22 | `'=' is not followed by whitespace.` |
| 101 | 22 | `'=' is not preceded with whitespace.` |
| 101 | 24 | `';' is not followed by whitespace.` |
| 101 | 26 | `'<' is not followed by whitespace.` |
| 101 | 26 | `'<' is not preceded with whitespace.` |
| 101 | 42 | `';' is not followed by whitespace.` |
| 101 | 47 | `'{' is not preceded with whitespace.` |
| 102 | 34 | `'=' is not followed by whitespace.` |
| 102 | 34 | `'=' is not preceded with whitespace.` |
| 112 | 27 | `'=' is not followed by whitespace.` |
| 112 | 27 | `'=' is not preceded with whitespace.` |
| 113 | 29 | `'=' is not followed by whitespace.` |
| 113 | 29 | `'=' is not preceded with whitespace.` |
| 114 | 30 | `'=' is not followed by whitespace.` |
| 114 | 30 | `'=' is not preceded with whitespace.` |
| 118 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 122 | 28 | `'=' is not followed by whitespace.` |
| 122 | 28 | `'=' is not preceded with whitespace.` |
| 124 | 9 | `'for' is not followed by whitespace.` |
| 124 | 18 | `'=' is not followed by whitespace.` |
| 124 | 18 | `'=' is not preceded with whitespace.` |
| 124 | 20 | `';' is not followed by whitespace.` |
| 124 | 22 | `'<' is not followed by whitespace.` |
| 124 | 22 | `'<' is not preceded with whitespace.` |
| 124 | 38 | `';' is not followed by whitespace.` |
| 124 | 43 | `'{' is not preceded with whitespace.` |
| 125 | 13 | `'for' is not followed by whitespace.` |
| 125 | 22 | `'=' is not followed by whitespace.` |
| 125 | 22 | `'=' is not preceded with whitespace.` |
| 125 | 24 | `';' is not followed by whitespace.` |
| 125 | 26 | `'<' is not followed by whitespace.` |
| 125 | 26 | `'<' is not preceded with whitespace.` |
| 125 | 42 | `';' is not followed by whitespace.` |
| 125 | 47 | `'{' is not preceded with whitespace.` |
| 126 | 66 | `'+' is not followed by whitespace.` |
| 126 | 66 | `'+' is not preceded with whitespace.` |
| 144 | 22 | `'=' is not followed by whitespace.` |
| 144 | 22 | `'=' is not preceded with whitespace.` |
| 145 | 22 | `'=' is not followed by whitespace.` |
| 145 | 22 | `'=' is not preceded with whitespace.` |
| 145 | 44 | `',' is not followed by whitespace.` |
| 146 | 36 | `'=' is not followed by whitespace.` |
| 146 | 36 | `'=' is not preceded with whitespace.` |
| 148 | 41 | `'+' is not followed by whitespace.` |
| 148 | 41 | `'+' is not preceded with whitespace.` |
| 152 | 9 | `'for' is not followed by whitespace.` |
| 152 | 18 | `'=' is not followed by whitespace.` |
| 152 | 18 | `'=' is not preceded with whitespace.` |
| 152 | 20 | `';' is not followed by whitespace.` |
| 152 | 22 | `'<' is not followed by whitespace.` |
| 152 | 22 | `'<' is not preceded with whitespace.` |
| 152 | 38 | `';' is not followed by whitespace.` |
| 152 | 43 | `'{' is not preceded with whitespace.` |
| 153 | 13 | `'for' is not followed by whitespace.` |
| 153 | 22 | `'=' is not followed by whitespace.` |
| 153 | 22 | `'=' is not preceded with whitespace.` |
| 153 | 24 | `';' is not followed by whitespace.` |
| 153 | 26 | `'<' is not followed by whitespace.` |
| 153 | 26 | `'<' is not preceded with whitespace.` |
| 153 | 42 | `';' is not followed by whitespace.` |
| 153 | 47 | `'{' is not preceded with whitespace.` |
| 154 | 34 | `'=' is not followed by whitespace.` |
| 154 | 34 | `'=' is not preceded with whitespace.` |
| 158 | 9 | `'for' is not followed by whitespace.` |
| 158 | 18 | `'=' is not followed by whitespace.` |
| 158 | 18 | `'=' is not preceded with whitespace.` |
| 158 | 20 | `';' is not followed by whitespace.` |
| 158 | 22 | `'<' is not followed by whitespace.` |
| 158 | 22 | `'<' is not preceded with whitespace.` |
| 158 | 43 | `';' is not followed by whitespace.` |
| 158 | 48 | `'{' is not preceded with whitespace.` |
| 159 | 13 | `'for' is not followed by whitespace.` |
| 159 | 22 | `'=' is not followed by whitespace.` |
| 159 | 22 | `'=' is not preceded with whitespace.` |
| 159 | 24 | `';' is not followed by whitespace.` |
| 159 | 26 | `'<' is not followed by whitespace.` |
| 159 | 26 | `'<' is not preceded with whitespace.` |
| 159 | 47 | `';' is not followed by whitespace.` |
| 159 | 52 | `'{' is not preceded with whitespace.` |
| 160 |  | `Line is longer than 100 characters (found 155).` |
| 160 | 17 | `'for' is not followed by whitespace.` |
| 160 | 32 | `'=' is not followed by whitespace.` |
| 160 | 32 | `'=' is not preceded with whitespace.` |
| 160 | 34 | `';' is not followed by whitespace.` |
| 160 | 42 | `'<' is not followed by whitespace.` |
| 160 | 42 | `'<' is not preceded with whitespace.` |
| 160 | 144 | `';' is not followed by whitespace.` |
| 160 | 155 | `'{' is not preceded with whitespace.` |
| 161 |  | `Line is longer than 100 characters (found 144).` |
| 161 | 29 | `'=' is not preceded with whitespace.` |
| 162 | 21 | `'if' is not followed by whitespace.` |
| 162 | 28 | `'<=' is not followed by whitespace.` |
| 162 | 28 | `'<=' is not preceded with whitespace.` |
| 162 | 43 | `'&&' is not followed by whitespace.` |
| 162 | 43 | `'&&' is not preceded with whitespace.` |
| 162 | 49 | `'>=' is not followed by whitespace.` |
| 162 | 49 | `'>=' is not preceded with whitespace.` |
| 162 | 65 | `'{' is not preceded with whitespace.` |
| 163 |  | `Line is longer than 100 characters (found 155).` |
| 168 | 28 | `'=' is not followed by whitespace.` |
| 168 | 28 | `'=' is not preceded with whitespace.` |
| 170 | 9 | `'for' is not followed by whitespace.` |
| 170 | 18 | `'=' is not followed by whitespace.` |
| 170 | 18 | `'=' is not preceded with whitespace.` |
| 170 | 20 | `';' is not followed by whitespace.` |
| 170 | 22 | `'<' is not followed by whitespace.` |
| 170 | 22 | `'<' is not preceded with whitespace.` |
| 170 | 38 | `';' is not followed by whitespace.` |
| 170 | 43 | `'{' is not preceded with whitespace.` |
| 171 | 13 | `'for' is not followed by whitespace.` |
| 171 | 22 | `'=' is not followed by whitespace.` |
| 171 | 22 | `'=' is not preceded with whitespace.` |
| 171 | 24 | `';' is not followed by whitespace.` |
| 171 | 26 | `'<' is not followed by whitespace.` |
| 171 | 26 | `'<' is not preceded with whitespace.` |
| 171 | 42 | `';' is not followed by whitespace.` |
| 171 | 47 | `'{' is not preceded with whitespace.` |
| 172 | 66 | `'+' is not followed by whitespace.` |
| 172 | 66 | `'+' is not preceded with whitespace.` |
| 190 | 22 | `'=' is not followed by whitespace.` |
| 190 | 22 | `'=' is not preceded with whitespace.` |
| 191 | 22 | `'=' is not followed by whitespace.` |
| 191 | 22 | `'=' is not preceded with whitespace.` |
| 191 | 45 | `',' is not followed by whitespace.` |
| 191 | 65 | `',' is not followed by whitespace.` |
| 192 | 36 | `'=' is not followed by whitespace.` |
| 192 | 36 | `'=' is not preceded with whitespace.` |
| 194 | 41 | `'+' is not followed by whitespace.` |
| 194 | 41 | `'+' is not preceded with whitespace.` |
| 198 | 9 | `'for' is not followed by whitespace.` |
| 198 | 18 | `'=' is not followed by whitespace.` |
| 198 | 18 | `'=' is not preceded with whitespace.` |
| 198 | 20 | `';' is not followed by whitespace.` |
| 198 | 22 | `'<' is not followed by whitespace.` |
| 198 | 22 | `'<' is not preceded with whitespace.` |
| 198 | 38 | `';' is not followed by whitespace.` |
| 198 | 43 | `'{' is not preceded with whitespace.` |
| 199 | 13 | `'for' is not followed by whitespace.` |
| 199 | 22 | `'=' is not followed by whitespace.` |
| 199 | 22 | `'=' is not preceded with whitespace.` |
| 199 | 24 | `';' is not followed by whitespace.` |
| 199 | 26 | `'<' is not followed by whitespace.` |
| 199 | 26 | `'<' is not preceded with whitespace.` |
| 199 | 42 | `';' is not followed by whitespace.` |
| 199 | 47 | `'{' is not preceded with whitespace.` |
| 200 | 34 | `'=' is not followed by whitespace.` |
| 200 | 34 | `'=' is not preceded with whitespace.` |
| 204 | 9 | `'for' is not followed by whitespace.` |
| 204 | 18 | `'=' is not followed by whitespace.` |
| 204 | 18 | `'=' is not preceded with whitespace.` |
| 204 | 20 | `';' is not followed by whitespace.` |
| 204 | 22 | `'<' is not followed by whitespace.` |
| 204 | 22 | `'<' is not preceded with whitespace.` |
| 204 | 43 | `';' is not followed by whitespace.` |
| 204 | 48 | `'{' is not preceded with whitespace.` |
| 205 | 13 | `'for' is not followed by whitespace.` |
| 205 | 22 | `'=' is not followed by whitespace.` |
| 205 | 22 | `'=' is not preceded with whitespace.` |
| 205 | 24 | `';' is not followed by whitespace.` |
| 205 | 26 | `'<' is not followed by whitespace.` |
| 205 | 26 | `'<' is not preceded with whitespace.` |
| 205 | 47 | `';' is not followed by whitespace.` |
| 205 | 52 | `'{' is not preceded with whitespace.` |
| 206 |  | `Line is longer than 100 characters (found 137).` |
| 209 | 28 | `'=' is not followed by whitespace.` |
| 209 | 28 | `'=' is not preceded with whitespace.` |
| 211 | 9 | `'for' is not followed by whitespace.` |
| 211 | 18 | `'=' is not followed by whitespace.` |
| 211 | 18 | `'=' is not preceded with whitespace.` |
| 211 | 20 | `';' is not followed by whitespace.` |
| 211 | 22 | `'<' is not followed by whitespace.` |
| 211 | 22 | `'<' is not preceded with whitespace.` |
| 211 | 38 | `';' is not followed by whitespace.` |
| 211 | 43 | `'{' is not preceded with whitespace.` |
| 212 | 13 | `'for' is not followed by whitespace.` |
| 212 | 22 | `'=' is not followed by whitespace.` |
| 212 | 22 | `'=' is not preceded with whitespace.` |
| 212 | 24 | `';' is not followed by whitespace.` |
| 212 | 26 | `'<' is not followed by whitespace.` |
| 212 | 26 | `'<' is not preceded with whitespace.` |
| 212 | 42 | `';' is not followed by whitespace.` |
| 212 | 47 | `'{' is not preceded with whitespace.` |
| 213 | 66 | `'+' is not followed by whitespace.` |
| 213 | 66 | `'+' is not preceded with whitespace.` |
| 224 | 22 | `Name 'UserOutput' must match pattern '^([A-Z][0-9]*|[a-z][a-zA-Z0-9]*)$'.` |
| 224 | 32 | `'=' is not followed by whitespace.` |
| 224 | 32 | `'=' is not preceded with whitespace.` |
| 225 | 9 | `'for' is not followed by whitespace.` |
| 225 | 18 | `'=' is not followed by whitespace.` |
| 225 | 18 | `'=' is not preceded with whitespace.` |
| 225 | 20 | `';' is not followed by whitespace.` |
| 225 | 22 | `'<' is not followed by whitespace.` |
| 225 | 22 | `'<' is not preceded with whitespace.` |
| 225 | 43 | `';' is not followed by whitespace.` |
| 225 | 48 | `'{' is not preceded with whitespace.` |
| 239 | 9 | `'if' is not followed by whitespace.` |
| 239 | 37 | `'==' is not followed by whitespace.` |
| 239 | 37 | `'==' is not preceded with whitespace.` |
| 239 | 37 | `Expression can be simplified.` |
| 239 | 44 | `'||' is not followed by whitespace.` |
| 239 | 44 | `'||' is not preceded with whitespace.` |
| 239 | 73 | `'==' is not followed by whitespace.` |
| 239 | 73 | `'==' is not preceded with whitespace.` |
| 239 | 73 | `Expression can be simplified.` |
| 239 | 81 | `'{' is not preceded with whitespace.` |
| 255 | 18 | `Name 'ReportActivityInTimeWindow' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 256 | 33 | `'=' is not followed by whitespace.` |
| 256 | 33 | `'=' is not preceded with whitespace.` |
| 257 | 35 | `'=' is not followed by whitespace.` |
| 257 | 35 | `'=' is not preceded with whitespace.` |
| 258 | 30 | `'=' is not followed by whitespace.` |
| 259 | 25 | `'=' is not followed by whitespace.` |
| 259 | 35 | `'<' is not followed by whitespace.` |
| 259 | 35 | `'<' is not preceded with whitespace.` |
| 259 | 73 | `'{' is not preceded with whitespace.` |
| 260 | 31 | `'=' is not followed by whitespace.` |
| 260 | 43 | `'<' is not followed by whitespace.` |
| 260 | 43 | `'<' is not preceded with whitespace.` |
| 260 | 83 | `'{' is not preceded with whitespace.` |
| 261 | 17 | `'if' is not followed by whitespace.` |
| 261 | 64 | `'>' is not followed by whitespace.` |
| 261 | 64 | `'>' is not preceded with whitespace.` |
| 261 | 67 | `'{' is not preceded with whitespace.` |
| 263 | 21 | `'for' is not followed by whitespace.` |
| 263 | 30 | `'=' is not followed by whitespace.` |
| 263 | 30 | `'=' is not preceded with whitespace.` |
| 263 | 35 | `'<' is not preceded with whitespace.` |
| 263 | 87 | `'{' is not preceded with whitespace.` |
| 264 |  | `Line is longer than 100 characters (found 163).` |
| 264 | 25 | `'if' is not followed by whitespace.` |
| 264 | 32 | `'typecast' is not followed by whitespace.` |
| 264 | 77 | `'>=' is not preceded with whitespace.` |
| 264 | 101 | `'typecast' is not followed by whitespace.` |
| 264 | 146 | `'<=' is not preceded with whitespace.` |
| 264 | 163 | `'{' is not preceded with whitespace.` |
| 275 | 43 | `',' is not followed by whitespace.` |
| 275 | 64 | `',' is not followed by whitespace.` |
| 289 | 18 | `Name 'ReportOnUser' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 290 | 22 | `'=' is not followed by whitespace.` |
| 290 | 22 | `'=' is not preceded with whitespace.` |
| 291 | 25 | `'=' is not followed by whitespace.` |
| 291 | 25 | `'=' is not preceded with whitespace.` |
| 292 | 33 | `'=' is not followed by whitespace.` |
| 292 | 33 | `'=' is not preceded with whitespace.` |
| 296 | 9 | `'if' is not followed by whitespace.` |
| 296 | 37 | `'==' is not followed by whitespace.` |
| 296 | 37 | `'==' is not preceded with whitespace.` |
| 296 | 37 | `Expression can be simplified.` |
| 296 | 45 | `'{' is not preceded with whitespace.` |
| 297 | 31 | `',' is not followed by whitespace.` |
| 297 | 33 | `',' is not followed by whitespace.` |
| 300 | 27 | `'=' is not followed by whitespace.` |
| 300 | 39 | `'<' is not followed by whitespace.` |
| 300 | 39 | `'<' is not preceded with whitespace.` |
| 307 | 25 | `'=' is not followed by whitespace.` |
| 307 | 35 | `'<' is not followed by whitespace.` |
| 307 | 35 | `'<' is not preceded with whitespace.` |
| 307 | 73 | `'{' is not preceded with whitespace.` |
| 314 | 34 | `',' is not followed by whitespace.` |
| 314 | 47 | `',' is not followed by whitespace.` |
| 326 | 16 | `Name 'NthMostActiveUser' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 327 | 11 | `Comment matches to-do format 'TODO:'.` |
| 328 | 9 | `'if' is not followed by whitespace.` |
| 328 | 27 | `'==' is not followed by whitespace.` |
| 328 | 27 | `'==' is not preceded with whitespace.` |
| 328 | 51 | `'{' is not preceded with whitespace.` |
| 329 | 21 | `Name 'Ranking' must match pattern '^([A-Z][0-9]*|[a-z][a-zA-Z0-9]*)$'.` |
| 329 | 28 | `'=' is not followed by whitespace.` |
| 329 | 28 | `'=' is not preceded with whitespace.` |
| 331 | 13 | `'for' is not followed by whitespace.` |
| 331 | 22 | `'=' is not followed by whitespace.` |
| 331 | 22 | `'=' is not preceded with whitespace.` |
| 331 | 24 | `';' is not followed by whitespace.` |
| 331 | 26 | `'<' is not followed by whitespace.` |
| 331 | 26 | `'<' is not preceded with whitespace.` |
| 331 | 42 | `';' is not followed by whitespace.` |
| 331 | 47 | `'{' is not preceded with whitespace.` |
| 332 | 23 | `Name 'UserReport' must match pattern '^([A-Z][0-9]*|[a-z][a-zA-Z0-9]*)$'.` |
| 332 | 33 | `'=' is not followed by whitespace.` |
| 332 | 33 | `'=' is not preceded with whitespace.` |
| 333 | 30 | `'=' is not followed by whitespace.` |
| 333 | 30 | `'=' is not preceded with whitespace.` |
| 334 | 30 | `'=' is not followed by whitespace.` |
| 334 | 30 | `'=' is not preceded with whitespace.` |
| 338 | 34 | `'-' is not followed by whitespace.` |
| 338 | 34 | `'-' is not preceded with whitespace.` |
| 339 | 38 | `',' is not followed by whitespace.` |
| 342 | 13 | `'for' is not followed by whitespace.` |
| 342 | 22 | `'=' is not followed by whitespace.` |
| 342 | 22 | `'=' is not preceded with whitespace.` |
| 342 | 24 | `';' is not followed by whitespace.` |
| 342 | 26 | `'<' is not followed by whitespace.` |
| 342 | 26 | `'<' is not preceded with whitespace.` |
| 342 | 42 | `';' is not followed by whitespace.` |
| 342 | 47 | `'{' is not preceded with whitespace.` |
| 343 | 17 | `'for' is not followed by whitespace.` |
| 343 | 26 | `'=' is not followed by whitespace.` |
| 343 | 26 | `'=' is not preceded with whitespace.` |
| 343 | 28 | `';' is not followed by whitespace.` |
| 343 | 30 | `'<' is not followed by whitespace.` |
| 343 | 30 | `'<' is not preceded with whitespace.` |
| 343 | 32 | `';' is not followed by whitespace.` |
| 343 | 37 | `'{' is not preceded with whitespace.` |
| 344 | 51 | `'+' is not followed by whitespace.` |
| 344 | 51 | `'+' is not preceded with whitespace.` |
| 349 | 13 | `'if' is not followed by whitespace.` |
| 349 | 25 | `'-' is not followed by whitespace.` |
| 349 | 25 | `'-' is not preceded with whitespace.` |
| 349 | 31 | `'==' is not followed by whitespace.` |
| 349 | 31 | `'==' is not preceded with whitespace.` |
| 349 | 35 | `'{' is not preceded with whitespace.` |
| 351 | 13 | `'}' at column 13 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 352 | 13 | `'else' is not followed by whitespace.` |
| 352 | 17 | `'{' is not preceded with whitespace.` |
| 353 | 33 | `'-' is not followed by whitespace.` |
| 353 | 33 | `'-' is not preceded with whitespace.` |
| 355 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 357 | 14 | `'if' is not followed by whitespace.` |
| 357 | 32 | `'==' is not followed by whitespace.` |
| 357 | 32 | `'==' is not preceded with whitespace.` |
| 357 | 53 | `'{' is not preceded with whitespace.` |
| 358 | 21 | `Name 'Ranking' must match pattern '^([A-Z][0-9]*|[a-z][a-zA-Z0-9]*)$'.` |
| 358 | 28 | `'=' is not followed by whitespace.` |
| 358 | 28 | `'=' is not preceded with whitespace.` |
| 360 | 13 | `'for' is not followed by whitespace.` |
| 360 | 22 | `'=' is not followed by whitespace.` |
| 360 | 22 | `'=' is not preceded with whitespace.` |
| 360 | 24 | `';' is not followed by whitespace.` |
| 360 | 26 | `'<' is not followed by whitespace.` |
| 360 | 26 | `'<' is not preceded with whitespace.` |
| 360 | 42 | `';' is not followed by whitespace.` |
| 360 | 47 | `'{' is not preceded with whitespace.` |
| 361 | 23 | `Name 'UserReport' must match pattern '^([A-Z][0-9]*|[a-z][a-zA-Z0-9]*)$'.` |
| 361 | 33 | `'=' is not followed by whitespace.` |
| 361 | 33 | `'=' is not preceded with whitespace.` |
| 362 | 30 | `'=' is not followed by whitespace.` |
| 362 | 30 | `'=' is not preceded with whitespace.` |
| 363 | 30 | `'=' is not followed by whitespace.` |
| 363 | 30 | `'=' is not preceded with whitespace.` |
| 367 | 34 | `'-' is not followed by whitespace.` |
| 367 | 34 | `'-' is not preceded with whitespace.` |
| 368 | 38 | `',' is not followed by whitespace.` |
| 371 | 13 | `'for' is not followed by whitespace.` |
| 371 | 22 | `'=' is not followed by whitespace.` |
| 371 | 22 | `'=' is not preceded with whitespace.` |
| 371 | 24 | `';' is not followed by whitespace.` |
| 371 | 26 | `'<' is not followed by whitespace.` |
| 371 | 26 | `'<' is not preceded with whitespace.` |
| 371 | 42 | `';' is not followed by whitespace.` |
| 371 | 47 | `'{' is not preceded with whitespace.` |
| 372 | 17 | `'for' is not followed by whitespace.` |
| 372 | 26 | `'=' is not followed by whitespace.` |
| 372 | 26 | `'=' is not preceded with whitespace.` |
| 372 | 28 | `';' is not followed by whitespace.` |
| 372 | 30 | `'<' is not followed by whitespace.` |
| 372 | 30 | `'<' is not preceded with whitespace.` |
| 372 | 32 | `';' is not followed by whitespace.` |
| 372 | 37 | `'{' is not preceded with whitespace.` |
| 373 | 51 | `'+' is not followed by whitespace.` |
| 373 | 51 | `'+' is not preceded with whitespace.` |
| 378 | 13 | `'if' is not followed by whitespace.` |
| 378 | 25 | `'-' is not followed by whitespace.` |
| 378 | 25 | `'-' is not preceded with whitespace.` |
| 378 | 31 | `'==' is not followed by whitespace.` |
| 378 | 31 | `'==' is not preceded with whitespace.` |
| 378 | 35 | `'{' is not preceded with whitespace.` |
| 380 | 13 | `'}' at column 13 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 381 | 13 | `'else' is not followed by whitespace.` |
| 381 | 17 | `'{' is not preceded with whitespace.` |
| 382 | 33 | `'-' is not followed by whitespace.` |
| 382 | 33 | `'-' is not preceded with whitespace.` |
| 410 | 26 | `Name 'BFS' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 411 | 11 | `Comment matches to-do format 'TODO:'.` |
| 419 | 27 | `',' is not followed by whitespace.` |
| 419 | 38 | `',' is not followed by whitespace.` |
| 421 | 9 | `'if' is not followed by whitespace.` |
| 421 | 44 | `'-' is not followed by whitespace.` |
| 421 | 44 | `'-' is not preceded with whitespace.` |
| 421 | 47 | `'==' is not followed by whitespace.` |
| 421 | 47 | `'==' is not preceded with whitespace.` |
| 421 | 57 | `'{' is not preceded with whitespace.` |
| 430 | 18 | `Name 'BFS_helper' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 430 | 97 | `'{' is not preceded with whitespace.` |
| 434 | 9 | `'for' is not followed by whitespace.` |
| 434 | 18 | `'=' is not followed by whitespace.` |
| 434 | 18 | `'=' is not preceded with whitespace.` |
| 434 | 23 | `'<' is not followed by whitespace.` |
| 434 | 23 | `'<' is not preceded with whitespace.` |
| 434 | 47 | `'{' is not preceded with whitespace.` |
| 437 | 13 | `'for' is not followed by whitespace.` |
| 437 | 22 | `'=' is not followed by whitespace.` |
| 437 | 22 | `'=' is not preceded with whitespace.` |
| 437 | 27 | `'<' is not followed by whitespace.` |
| 437 | 27 | `'<' is not preceded with whitespace.` |
| 437 | 54 | `'{' is not preceded with whitespace.` |
| 438 | 44 | `'==' is not followed by whitespace.` |
| 438 | 44 | `'==' is not preceded with whitespace.` |
| 438 | 44 | `Expression can be simplified.` |
| 438 | 52 | `'{' is not preceded with whitespace.` |
| 439 |  | `Line is longer than 100 characters (found 102).` |
| 439 | 102 | `'{' is not preceded with whitespace.` |
| 449 | 13 | `'for' is not followed by whitespace.` |
| 449 | 22 | `'=' is not followed by whitespace.` |
| 449 | 22 | `'=' is not preceded with whitespace.` |
| 449 | 27 | `'<' is not followed by whitespace.` |
| 449 | 27 | `'<' is not preceded with whitespace.` |
| 449 | 45 | `'{' is not preceded with whitespace.` |
| 450 | 17 | `'if' is not followed by whitespace.` |
| 450 | 52 | `'==' is not followed by whitespace.` |
| 450 | 52 | `'==' is not preceded with whitespace.` |
| 450 | 52 | `Expression can be simplified.` |
| 450 | 60 | `'{' is not preceded with whitespace.` |
| 452 | 21 | `'if' is not followed by whitespace.` |
| 452 | 35 | `'==' is not followed by whitespace.` |
| 452 | 35 | `'==' is not preceded with whitespace.` |
| 452 | 44 | `'{' is not preceded with whitespace.` |
| 456 | 17 | `'if' is not followed by whitespace.` |
| 456 | 50 | `'==' is not followed by whitespace.` |
| 456 | 50 | `'==' is not preceded with whitespace.` |
| 456 | 50 | `Expression can be simplified.` |
| 456 | 58 | `'{' is not preceded with whitespace.` |
| 460 | 13 | `'if' is not followed by whitespace.` |
| 460 | 31 | `'==' is not followed by whitespace.` |
| 460 | 31 | `'==' is not preceded with whitespace.` |
| 460 | 35 | `'{' is not preceded with whitespace.` |
| 466 | 26 | `',' is not followed by whitespace.` |
| 466 | 35 | `',' is not followed by whitespace.` |
| 478 | 26 | `Name 'DFS' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 480 | 31 | `'=' is not followed by whitespace.` |
| 480 | 31 | `'=' is not preceded with whitespace.` |
| 482 | 32 | `'=' is not followed by whitespace.` |
| 482 | 32 | `'=' is not preceded with whitespace.` |
| 484 | 26 | `',' is not followed by whitespace.` |
| 484 | 34 | `',' is not followed by whitespace.` |
| 484 | 42 | `',' is not followed by whitespace.` |
| 487 | 36 | `'{' is not preceded with whitespace.` |
| 489 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 490 | 9 | `'else' construct must use '{}'s.` |
| 492 | 18 | `Name 'DFSrecursion' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 492 | 54 | `',' is not followed by whitespace.` |
| 492 | 59 | `Name 'ID1' must match pattern '^([A-Z][0-9]*|[a-z][a-zA-Z0-9]*)$'.` |
| 492 | 62 | `',' is not followed by whitespace.` |
| 492 | 67 | `Name 'ID2' must match pattern '^([A-Z][0-9]*|[a-z][a-zA-Z0-9]*)$'.` |
| 492 | 70 | `',' is not followed by whitespace.` |
| 492 | 86 | `'{' is not preceded with whitespace.` |
| 493 | 37 | `'=' is not followed by whitespace.` |
| 493 | 37 | `'=' is not preceded with whitespace.` |
| 495 |  | `Line is longer than 100 characters (found 106).` |
| 500 | 9 | `'if' is not followed by whitespace.` |
| 500 | 28 | `'==' is not followed by whitespace.` |
| 500 | 28 | `'==' is not preceded with whitespace.` |
| 500 | 32 | `'{' is not preceded with whitespace.` |
| 523 | 16 | `Name 'MaxBreachedUserCount' must match pattern '^[a-z][a-zA-Z0-9]*$'.` |
| 524 | 20 | `'=' is not followed by whitespace.` |
| 524 | 20 | `'=' is not preceded with whitespace.` |
| 525 | 32 | `'=' is not followed by whitespace.` |
| 525 | 32 | `'=' is not preceded with whitespace.` |
| 526 | 9 | `'for' is not followed by whitespace.` |
| 526 | 18 | `'=' is not followed by whitespace.` |
| 526 | 18 | `'=' is not preceded with whitespace.` |
| 526 | 20 | `';' is not followed by whitespace.` |
| 526 | 22 | `'<' is not followed by whitespace.` |
| 526 | 22 | `'<' is not preceded with whitespace.` |
| 526 | 38 | `';' is not followed by whitespace.` |
| 526 | 43 | `'{' is not preceded with whitespace.` |
| 527 | 13 | `'for' is not followed by whitespace.` |
| 527 | 22 | `'=' is not followed by whitespace.` |
| 527 | 22 | `'=' is not preceded with whitespace.` |
| 527 | 24 | `';' is not followed by whitespace.` |
| 527 | 26 | `'<' is not followed by whitespace.` |
| 527 | 26 | `'<' is not preceded with whitespace.` |
| 527 | 42 | `';' is not followed by whitespace.` |
| 527 | 47 | `'{' is not preceded with whitespace.` |
| 528 | 17 | `'if' is not followed by whitespace.` |
| 528 | 47 | `'>' is not followed by whitespace.` |
| 528 | 47 | `'>' is not preceded with whitespace.` |
| 528 | 50 | `'{' is not preceded with whitespace.` |
| 529 | 21 | `'for' is not followed by whitespace.` |
| 529 | 40 | `'=' is not followed by whitespace.` |
| 529 | 40 | `'=' is not preceded with whitespace.` |
| 529 | 42 | `';' is not followed by whitespace.` |
| 529 | 54 | `'<' is not followed by whitespace.` |
| 529 | 54 | `'<' is not preceded with whitespace.` |
| 529 | 82 | `';' is not followed by whitespace.` |
| 529 | 97 | `'{' is not preceded with whitespace.` |
| 530 | 34 | `'=' is not followed by whitespace.` |
| 530 | 34 | `'=' is not preceded with whitespace.` |
| 531 | 33 | `'=' is not preceded with whitespace.` |
| 532 | 49 | `'=' is not followed by whitespace.` |
| 532 | 49 | `'=' is not preceded with whitespace.` |
| 536 |  | `Line is longer than 100 characters (found 118).` |
| 537 | 36 | `'(' is followed by whitespace.` |
| 537 | 43 | `',' is not followed by whitespace.` |
| 537 | 48 | `',' is not followed by whitespace.` |
| 537 | 54 | `',' is not followed by whitespace.` |
| 537 | 55 | `'3600' is a magic number.` |
| 537 | 59 | `'*' is not followed by whitespace.` |
| 537 | 59 | `'*' is not preceded with whitespace.` |
| 537 | 65 | `'+' is not followed by whitespace.` |
| 537 | 65 | `'+' is not preceded with whitespace.` |
| 538 | 36 | `'(' is followed by whitespace.` |
| 538 | 53 | `',' is not followed by whitespace.` |
| 538 | 58 | `',' is not followed by whitespace.` |
| 538 | 64 | `',' is not followed by whitespace.` |
| 538 | 65 | `'3600' is a magic number.` |
| 538 | 69 | `'*' is not followed by whitespace.` |
| 538 | 69 | `'*' is not preceded with whitespace.` |
| 538 | 75 | `'+' is not followed by whitespace.` |
| 538 | 75 | `'+' is not preceded with whitespace.` |
| 541 | 25 | `'if' is not followed by whitespace.` |
| 541 | 40 | `'>' is not followed by whitespace.` |
| 541 | 40 | `'>' is not preceded with whitespace.` |
| 541 | 49 | `'{' is not preceded with whitespace.` |
| 542 | 36 | `'=' is not followed by whitespace.` |
| 542 | 36 | `'=' is not preceded with whitespace.` |
| 555 | 48 | `',' is not followed by whitespace.` |
| 556 | 9 | `'for' is not followed by whitespace.` |
| 556 | 18 | `'=' is not followed by whitespace.` |
| 556 | 18 | `'=' is not preceded with whitespace.` |
| 556 | 20 | `';' is not followed by whitespace.` |
| 556 | 22 | `'<' is not followed by whitespace.` |
| 556 | 22 | `'<' is not preceded with whitespace.` |
| 556 | 38 | `';' is not followed by whitespace.` |
| 556 | 43 | `'{' is not preceded with whitespace.` |
| 557 |  | `Line is longer than 100 characters (found 108).` |
| 557 | 13 | `'if' is not followed by whitespace.` |
| 557 | 65 | `'>' is not followed by whitespace.` |
| 557 | 65 | `'>' is not preceded with whitespace.` |
| 557 | 67 | `'&&' is not followed by whitespace.` |
| 557 | 67 | `'&&' is not preceded with whitespace.` |
| 557 | 100 | `'==' is not followed by whitespace.` |
| 557 | 100 | `'==' is not preceded with whitespace.` |
| 557 | 100 | `Expression can be simplified.` |
| 557 | 108 | `'{' is not preceded with whitespace.` |
| 558 |  | `Line is longer than 100 characters (found 115).` |
| 558 | 17 | `'for' is not followed by whitespace.` |
| 558 | 36 | `'=' is not followed by whitespace.` |
| 558 | 36 | `'=' is not preceded with whitespace.` |
| 558 | 38 | `';' is not followed by whitespace.` |
| 558 | 50 | `'<' is not followed by whitespace.` |
| 558 | 50 | `'<' is not preceded with whitespace.` |
| 558 | 100 | `';' is not followed by whitespace.` |
| 558 | 115 | `'{' is not preceded with whitespace.` |
| 559 |  | `Line is longer than 100 characters (found 144).` |
| 560 |  | `Line is longer than 100 characters (found 167).` |
| 560 | 21 | `'if' is not followed by whitespace.` |
| 560 | 28 | `'typecast' is not followed by whitespace.` |
| 560 | 88 | `'>' is not followed by whitespace.` |
| 560 | 88 | `'>' is not preceded with whitespace.` |
| 560 | 93 | `'&&' is not followed by whitespace.` |
| 560 | 93 | `'&&' is not preceded with whitespace.` |
| 560 | 99 | `'typecast' is not followed by whitespace.` |
| 560 | 159 | `'<=' is not followed by whitespace.` |
| 560 | 159 | `'<=' is not preceded with whitespace.` |
| 560 | 167 | `'{' is not preceded with whitespace.` |
| 561 |  | `Line is longer than 100 characters (found 165).` |
| 562 | 25 | `'if' is not followed by whitespace.` |
| 562 | 59 | `'==' is not followed by whitespace.` |
| 562 | 59 | `'==' is not preceded with whitespace.` |
| 562 | 59 | `Expression can be simplified.` |
| 562 | 67 | `'{' is not preceded with whitespace.` |
| 565 |  | `Line is longer than 100 characters (found 133).` |
| 565 | 52 | `',' is not followed by whitespace.` |
### `SendOrReceive.java`
| Line | Column | Message |
| ---- | ------ | ------- |
### `UDWInteractionGraph.java`
| Line | Column | Message |
| ---- | ------ | ------- |
| 6 | 17 | `Using the '.*' form of import should be avoided - java.util.*.` |
| 13 | 40 | `'=' is not followed by whitespace.` |
| 13 | 40 | `'=' is not preceded with whitespace.` |
| 17 | 59 | `',' is not followed by whitespace.` |
| 17 | 85 | `'{' is not preceded with whitespace.` |
| 18 | 33 | `'=' is not followed by whitespace.` |
| 18 | 33 | `'=' is not preceded with whitespace.` |
| 26 |  | `Line is longer than 100 characters (found 135).` |
| 26 | 17 | `'if' is not followed by whitespace.` |
| 26 | 61 | `'<=' is not followed by whitespace.` |
| 26 | 61 | `'<=' is not preceded with whitespace.` |
| 26 | 76 | `'&&' is not followed by whitespace.` |
| 26 | 76 | `'&&' is not preceded with whitespace.` |
| 26 | 119 | `'>=' is not followed by whitespace.` |
| 26 | 119 | `'>=' is not preceded with whitespace.` |
| 26 | 135 | `'{' is not preceded with whitespace.` |
| 27 | 31 | `'=' is not followed by whitespace.` |
| 27 | 31 | `'=' is not preceded with whitespace.` |
| 28 | 33 | `'=' is not followed by whitespace.` |
| 28 | 33 | `'=' is not preceded with whitespace.` |
| 29 |  | `Line is longer than 100 characters (found 152).` |
| 29 | 21 | `'if' is not followed by whitespace.` |
| 29 | 46 | `'==' is not followed by whitespace.` |
| 29 | 46 | `'==' is not preceded with whitespace.` |
| 29 | 46 | `Expression can be simplified.` |
| 29 | 53 | `'&&' is not followed by whitespace.` |
| 29 | 53 | `'&&' is not preceded with whitespace.` |
| 29 | 86 | `'==' is not followed by whitespace.` |
| 29 | 86 | `'==' is not preceded with whitespace.` |
| 29 | 86 | `Expression can be simplified.` |
| 29 | 92 | `'||' is not followed by whitespace.` |
| 29 | 92 | `'||' is not preceded with whitespace.` |
| 29 | 121 | `'==' is not followed by whitespace.` |
| 29 | 121 | `'==' is not preceded with whitespace.` |
| 29 | 121 | `Expression can be simplified.` |
| 29 | 128 | `'||' is not followed by whitespace.` |
| 29 | 128 | `'||' is not preceded with whitespace.` |
| 29 | 147 | `'==' is not followed by whitespace.` |
| 29 | 147 | `'==' is not preceded with whitespace.` |
| 29 | 152 | `'{' is not preceded with whitespace.` |
| 31 | 25 | `'if' is not followed by whitespace.` |
| 31 | 52 | `'==' is not followed by whitespace.` |
| 31 | 52 | `'==' is not preceded with whitespace.` |
| 31 | 52 | `Expression can be simplified.` |
| 31 | 60 | `'{' is not preceded with whitespace.` |
| 35 |  | `Line is longer than 100 characters (found 154).` |
| 35 | 21 | `'if' is not followed by whitespace.` |
| 35 | 48 | `'==' is not followed by whitespace.` |
| 35 | 48 | `'==' is not preceded with whitespace.` |
| 35 | 48 | `Expression can be simplified.` |
| 35 | 55 | `'&&' is not followed by whitespace.` |
| 35 | 55 | `'&&' is not preceded with whitespace.` |
| 35 | 88 | `'==' is not followed by whitespace.` |
| 35 | 88 | `'==' is not preceded with whitespace.` |
| 35 | 88 | `Expression can be simplified.` |
| 35 | 94 | `'||' is not followed by whitespace.` |
| 35 | 94 | `'||' is not preceded with whitespace.` |
| 35 | 123 | `'==' is not followed by whitespace.` |
| 35 | 123 | `'==' is not preceded with whitespace.` |
| 35 | 123 | `Expression can be simplified.` |
| 35 | 130 | `'||' is not followed by whitespace.` |
| 35 | 130 | `'||' is not preceded with whitespace.` |
| 35 | 149 | `'==' is not followed by whitespace.` |
| 35 | 149 | `'==' is not preceded with whitespace.` |
| 35 | 154 | `'{' is not preceded with whitespace.` |
| 37 | 25 | `'if' is not followed by whitespace.` |
| 37 | 50 | `'==' is not followed by whitespace.` |
| 37 | 50 | `'==' is not preceded with whitespace.` |
| 37 | 50 | `Expression can be simplified.` |
| 37 | 58 | `'{' is not preceded with whitespace.` |
| 45 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 49 | 42 | `'+' is not followed by whitespace.` |
| 49 | 42 | `'+' is not preceded with whitespace.` |
| 49 | 55 | `'+' is not followed by whitespace.` |
| 49 | 55 | `'+' is not preceded with whitespace.` |
| 49 | 62 | `'+' is not followed by whitespace.` |
| 49 | 62 | `'+' is not preceded with whitespace.` |
| 61 | 22 | `'=' is not followed by whitespace.` |
| 61 | 22 | `'=' is not preceded with whitespace.` |
| 62 | 22 | `'=' is not followed by whitespace.` |
| 62 | 22 | `'=' is not preceded with whitespace.` |
| 62 | 45 | `',' is not followed by whitespace.` |
| 64 | 9 | `'for' is not followed by whitespace.` |
| 64 | 18 | `'=' is not followed by whitespace.` |
| 64 | 18 | `'=' is not preceded with whitespace.` |
| 64 | 20 | `';' is not followed by whitespace.` |
| 64 | 22 | `'<' is not followed by whitespace.` |
| 64 | 22 | `'<' is not preceded with whitespace.` |
| 64 | 38 | `';' is not followed by whitespace.` |
| 64 | 43 | `'{' is not preceded with whitespace.` |
| 65 | 13 | `'for' is not followed by whitespace.` |
| 65 | 22 | `'=' is not followed by whitespace.` |
| 65 | 22 | `'=' is not preceded with whitespace.` |
| 65 | 24 | `';' is not followed by whitespace.` |
| 65 | 26 | `'<' is not followed by whitespace.` |
| 65 | 26 | `'<' is not preceded with whitespace.` |
| 65 | 42 | `';' is not followed by whitespace.` |
| 65 | 47 | `'{' is not preceded with whitespace.` |
| 66 | 34 | `'=' is not followed by whitespace.` |
| 66 | 34 | `'=' is not preceded with whitespace.` |
| 76 | 27 | `'=' is not followed by whitespace.` |
| 76 | 27 | `'=' is not preceded with whitespace.` |
| 77 | 29 | `'=' is not followed by whitespace.` |
| 77 | 29 | `'=' is not preceded with whitespace.` |
| 78 | 30 | `'=' is not followed by whitespace.` |
| 78 | 30 | `'=' is not preceded with whitespace.` |
| 80 | 17 | `'if' is not followed by whitespace.` |
| 80 | 44 | `'!=' is not followed by whitespace.` |
| 80 | 44 | `'!=' is not preceded with whitespace.` |
| 80 | 73 | `'{' is not preceded with whitespace.` |
| 81 |  | `Line is longer than 100 characters (found 101).` |
| 85 | 9 | `'}' at column 9 should be on the same line as the next part of a multi-block statement (one that directly contains multiple blocks: if/else-if/else, do/while or try/catch/finally).` |
| 89 | 28 | `'=' is not followed by whitespace.` |
| 89 | 28 | `'=' is not preceded with whitespace.` |
| 91 | 9 | `'for' is not followed by whitespace.` |
| 91 | 18 | `'=' is not followed by whitespace.` |
| 91 | 18 | `'=' is not preceded with whitespace.` |
| 91 | 20 | `';' is not followed by whitespace.` |
| 91 | 22 | `'<' is not followed by whitespace.` |
| 91 | 22 | `'<' is not preceded with whitespace.` |
| 91 | 38 | `';' is not followed by whitespace.` |
| 91 | 43 | `'{' is not preceded with whitespace.` |
| 92 | 13 | `'for' is not followed by whitespace.` |
| 92 | 22 | `'=' is not followed by whitespace.` |
| 92 | 22 | `'=' is not preceded with whitespace.` |
| 92 | 24 | `';' is not followed by whitespace.` |
| 92 | 26 | `'<' is not followed by whitespace.` |
| 92 | 26 | `'<' is not preceded with whitespace.` |
| 92 | 42 | `';' is not followed by whitespace.` |
| 92 | 47 | `'{' is not preceded with whitespace.` |
| 93 | 66 | `'+' is not followed by whitespace.` |
| 93 | 66 | `'+' is not preceded with whitespace.` |
| 111 | 22 | `'=' is not followed by whitespace.` |
| 111 | 22 | `'=' is not preceded with whitespace.` |
| 112 | 22 | `'=' is not followed by whitespace.` |
| 112 | 22 | `'=' is not preceded with whitespace.` |
| 112 | 44 | `',' is not followed by whitespace.` |
| 113 | 36 | `'=' is not
