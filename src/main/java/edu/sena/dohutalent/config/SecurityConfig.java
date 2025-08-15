package edu.sena.dohutalent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/",
                                "/login**",
                                "/error**",
                                "/webjars/**",
                                "/images/**",
                                "/empleados/**",
                                "/static/**",
                                "/css/**",
                                "/js/**",
                                "/empleados/**",
                                "/empleados/formulario",
                                "/empleados/guardar",
                                "/empleados/Empleados",
                                "/empleados/exito"
                        ).permitAll()
                        .anyRequest().authenticated()
                )
                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/login")
                        .defaultSuccessUrl("/home", true)
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/").permitAll()
                        .deleteCookies("JSESSIONID")
                        .invalidateHttpSession(true)
                )
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/api/**") // APIs que no necesitan CSRF
                        .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/empleados/guardar"))
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .permitAll()
                );

        return http.build();
    }
}