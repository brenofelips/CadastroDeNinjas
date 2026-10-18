-- V2: Migrations para adioncar o rank na tabela de ninjas

ALTER TABLE tb_ninjas
ADD COLUMN rank varchar(255)