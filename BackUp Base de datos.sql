PGDMP     6                	    {            AppLocalizacion    15.4    15.4 (    '           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            (           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            )           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            *           1262    24602    AppLocalizacion    DATABASE     �   CREATE DATABASE "AppLocalizacion" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Guatemala.1252';
 !   DROP DATABASE "AppLocalizacion";
                postgres    false            �            1259    24701 
   tbl_camion    TABLE     �   CREATE TABLE public.tbl_camion (
    id integer NOT NULL,
    id_empresa character varying(255),
    marca character varying(255),
    no_chasis character varying(255),
    placa_camion character varying(255)
);
    DROP TABLE public.tbl_camion;
       public         heap    postgres    false            �            1259    24700    tbl_camion_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_camion_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.tbl_camion_id_seq;
       public          postgres    false    215            +           0    0    tbl_camion_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.tbl_camion_id_seq OWNED BY public.tbl_camion.id;
          public          postgres    false    214            �            1259    24710    tbl_empresa    TABLE     �   CREATE TABLE public.tbl_empresa (
    id integer NOT NULL,
    id_empresa character varying(255),
    nombre_empresa character varying(255),
    password character varying(255)
);
    DROP TABLE public.tbl_empresa;
       public         heap    postgres    false            �            1259    24709    tbl_empresa_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_empresa_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.tbl_empresa_id_seq;
       public          postgres    false    217            ,           0    0    tbl_empresa_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.tbl_empresa_id_seq OWNED BY public.tbl_empresa.id;
          public          postgres    false    216            �            1259    24719    tbl_historial_ubicaciones    TABLE     �  CREATE TABLE public.tbl_historial_ubicaciones (
    id_registro_ubicacion integer NOT NULL,
    dpi_piloto character varying(255),
    fecha_emision character varying(255),
    hora_emision character varying(255),
    id_empresa character varying(255),
    latitud character varying(255),
    longitud character varying(255),
    placa_camion character varying(255),
    id_viaje integer
);
 -   DROP TABLE public.tbl_historial_ubicaciones;
       public         heap    postgres    false            �            1259    24718 3   tbl_historial_ubicaciones_id_registro_ubicacion_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_historial_ubicaciones_id_registro_ubicacion_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 J   DROP SEQUENCE public.tbl_historial_ubicaciones_id_registro_ubicacion_seq;
       public          postgres    false    219            -           0    0 3   tbl_historial_ubicaciones_id_registro_ubicacion_seq    SEQUENCE OWNED BY     �   ALTER SEQUENCE public.tbl_historial_ubicaciones_id_registro_ubicacion_seq OWNED BY public.tbl_historial_ubicaciones.id_registro_ubicacion;
          public          postgres    false    218            �            1259    24728 
   tbl_piloto    TABLE     (  CREATE TABLE public.tbl_piloto (
    id integer NOT NULL,
    apellidos character varying(255),
    dpi_piloto character varying(255),
    direccion character varying(255),
    id_empresa character varying(255),
    licencia_conducir character varying(255),
    nombres character varying(255)
);
    DROP TABLE public.tbl_piloto;
       public         heap    postgres    false            �            1259    24727    tbl_piloto_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_piloto_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.tbl_piloto_id_seq;
       public          postgres    false    221            .           0    0    tbl_piloto_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.tbl_piloto_id_seq OWNED BY public.tbl_piloto.id;
          public          postgres    false    220            �            1259    24737 	   tbl_viaje    TABLE     �  CREATE TABLE public.tbl_viaje (
    id_viaje integer NOT NULL,
    dpi_piloto character varying(255),
    descripcion character varying(255),
    estado character varying(255),
    fecha_llegada character varying(255),
    fecha_partida character varying(255),
    id_empresa character varying(255),
    placa_camion character varying(255),
    punto_llegada character varying(255),
    punto_partida character varying(255)
);
    DROP TABLE public.tbl_viaje;
       public         heap    postgres    false            �            1259    24736    tbl_viaje_id_viaje_seq    SEQUENCE     �   CREATE SEQUENCE public.tbl_viaje_id_viaje_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.tbl_viaje_id_viaje_seq;
       public          postgres    false    223            /           0    0    tbl_viaje_id_viaje_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.tbl_viaje_id_viaje_seq OWNED BY public.tbl_viaje.id_viaje;
          public          postgres    false    222            �            1259    24745    vista_resumen    VIEW     q  CREATE VIEW public.vista_resumen AS
 SELECT hu.id_registro_ubicacion AS id_historial,
    hu.hora_emision,
    hu.fecha_emision,
    hu.latitud,
    hu.longitud,
    v.id_viaje,
    v.id_empresa,
    v.punto_llegada,
    v.punto_partida,
    v.descripcion AS descripcion_viaje,
    p.nombres,
    p.apellidos,
    p.dpi_piloto,
    c.placa_camion
   FROM (((public.tbl_historial_ubicaciones hu
     JOIN public.tbl_viaje v ON ((hu.id_viaje = v.id_viaje)))
     JOIN public.tbl_piloto p ON (((v.dpi_piloto)::text = (p.dpi_piloto)::text)))
     JOIN public.tbl_camion c ON (((v.placa_camion)::text = (c.placa_camion)::text)));
     DROP VIEW public.vista_resumen;
       public          postgres    false    215    223    223    223    223    223    223    223    221    221    221    219    219    219    219    219    219            }           2604    24704    tbl_camion id    DEFAULT     n   ALTER TABLE ONLY public.tbl_camion ALTER COLUMN id SET DEFAULT nextval('public.tbl_camion_id_seq'::regclass);
 <   ALTER TABLE public.tbl_camion ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    214    215    215            ~           2604    24713    tbl_empresa id    DEFAULT     p   ALTER TABLE ONLY public.tbl_empresa ALTER COLUMN id SET DEFAULT nextval('public.tbl_empresa_id_seq'::regclass);
 =   ALTER TABLE public.tbl_empresa ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    217    216    217                       2604    24722 /   tbl_historial_ubicaciones id_registro_ubicacion    DEFAULT     �   ALTER TABLE ONLY public.tbl_historial_ubicaciones ALTER COLUMN id_registro_ubicacion SET DEFAULT nextval('public.tbl_historial_ubicaciones_id_registro_ubicacion_seq'::regclass);
 ^   ALTER TABLE public.tbl_historial_ubicaciones ALTER COLUMN id_registro_ubicacion DROP DEFAULT;
       public          postgres    false    219    218    219            �           2604    24731    tbl_piloto id    DEFAULT     n   ALTER TABLE ONLY public.tbl_piloto ALTER COLUMN id SET DEFAULT nextval('public.tbl_piloto_id_seq'::regclass);
 <   ALTER TABLE public.tbl_piloto ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    221    221            �           2604    24740    tbl_viaje id_viaje    DEFAULT     x   ALTER TABLE ONLY public.tbl_viaje ALTER COLUMN id_viaje SET DEFAULT nextval('public.tbl_viaje_id_viaje_seq'::regclass);
 A   ALTER TABLE public.tbl_viaje ALTER COLUMN id_viaje DROP DEFAULT;
       public          postgres    false    222    223    223                      0    24701 
   tbl_camion 
   TABLE DATA           T   COPY public.tbl_camion (id, id_empresa, marca, no_chasis, placa_camion) FROM stdin;
    public          postgres    false    215   K3                 0    24710    tbl_empresa 
   TABLE DATA           O   COPY public.tbl_empresa (id, id_empresa, nombre_empresa, password) FROM stdin;
    public          postgres    false    217   �3                  0    24719    tbl_historial_ubicaciones 
   TABLE DATA           �   COPY public.tbl_historial_ubicaciones (id_registro_ubicacion, dpi_piloto, fecha_emision, hora_emision, id_empresa, latitud, longitud, placa_camion, id_viaje) FROM stdin;
    public          postgres    false    219   �3       "          0    24728 
   tbl_piloto 
   TABLE DATA           r   COPY public.tbl_piloto (id, apellidos, dpi_piloto, direccion, id_empresa, licencia_conducir, nombres) FROM stdin;
    public          postgres    false    221   4       $          0    24737 	   tbl_viaje 
   TABLE DATA           �   COPY public.tbl_viaje (id_viaje, dpi_piloto, descripcion, estado, fecha_llegada, fecha_partida, id_empresa, placa_camion, punto_llegada, punto_partida) FROM stdin;
    public          postgres    false    223   s4       0           0    0    tbl_camion_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.tbl_camion_id_seq', 2, true);
          public          postgres    false    214            1           0    0    tbl_empresa_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.tbl_empresa_id_seq', 1, true);
          public          postgres    false    216            2           0    0 3   tbl_historial_ubicaciones_id_registro_ubicacion_seq    SEQUENCE SET     a   SELECT pg_catalog.setval('public.tbl_historial_ubicaciones_id_registro_ubicacion_seq', 3, true);
          public          postgres    false    218            3           0    0    tbl_piloto_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.tbl_piloto_id_seq', 2, true);
          public          postgres    false    220            4           0    0    tbl_viaje_id_viaje_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.tbl_viaje_id_viaje_seq', 2, true);
          public          postgres    false    222            �           2606    24708    tbl_camion tbl_camion_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.tbl_camion
    ADD CONSTRAINT tbl_camion_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.tbl_camion DROP CONSTRAINT tbl_camion_pkey;
       public            postgres    false    215            �           2606    24717    tbl_empresa tbl_empresa_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.tbl_empresa
    ADD CONSTRAINT tbl_empresa_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.tbl_empresa DROP CONSTRAINT tbl_empresa_pkey;
       public            postgres    false    217            �           2606    24726 8   tbl_historial_ubicaciones tbl_historial_ubicaciones_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.tbl_historial_ubicaciones
    ADD CONSTRAINT tbl_historial_ubicaciones_pkey PRIMARY KEY (id_registro_ubicacion);
 b   ALTER TABLE ONLY public.tbl_historial_ubicaciones DROP CONSTRAINT tbl_historial_ubicaciones_pkey;
       public            postgres    false    219            �           2606    24735    tbl_piloto tbl_piloto_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.tbl_piloto
    ADD CONSTRAINT tbl_piloto_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.tbl_piloto DROP CONSTRAINT tbl_piloto_pkey;
       public            postgres    false    221            �           2606    24744    tbl_viaje tbl_viaje_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.tbl_viaje
    ADD CONSTRAINT tbl_viaje_pkey PRIMARY KEY (id_viaje);
 B   ALTER TABLE ONLY public.tbl_viaje DROP CONSTRAINT tbl_viaje_pkey;
       public            postgres    false    223               1   x�3�t�ON�u��I��ut��44��0735162���540������ �n�         )   x�3�t�ON�u��ID���s�*9��"�F�\1z\\\ "uf          F   x�3�4426153���44�74�7202�4�26P(��t�ON�u��I+�4162���540��4����� �a      "   H   x�3���/J�I-V�Ҝ�F�&�f����%�%������ɉ���9�H�^�e��E
�y%�y��\1z\\\ �p8      $   n   x�3�4426153���N�IUHI-NIUp/M,.I,ɯLTHTN�K,J,I2s��8]��s3��9���������ɉ���9��^��F��08�r��qqq �$     