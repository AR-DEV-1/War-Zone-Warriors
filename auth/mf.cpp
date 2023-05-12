int main() {
    std::cout << "Welcome to War Zone Warriors.\n";
    std::cout << "Do you want to create a new account (1) or log in with an existing account (2)? ";
    int choice;
    std::cin >> choice;
    switch (choice) {
        case 1:
            createUserAccount();
            break;
        case 2:
            validateUserLogin();
            break;
        default:
            std::cout << "Invalid choice.\n";
            break;
    }
    return 0;
}
