# language: ru
Функция: : Отправка формы с введёнными значениями

  Сценарий: Проверить функциональность заполнения формы с введёнными значениями

    Дано Пользователь находится на странице с формой
    Когда Пользователь вводит Имя и Фамилию
    И вводит почтовый адресс
    И выбирает Пол
    И вводит номер мобильного телефона
    И вводит Дату рождения
    И выбирает хобби
    И заполняет адресс
    Тогда нажать кнопку Submit для отправки формы
    Затем проверить правильность введённых значений в форме