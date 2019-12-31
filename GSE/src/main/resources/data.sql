INSERT INTO public.pais(
	id, nm_pais, sg_pais)
	VALUES (1,'Brasil', 'BRA');
INSERT INTO public.estado(
	id, cd_ibge, nm_estado, sg_estado, pais_id)
	VALUES (1, '0000', 'Paraná','PR',1);

INSERT INTO public.municipio(
    id, cd_ufibge, nm_municipio, qt_populacao, estado_id)
    VALUES (1, '0000','Toledo', 211000, 1);

INSERT INTO public.empresa(
	id, cd_empresa, nm_empresa, st_ativo)
	VALUES (1, 'GRP001','Grupo de Empresa 1', true);

INSERT INTO public.filial(
	 id, cd_filial, ds_bairro, ds_endereco, nm_fantasia, nm_razao_social, nr_cep, nr_cnpj, nr_ddd, nr_ie,  nr_telefone, empresa_id, municipio_id)
	VALUES (1, '01TESTE', 'Jardim das Rosas', 'Rua José das Colves', 'Teste do sistema', 'Teste do sistema LTDA.', '05550-00', '80000000000100', '45','ISENTO' ,  '3278-0000', 1, 1);