<?php
$ch=$_POST['op'];
$fp=fopen("item.dat","r");
$s=stat("item.dat");
switch($ch)
{
    case 1:
        $f=filesize($fp,2);
        echo "file type : $f";
        break;
}
?>