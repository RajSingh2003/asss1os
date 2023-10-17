<?php

if($_SERVER['REQUEST_METHOD']=='POST')
{
    $s1=$_POST['s1'];
    $s2=$_POST['s2'];
    $ch=$_POST['op'];

function smlr($s1,$s2)
{
    $pos=strpos($s1,$s2);
    if($pos === 0)
    {
        echo "String $s2 is found at start and its position is :".($pos+1);
    }
    else
        echo "String $s2 is not found at starting position";
    
}
function poss($s1,$s2)
{
    $pos=strpos($s1,$s2);
    if($pos !== false)
    {
        echo "String $s2 is found at pos :".($pos+1);
    }
    else
       echo "String $s2 is not found";
}
function com($s1,$s2)
{
    $pos=strncasecmp($s1,$s2,10);
    if($pos == 0)
    {
        echo "String Equal";
    }
    else
       echo "String  not equal";

}

switch($ch)
{
    case 1:
        smlr($s1,$s2);
        break;
    case 2:
        poss($s1,$s2);
         break;
    case 3:
        com($s1,$s2);
        break;               
}

}
?>