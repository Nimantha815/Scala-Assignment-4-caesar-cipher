object caesar_cipher extends{

	def main(args:Array[String]){
	
	val n= encrypt()
	val m= decrypt()	
}

	def encrypt():Unit={
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val shift = (scala.io.StdIn.readLine("Number of shift: ").toInt + alphabet.size) % alphabet.size
	val inputText = scala.io.StdIn.readLine("Secret Message: ")
	val outputText = inputText.map( (c: Char) => {
		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});
	println("Encrypted Message:"+outputText);

}

	
	def decrypt():Unit={
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val shift1 = (scala.io.StdIn.readLine("Number of shift: ").toInt + alphabet.size) % alphabet.size
	val inputText1 = scala.io.StdIn.readLine("Encripted Message: ")
	val outputText1 = inputText1.map( (c: Char) => {
		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x - shift1) % alphabet.size)
			} 
	});
	println("Secret Message:"+outputText1);

}
	


	
}
