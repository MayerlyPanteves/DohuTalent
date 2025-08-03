// Simulación de base de datos en localStorage
class Database {
    static init() {
        if(!localStorage.getItem('employees')) {
            localStorage.setItem('employees', JSON.stringify([]));
        }
        if(!localStorage.getItem('users')) {
            localStorage.setItem('users', JSON.stringify([
                {
                    id: 1,
                    username: "admin",
                    password: "admin123",
                    role: "ADMIN",
                    name: "Administrador"
                }
            ]));
        }
    }

    static getEmployees() {
        return JSON.parse(localStorage.getItem('employees'));
    }

    static saveEmployee(employee) {
        const employees = this.getEmployees();
        employees.push(employee);
        localStorage.setItem('employees', JSON.stringify(employees));
    }
}

// Inicializar al cargar
document.addEventListener('DOMContentLoaded', () => {
    Database.init();

    // Verificar autenticación en páginas protegidas
    if(!window.location.pathname.includes('login.html')) {
        const user = JSON.parse(sessionStorage.getItem('currentUser'));
        if(!user) window.location.href = 'login.html';
    }
});