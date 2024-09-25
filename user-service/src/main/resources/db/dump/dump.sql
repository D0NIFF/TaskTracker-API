--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5 (Debian 14.5-1.pgdg110+1)
-- Dumped by pg_dump version 14.5 (Debian 14.5-1.pgdg110+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;


--
-- Name: user; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.user (
    id BIGINT NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(300) UNIQUE NOT NULL,
    password VARCHAR(1000) NOT NULL,
    avatar VARCHAR(255) DEFAULT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP DEFAULT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);

--
-- Name: confirm_user; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.confirm_user (
    id BIGINT NOT NULL,
    user_id BIGINT,
    token VARCHAR(512) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT confirm_user_pkey PRIMARY KEY (id),
    CONSTRAINT confirm_user_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user (id) ON DELETE CASCADE,
);

--
-- Name: auth_log; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.auth_log (
    id BIGINT NOT NULL,
    user_id BIGINT,
    ip VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT auth_log_pkey PRIMARY KEY (id),
    CONSTRAINT auth_log_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user (id) ON DELETE CASCADE
);


--
-- Name: user_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

--
-- Name: confirm_user_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.confirm_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

--
-- Name: auth_log_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.auth_log_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: user id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.user ALTER COLUMN id SET DEFAULT nextval('public.user_id_seq'::regclass);

--
-- Name: confirm_user id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.confirm_user ALTER COLUMN id SET DEFAULT nextval('public.confirm_user_id_seq'::regclass);

--
-- Name: auth_log id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.auth_log ALTER COLUMN id SET DEFAULT nextval('public.auth_log_id_seq'::regclass);