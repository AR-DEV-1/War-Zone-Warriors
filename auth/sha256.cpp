#include "sha256.h" // include SHA256 header file

void createUserAccount() {
    std::string username, password;
    std::cout << "Enter a username: ";
    std::cin >> username;
    std::cout << "Enter a password: ";
    std::cin >> password;
    std::string passwordHash = sha256(password); // hash the password using SHA256
    std::ofstream file("user_accounts.txt", std::ios::app); // open file in append mode
    file << username << ":" << passwordHash << std::endl; // write username and hashed password to file
    std::cout << "User account created successfully.\n";
}
