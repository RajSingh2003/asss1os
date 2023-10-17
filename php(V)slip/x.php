<!DOCTYPE html>
<html>
<head>
    <title>String Operations</title>
</head>
<body>
    <h1>String Operations</h1>
    <form method="post">
        <label for="bigString">Enter a sentence (big string):</label>
        <input type="text" name="bigString" required><br><br>

        <label for="smallString">Enter a word (small string):</label>
        <input type="text" name="smallString" required><br><br>

        <label>Choose an operation:</label><br>
        <input type="radio" name="operation" value="a"> Delete a small part from the big string<br>
        <input type="radio" name="operation" value="b"> Insert the small string in the big string<br>
        <input type="radio" name="operation" value="c"> Replace characters/words in the big string<br>
        <input type="radio" name="operation" value="d"> Replace all characters from a position onward<br><br>

        <label for="position">Position:</label>
        <input type="number" name="position" required><br><br>

        <label for="numChars">Number of characters (for operation a):</label>
        <input type="number" name="numChars"><br><br>

        <input type="submit" value="Submit">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $bigString = $_POST["bigString"];
        $smallString = $_POST["smallString"];
        $operation = $_POST["operation"];
        $position = $_POST["position"];

        if ($operation === 'a') {
            $numChars = $_POST["numChars"];
            $result = substr_replace($bigString, '', $position, $numChars);
        } elseif ($operation === 'b') {
            $result = substr_replace($bigString, $smallString, $position, 0);
        } elseif ($operation === 'c') {
            $search = readline("Enter the characters/words to be replaced in the big string: ");
            $result = str_replace($search, $smallString, $bigString);
        } elseif ($operation === 'd') {
            $result = substr_replace($bigString, $smallString, $position);
        } else {
            $result = "Invalid choice. Please choose a valid operation (a/b/c/d).";
        }
        echo "<p>Result: $result</p>";
    }
    ?>
</body>
</html>