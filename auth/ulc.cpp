bool validateUserLogin() {
    std::string username, password;
    std::cout << "Enter your username: ";
    std::cin >> username;
    std::cout << "Enter your password: ";
    std::cin >> password;
    std::string passwordHash = sha256(password); // hash the entered password using SHA256
    std::ifstream file("user_accounts.txt"); // open file in read mode
    std::string line;
    while (std::getline(file, line)) { // loop through each line in the file
        std::istringstream iss(line);
        std::string storedUsername, storedPasswordHash;
        if (std::getline(iss, storedUsername, ':') && std::getline(iss, storedPasswordHash)) { // parse username and hashed password from line
            if (username == storedUsername && passwordHash == storedPasswordHash) { // check if entered username and hashed password match stored values
                std::cout << "Login successful.\n";
                return true;
            }
        }
    }
    std::cout << "Invalid username or password.\n";
    return false;
}
