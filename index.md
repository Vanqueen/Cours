### Exercice 3

Compter le nombre de doublons
Écrivez une fonction qui renverra le nombre de caractères alphabétiques distincts, insensibles à la casse, et de chiffres numériques qui apparaissent plusieurs fois dans la chaîne d'entrée. On peut supposer que la chaîne d'entrée contient uniquement des lettres (majuscules et minuscules) et des chiffres numériques.

Exemple
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 `# 'a' and 'b'`
"aabBcde" -> 2 ` # 'a' occurs twice and 'b' twice (`b` and `B`)`
"indivisibilité" -> 1 ` # 'i' occurs six times`
"Indivisibilités" -> 2 `# 'i' occurs seven times and 's' occurs twice`
"aA11" -> 2 `# 'a' and '1'`
"ABBA" -> 2  `# 'A' and 'B' each occur twice`

```php
function duplicateCount($text) {
  // ...code
}
````
