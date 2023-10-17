<?php
$ch=$_POST['op'];
$a=array(1,3,4,2);
switch($ch)
{
    case 1:
        print_r($a);
        array_push($a,10);
        echo "<br>After insert<br>";
        print_r($a);
        break;
    case 2:
        print_r($a);
        array_pop($a);
        echo "<br>After delete<br>";
        print_r($a);
        break;
    case 3:
        print_r($a);
        break;  
    case 4:
        print_r($a);
        array_unshift($a,10);
        echo "<br>After insert<br>";
        print_r($a);
        break; 
    case 5:
        print_r($a);
        array_shift($a);
        echo "<br>After delete<br>";
        print_r($a);
        break;  
    case 6:
        print_r($a);
        break;               

}
?>