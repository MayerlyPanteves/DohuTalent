# 📁 DohuTalent - Sistema de Gestión Documental

Sistema de gestión documental diseñado para la Clínica DohuTalent, que permite administrar y almacenar de manera segura los documentos de empleados y contratistas.

# ✨ Características Principales
- Gestión centralizada de documentos de recursos humanos
- Almacenamiento seguro de archivos con categorización
- Control de acceso por roles de usuario
- Sistema de búsqueda y filtrado avanzado

# Interfaz intuitiva y responsive

Backups automáticos de información crítica

# 🚀 Tecnologías Utilizadas
Frontend
React.js
Bootstrap
CSS3
JavaScript (ES6+)

Backend
Node.js
Express.js
Base de datos (PostgreSQL)
JWT para autenticación

# Herramientas de Desarrollo
Git

📦 Instalación
Sigue estos pasos para instalar y configurar el proyecto localmente:

# Clona el repositorio
bash
git clone https://github.com/MayerlyPanteves/DohuTalent.git
cd DohuTalent

# Instala las dependencias
bash
# Instalar dependencias del backend
cd backend
npm install
# Instalar dependencias del frontend
cd ../frontend
npm install

# Configuración de variables de entorno
bash
Crear archivo .env en la carpeta backend
DB_HOST=tu_host
DB_USER=tu_usuario
DB_PASS=tu_contraseña
DB_NAME=nombre_base_datos
JWT_SECRET=tu_clave_secreta_jwt
PORT=3001

# Inicializa la base de datos
Ejecuta el script SQL proporcionado en /database/schema.sql

# Ejecuta la aplicación
bash
Iniciar backend
cd backend
npm start
En otra terminal, iniciar frontend
cd frontend
npm start

# 🎯 Uso del Sistema
Acceso al sistema: Ingresa con tus credenciales asignadas
Gestión de usuarios: Administra perfiles de empleados y contratistas
Carga de documentos: Sube archivos organizados por categorías
Búsqueda: Utiliza el sistema de filtros para encontrar documentos rápidamente
Reportes: Genera informes sobre la documentación almacenada

# 👥 Roles de Usuario
Administrador: Acceso completo al sistema
Gestor de RH: Puede gestionar documentos y usuarios

# 📋 Estructura del Proyecto
text
DohuTalent/
├── backend/
│   ├── controllers/
│   ├── models/
│   ├── routes/
│   ├── middleware/
│   └── config/
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   └── utils/
├── database/
│   ├── schema.sql
│   └── seeds.sql
└── documentation/

# 🔒 Seguridad
Autenticación mediante JWT
Validación de entrada de datos
Cifrado de contraseñas con bcrypt
Protección contra inyecciones SQL
Headers de seguridad configurados

# 🤝 Contribución
Las contribuciones son bienvenidas. Para contribuir:
Haz fork del proyecto
Crea una rama para tu feature (git checkout -b feature/AmazingFeature)
Commit tus cambios (git commit -m 'Add some AmazingFeature')
Push a la rama (git push origin feature/AmazingFeature)
Abre un Pull Request

# 📞 Soporte
Para soporte técnico o preguntas sobre el sistema, contactar al 3158394514.

# Última actualización: Febrero 2024
# Versión: 1.0.0
# Desarrollado por: Mayerly Panteves Duran
