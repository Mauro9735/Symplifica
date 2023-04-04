BEGIN;

CREATE TABLE IF NOT EXISTS public.products
(
    id integer NOT NULL,
    name character varying,
    description character varying,
    price character varying,
    current_stock integer,
    CONSTRAINT pk_product_id PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.orders
(
    id serial NOT NULL,
    product_id integer,
    CONSTRAINT pk_order_id PRIMARY KEY (id),
    CONSTRAINT fk_product_id FOREIGN KEY (product_id)
        REFERENCES public.products (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

END;