////package org.training.api.gateway.config;
////
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
////import org.springframework.security.config.web.server.ServerHttpSecurity;
////import org.springframework.security.web.server.SecurityWebFilterChain;
////
////@Configuration
////@EnableWebFluxSecurity
////public class SecurityConfig {
////
////    @Bean
////    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
////        http
////                .authorizeExchange()
////                .pathMatchers("/api/users/register").permitAll()
////                .pathMatchers("/**").permitAll()// Cho phép truy cập tất cả các endpoint
////                .and().csrf().disable();
//////                .authorizeExchange()
//////                //ALLOWING REGISTER API FOR DIRECT ACCESS
//////                .pathMatchers("/api/users/register").permitAll()
//////                //ALL OTHER APIS ARE AUTHENTICATED
//////                .anyExchange().authenticated()
//////                .and()
//////                .csrf().disable()
//////                .oauth2Login()
//////                .and()
//////                .oauth2ResourceServer()
//////                .jwt();
////        return http.build();
////    }
////}
//package org.training.api.gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        http
//                // Cấu hình cho phép tất cả các endpoint
//                .authorizeExchange()
//                .pathMatchers("/api/users/register").permitAll() // Cho phép endpoint /api/users/register không cần xác thực
//                .pathMatchers("/**").permitAll() // Cho phép truy cập tất cả các endpoint khác
//                .and()
//                .csrf().disable(); // Vô hiệu hóa CSRF (chỉ nên vô hiệu hóa trong môi trường phát triển)
//
//        // Trả về cấu hình bảo mật đã xây dựng
//        return http.build();
//    }
//}
