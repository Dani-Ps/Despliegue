<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the web site, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * Database settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/documentation/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'wordpress' );

/** Database username */
define( 'DB_USER', 'root' );

/** Database password */
define( 'DB_PASSWORD', 'test' );

/** Database hostname */
define( 'DB_HOST', 'db' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '6=)!$&Y&-yWn/]Dn%,Qx^PBA=T/h-nsq3Mc%yh=X; <g&ru/7Ljs|?sUrIeb8>gO' );
define( 'SECURE_AUTH_KEY',  '^mlgJJ>z3Q{+N3W!z9Je;J{#mX(oQAIkC-2D~#&b;P2A~F#pl6m3m$+i<p XQh##' );
define( 'LOGGED_IN_KEY',    'c5[+LOBsr^?,I!GOG<<(vmp5QAoj,S/Mc-s6|o:5sPj pf(E]zzF1!mddw$P3s)S' );
define( 'NONCE_KEY',        '~dTaX!(_FcDc>&q+`YOKBJHVKp7p&OLv0PSCAH2mrq~T3~zjgUXj5Gp*(f]g:;N!' );
define( 'AUTH_SALT',        '4<.WFWonZe&+`)rt9e&W&w<hn[mBS{H6n9s!($HTdSL.-B[eAKE^S:Sk|)7?~U&A' );
define( 'SECURE_AUTH_SALT', ']#S1c2=K|W=-dTaud./qFQp_*1=QmETF[xVq9hTq{/.ltybzZXO]t3Bj8D4E}a+I' );
define( 'LOGGED_IN_SALT',   '4 >JkaX*0)oY(vd!H_MfW7kTd+@)}_=G}Mrrv1FOcTS2v99H+htq;>]>~=HsTwjH' );
define( 'NONCE_SALT',       '#Wd0SWE]$6HYE-TviI3vF-dP9Tr78;nd.4P?WN%:z)xYrm=zM[0F7]F 3+8b[}RJ' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/documentation/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
