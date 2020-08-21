package com.sensoft.monbike.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = Service.TABLE_NAME)
public class Service implements Serializable {

	private static final long serialVersionUID = 1955122041950251207L;

	public static final String TABLE_NAME = "SERVICE";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "INTEGER")
	private Long id;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "TITRE")
	private String titre;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "URI_IMAGE")
	private String uriImage;

	@Column(name = "COULEUR")
	private String couleur;

	@Column(name = "BESOIN_SIRET")
	private Boolean besoinSiret;

	@Column(name = "PRE_COCHE")
	private Boolean preCoche;

	@Column(name = "URL_CIBLE")
	private String urlCible;

	@Column(name = "INDICE_TRI")
	private Integer indiceTri;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// EQUALS & HASHCODE //
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Service)) {
			return false;
		}
		Service service = (Service) o;
		if (service.id == null || id == null) {
			return false;
		}
		return Objects.equals(id, service.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// TO STRING //
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return "SERVICE{" + "ID=" + id + ", NOM='" + nom + "'" + ", TITRE='" + titre + "'" + ", DESCRIPTION='"
				+ description + "'" + ", URI_IMAGE='" + uriImage + "'" + ", COULEUR='" + couleur + "'" + ", BESOIN_SIRET='" + besoinSiret + "'"
				+ ", PRE_COCHE='" + preCoche + "'" + ", URL_CIBLE='" + urlCible + "'" + ", INDICE_TRI='" + indiceTri + "'" + '}';
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// GETTER & SETTER //
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUriImage() {
		return uriImage;
	}

	public void setUriImage(String uriImage) {
		this.uriImage = uriImage;
	}

	public String getCouleur() { return couleur; }

	public void setCouleur(String couleur) { this.couleur = couleur; }

	public boolean isBesoinSiret() {
		return besoinSiret;
	}

	public void setBesoinSiret(boolean besoinSiret) {
		this.besoinSiret = besoinSiret;
	}

	public boolean isPreCoche() {
		return preCoche;
	}

	public void setPreCoche(boolean preCoche) {
		this.preCoche = preCoche;
	}

	public String getUrlCible() {
		return urlCible;
	}

	public void setUrlCible(String urlCible) {
		this.urlCible = urlCible;
	}

	public Integer getIndiceTri() { return indiceTri; }

	public void setIndiceTri(Integer indiceTri) { this.indiceTri = indiceTri; }
}
