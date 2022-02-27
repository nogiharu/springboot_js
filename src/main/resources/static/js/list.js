// 「id="form"」の値をとってくる
const form = document.getElementById("form")
// 「id="input"」の値をとってくる
const input = document.getElementById("input")
// 「id="ul"」の値をとってくる
const ul = document.getElementById("ul")
// formタグ内で"submit"された時の処理
form.addEventListener("submit",
    (e) => {
        //"submit"時のリロードをオフ
        e.preventDefault()
        add()
    })

add = () => {
    /* let todoText
    if (condition) {
        
    } */
    // liタグを生成
    const li = document.createElement("li")
    // liのテキスト属性に入力値を代入
    li.innerText = input.value
    // bootstrapを指定
    li.classList.add("list-group-item")
    // ulにliを追加
    ul.appendChild(li)
    input.value = ""
}



js = (name,age) => {
    let message = name + "さん" + age +"歳です"
    alert(message)
}