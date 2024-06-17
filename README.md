This is RestApi where we have /api/user/register and /api/user/fetch endpoints.
/api/user/register endpoint will take a Jason body and store that in ArrayList of type User where User is a model class.
/api/user/fetch endpoint will take query parameter which matches to Users username and according to that parameter it will show the user.
If user is not present into arrayList it will simply return null with status code
