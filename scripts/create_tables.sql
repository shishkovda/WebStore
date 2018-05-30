-- Table: public.product

DROP TABLE public.product;

CREATE TABLE public.product
(
    id bigint NOT NULL,
    title character varying(100) COLLATE pg_catalog."default" NOT NULL,
    price character varying(100) COLLATE pg_catalog."default" NOT NULL,
    description character varying(100) COLLATE pg_catalog."default",
    picture character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT product_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.product
    OWNER to postgres;
	
	
-- Table: public.product_instances

DROP TABLE public.product_instances;

CREATE TABLE public.product_instances
(
    id bigint NOT NULL,
    discount integer,
    "serialNumber" character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT product_instances_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.product_instances
    OWNER to postgres;
	
	
-- Table: public.store

DROP TABLE public.store;

CREATE TABLE public.store
(
    id bigint NOT NULL,
    product_instance_id bigint NOT NULL,
    status character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT store_pkey PRIMARY KEY (id),
    CONSTRAINT "fk_store.product_instance_id_product_instances.id" FOREIGN KEY (product_instance_id)
        REFERENCES public.product_instances (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.store
    OWNER to postgres;

-- Index: fki_a

-- DROP INDEX public.fki_a;

CREATE INDEX fki_a
    ON public.store USING btree
    (product_instance_id)
    TABLESPACE pg_default;