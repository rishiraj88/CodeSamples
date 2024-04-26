mkdir hellodjangoproj
cd hellodjangoproj
python -m venv venv
source venv/Scripts/activate
pip install django djangorestframework
django-admin startproject hello_django .
django-admin startapp hello
python manage.py runserver
