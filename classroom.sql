--
-- PostgreSQL database dump
--

-- Dumped from database version 10.3
-- Dumped by pg_dump version 10.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: add_attendence; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.add_attendence (
    id integer NOT NULL,
    student_name character varying NOT NULL,
    faculty character varying NOT NULL,
    semester character varying NOT NULL,
    attendence character varying NOT NULL
);


ALTER TABLE public.add_attendence OWNER TO postgres;

--
-- Name: add_attendence_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.add_attendence_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.add_attendence_id_seq OWNER TO postgres;

--
-- Name: add_attendence_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.add_attendence_id_seq OWNED BY public.add_attendence.id;


--
-- Name: add_event; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.add_event (
    id integer NOT NULL,
    event_name character varying NOT NULL,
    event_description character varying NOT NULL,
    event_date date NOT NULL
);


ALTER TABLE public.add_event OWNER TO postgres;

--
-- Name: add_event_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.add_event_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.add_event_id_seq OWNER TO postgres;

--
-- Name: add_event_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.add_event_id_seq OWNED BY public.add_event.id;


--
-- Name: add_holiday; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.add_holiday (
    id integer NOT NULL,
    reason character varying NOT NULL,
    holiday_date date NOT NULL
);


ALTER TABLE public.add_holiday OWNER TO postgres;

--
-- Name: add_holiday_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.add_holiday_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.add_holiday_id_seq OWNER TO postgres;

--
-- Name: add_holiday_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.add_holiday_id_seq OWNED BY public.add_holiday.id;


--
-- Name: add_lecture; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.add_lecture (
    id integer NOT NULL,
    lecture character varying NOT NULL,
    faculty character varying NOT NULL,
    class_section character varying NOT NULL,
    semester character varying NOT NULL,
    startdate date NOT NULL,
    lastdate date NOT NULL,
    startime character varying NOT NULL,
    lastime character varying NOT NULL,
    days character varying NOT NULL
);


ALTER TABLE public.add_lecture OWNER TO postgres;

--
-- Name: add_lecture_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.add_lecture_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.add_lecture_id_seq OWNER TO postgres;

--
-- Name: add_lecture_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.add_lecture_id_seq OWNED BY public.add_lecture.id;


--
-- Name: add_note; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.add_note (
    id integer NOT NULL,
    lecture character varying NOT NULL,
    bookname character varying NOT NULL,
    sem character varying NOT NULL,
    author character varying NOT NULL,
    url character varying
);


ALTER TABLE public.add_note OWNER TO postgres;

--
-- Name: add_note_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.add_note_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.add_note_id_seq OWNER TO postgres;

--
-- Name: add_note_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.add_note_id_seq OWNED BY public.add_note.id;


--
-- Name: add_topic; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.add_topic (
    id integer NOT NULL,
    faculty character varying NOT NULL,
    class_section character varying NOT NULL,
    lecture character varying NOT NULL,
    semester character varying,
    topic character varying NOT NULL
);


ALTER TABLE public.add_topic OWNER TO postgres;

--
-- Name: add_topic_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.add_topic_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.add_topic_id_seq OWNER TO postgres;

--
-- Name: add_topic_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.add_topic_id_seq OWNED BY public.add_topic.id;


--
-- Name: assign; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.assign (
    id integer NOT NULL,
    faculty character varying NOT NULL,
    sec character varying NOT NULL,
    sem character varying NOT NULL,
    lecture character varying NOT NULL,
    deadline date NOT NULL,
    question character varying NOT NULL
);


ALTER TABLE public.assign OWNER TO postgres;

--
-- Name: assign_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.assign_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.assign_id_seq OWNER TO postgres;

--
-- Name: assign_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.assign_id_seq OWNED BY public.assign.id;


--
-- Name: login; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.login (
    id integer NOT NULL,
    user_name character varying NOT NULL,
    email character varying NOT NULL,
    password character varying NOT NULL
);


ALTER TABLE public.login OWNER TO postgres;

--
-- Name: login_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.login_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.login_id_seq OWNER TO postgres;

--
-- Name: login_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.login_id_seq OWNED BY public.login.id;


--
-- Name: add_attendence id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_attendence ALTER COLUMN id SET DEFAULT nextval('public.add_attendence_id_seq'::regclass);


--
-- Name: add_event id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_event ALTER COLUMN id SET DEFAULT nextval('public.add_event_id_seq'::regclass);


--
-- Name: add_holiday id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_holiday ALTER COLUMN id SET DEFAULT nextval('public.add_holiday_id_seq'::regclass);


--
-- Name: add_lecture id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_lecture ALTER COLUMN id SET DEFAULT nextval('public.add_lecture_id_seq'::regclass);


--
-- Name: add_note id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_note ALTER COLUMN id SET DEFAULT nextval('public.add_note_id_seq'::regclass);


--
-- Name: add_topic id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_topic ALTER COLUMN id SET DEFAULT nextval('public.add_topic_id_seq'::regclass);


--
-- Name: assign id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.assign ALTER COLUMN id SET DEFAULT nextval('public.assign_id_seq'::regclass);


--
-- Name: login id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login ALTER COLUMN id SET DEFAULT nextval('public.login_id_seq'::regclass);


--
-- Name: add_attendence add_attendence_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_attendence
    ADD CONSTRAINT add_attendence_pkey PRIMARY KEY (id);


--
-- Name: add_event add_event_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_event
    ADD CONSTRAINT add_event_pkey PRIMARY KEY (id);


--
-- Name: add_holiday add_holiday_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_holiday
    ADD CONSTRAINT add_holiday_pkey PRIMARY KEY (id);


--
-- Name: add_lecture add_lecture_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_lecture
    ADD CONSTRAINT add_lecture_pkey PRIMARY KEY (id);


--
-- Name: add_note add_note_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_note
    ADD CONSTRAINT add_note_pkey PRIMARY KEY (id);


--
-- Name: add_topic add_topic_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.add_topic
    ADD CONSTRAINT add_topic_pkey PRIMARY KEY (id);


--
-- Name: assign assign_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.assign
    ADD CONSTRAINT assign_pkey PRIMARY KEY (id);


--
-- Name: login login_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

