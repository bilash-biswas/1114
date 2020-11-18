package main

import (
	"fmt"
)

func main() {
	var a int
bilash:
	fmt.Scan(&a)
	for a != 2002 {
		fmt.Printf("Senha Invalida\n")
		goto bilash
	}
	fmt.Printf("Acesso Permitido\n")
}
