package com.techvalley.android.project_rh_tv.model;

import java.time.LocalDate;
import java.util.List;

public class Consultant {
    //======================================
    //          ATTRIBUTS
    //======================================
    private Integer id;
    private String nom;
    private String nomProposition;
    private LocalDate dateEnregistrement;
    private LocalDate dateRelance;
    private LocalDate dateEntree;
    private Boolean candidat;
    private String cooptation;
    private String origineCooptation;
    private String commentaireCandidature;
    private String commentaireProfil;
    private String commentaireKo;
    private Boolean horsScope;
    private String entretienVisu;
    private String entretienSkype;
    private String entretienTel;
    private String controleRef;
    private String controlePresentationExpression;
    private String cvTv;
    private String lienCvProposition;
    private String villeResidence;
    private String adresseMail;
    private String telephone;
    private Integer pretentionSalaire;
    private Integer pretentionTj;
    private String lienCvPerso;
    private String lienAvatar;
    private String lienCvTech;
    private String lienImage;
    private String lienAutreFichier;
    private String lienAutreFichier2;
    private LocalDate dateDernierPointDisponibilite;
    private LocalDate dateDisponibilite;
    private Integer delaiDisponibilite;
    private String demission;
    private String employeurActuel;
    private String clientsPrincipaux;
    private Boolean expAirbus;
    private Boolean expBanque;
    private String niveauAnglais;
    private String autresLangues;
    private Integer niveauFormation;
    private Integer anneeDiplome;
    private String diplome;
    private Boolean niveauExpertArchi;
    private Boolean niveauChefProjetDirProjet;
    private String specialite2;
    private String specialite3;
    private String autreSpecialite;
    private String competencesEtendues;
    private String laiusPresentation;
    private String commentaireSpecifique;
    private String autresCommunications;
    private byte[] avatar;
    private String avatarContentType;
    private String commentaireQualification;
    private String linkedin;
    private String viadeo;
    private String commentaireInformationsConsultant;
    private String commentaireLiens;
    private String commentaireDisponibilite;
    private String commentaireInfoComplementaires;
    private String avancementSourcing;
    private String remarquesParticulieres;
    private String finDernierPoste;
    private String dureeExperience;
    private String messageAccuseRetour;
    private String compteRenduPresentation;
    private Integer tjvStandard;
    private Boolean cvPropositionFait;
    private LocalDate dateCvProposition;
    private OrigineSourcing origineSourcing;
    private EtatQualification etatQualification;
    private EtatDisponibilite etatDisponibilite;
    private VilleRattachement villeRattachement;
    private List<TypeContrat> typeContrats = null;
    private List<SiteTechvalley> siteTechvalleys = null;
    private List<Domaine> domaines = null;
    private List<Specialite> specialites = null;


    //======================================
    //          GETTER / SETTER
    //======================================
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomProposition() {
        return nomProposition;
    }

    public void setNomProposition(String nomProposition) {
        this.nomProposition = nomProposition;
    }

    public LocalDate getDateEnregistrement() {
        return dateEnregistrement;
    }

    public void setDateEnregistrement(LocalDate dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }

    public LocalDate getDateRelance() {
        return dateRelance;
    }

    public void setDateRelance(LocalDate dateRelance) {
        this.dateRelance = dateRelance;
    }

    public LocalDate getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(LocalDate dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Boolean getCandidat() {
        return candidat;
    }

    public void setCandidat(Boolean candidat) {
        this.candidat = candidat;
    }

    public String getCooptation() {
        return cooptation;
    }

    public void setCooptation(String cooptation) {
        this.cooptation = cooptation;
    }

    public String getOrigineCooptation() {
        return origineCooptation;
    }

    public void setOrigineCooptation(String origineCooptation) {
        this.origineCooptation = origineCooptation;
    }

    public String getCommentaireCandidature() {
        return commentaireCandidature;
    }

    public void setCommentaireCandidature(String commentaireCandidature) {
        this.commentaireCandidature = commentaireCandidature;
    }

    public String getCommentaireProfil() {
        return commentaireProfil;
    }

    public void setCommentaireProfil(String commentaireProfil) {
        this.commentaireProfil = commentaireProfil;
    }

    public String getCommentaireKo() {
        return commentaireKo;
    }

    public void setCommentaireKo(String commentaireKo) {
        this.commentaireKo = commentaireKo;
    }

    public Boolean getHorsScope() {
        return horsScope;
    }

    public void setHorsScope(Boolean horsScope) {
        this.horsScope = horsScope;
    }

    public String getEntretienVisu() {
        return entretienVisu;
    }

    public void setEntretienVisu(String entretienVisu) {
        this.entretienVisu = entretienVisu;
    }

    public String getEntretienSkype() {
        return entretienSkype;
    }

    public void setEntretienSkype(String entretienSkype) {
        this.entretienSkype = entretienSkype;
    }

    public String getEntretienTel() {
        return entretienTel;
    }

    public void setEntretienTel(String entretienTel) {
        this.entretienTel = entretienTel;
    }

    public String getControleRef() {
        return controleRef;
    }

    public void setControleRef(String controleRef) {
        this.controleRef = controleRef;
    }

    public String getControlePresentationExpression() {
        return controlePresentationExpression;
    }

    public void setControlePresentationExpression(String controlePresentationExpression) {
        this.controlePresentationExpression = controlePresentationExpression;
    }

    public String getCvTv() {
        return cvTv;
    }

    public void setCvTv(String cvTv) {
        this.cvTv = cvTv;
    }

    public String getLienCvProposition() {
        return lienCvProposition;
    }

    public void setLienCvProposition(String lienCvProposition) {
        this.lienCvProposition = lienCvProposition;
    }

    public String getVilleResidence() {
        return villeResidence;
    }

    public void setVilleResidence(String villeResidence) {
        this.villeResidence = villeResidence;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getPretentionSalaire() {
        return pretentionSalaire;
    }

    public void setPretentionSalaire(Integer pretentionSalaire) {
        this.pretentionSalaire = pretentionSalaire;
    }

    public Integer getPretentionTj() {
        return pretentionTj;
    }

    public void setPretentionTj(Integer pretentionTj) {
        this.pretentionTj = pretentionTj;
    }

    public String getLienCvPerso() {
        return lienCvPerso;
    }

    public void setLienCvPerso(String lienCvPerso) {
        this.lienCvPerso = lienCvPerso;
    }

    public String getLienAvatar() {
        return lienAvatar;
    }

    public void setLienAvatar(String lienAvatar) {
        this.lienAvatar = lienAvatar;
    }

    public String getLienCvTech() {
        return lienCvTech;
    }

    public void setLienCvTech(String lienCvTech) {
        this.lienCvTech = lienCvTech;
    }

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public String getLienAutreFichier() {
        return lienAutreFichier;
    }

    public void setLienAutreFichier(String lienAutreFichier) {
        this.lienAutreFichier = lienAutreFichier;
    }

    public String getLienAutreFichier2() {
        return lienAutreFichier2;
    }

    public void setLienAutreFichier2(String lienAutreFichier2) {
        this.lienAutreFichier2 = lienAutreFichier2;
    }

    public LocalDate getDateDernierPointDisponibilite() {
        return dateDernierPointDisponibilite;
    }

    public void setDateDernierPointDisponibilite(LocalDate dateDernierPointDisponibilite) {
        this.dateDernierPointDisponibilite = dateDernierPointDisponibilite;
    }

    public LocalDate getDateDisponibilite() {
        return dateDisponibilite;
    }

    public void setDateDisponibilite(LocalDate dateDisponibilite) {
        this.dateDisponibilite = dateDisponibilite;
    }

    public Integer getDelaiDisponibilite() {
        return delaiDisponibilite;
    }

    public void setDelaiDisponibilite(Integer delaiDisponibilite) {
        this.delaiDisponibilite = delaiDisponibilite;
    }

    public String getDemission() {
        return demission;
    }

    public void setDemission(String demission) {
        this.demission = demission;
    }

    public String getEmployeurActuel() {
        return employeurActuel;
    }

    public void setEmployeurActuel(String employeurActuel) {
        this.employeurActuel = employeurActuel;
    }

    public String getClientsPrincipaux() {
        return clientsPrincipaux;
    }

    public void setClientsPrincipaux(String clientsPrincipaux) {
        this.clientsPrincipaux = clientsPrincipaux;
    }

    public Boolean getExpAirbus() {
        return expAirbus;
    }

    public void setExpAirbus(Boolean expAirbus) {
        this.expAirbus = expAirbus;
    }

    public Boolean getExpBanque() {
        return expBanque;
    }

    public void setExpBanque(Boolean expBanque) {
        this.expBanque = expBanque;
    }

    public String getNiveauAnglais() {
        return niveauAnglais;
    }

    public void setNiveauAnglais(String niveauAnglais) {
        this.niveauAnglais = niveauAnglais;
    }

    public String getAutresLangues() {
        return autresLangues;
    }

    public void setAutresLangues(String autresLangues) {
        this.autresLangues = autresLangues;
    }

    public Integer getNiveauFormation() {
        return niveauFormation;
    }

    public void setNiveauFormation(Integer niveauFormation) {
        this.niveauFormation = niveauFormation;
    }

    public Integer getAnneeDiplome() {
        return anneeDiplome;
    }

    public void setAnneeDiplome(Integer anneeDiplome) {
        this.anneeDiplome = anneeDiplome;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public Boolean getNiveauExpertArchi() {
        return niveauExpertArchi;
    }

    public void setNiveauExpertArchi(Boolean niveauExpertArchi) {
        this.niveauExpertArchi = niveauExpertArchi;
    }

    public Boolean getNiveauChefProjetDirProjet() {
        return niveauChefProjetDirProjet;
    }

    public void setNiveauChefProjetDirProjet(Boolean niveauChefProjetDirProjet) {
        this.niveauChefProjetDirProjet = niveauChefProjetDirProjet;
    }

    public String getSpecialite2() {
        return specialite2;
    }

    public void setSpecialite2(String specialite2) {
        this.specialite2 = specialite2;
    }

    public String getSpecialite3() {
        return specialite3;
    }

    public void setSpecialite3(String specialite3) {
        this.specialite3 = specialite3;
    }

    public String getAutreSpecialite() {
        return autreSpecialite;
    }

    public void setAutreSpecialite(String autreSpecialite) {
        this.autreSpecialite = autreSpecialite;
    }

    public String getCompetencesEtendues() {
        return competencesEtendues;
    }

    public void setCompetencesEtendues(String competencesEtendues) {
        this.competencesEtendues = competencesEtendues;
    }

    public String getLaiusPresentation() {
        return laiusPresentation;
    }

    public void setLaiusPresentation(String laiusPresentation) {
        this.laiusPresentation = laiusPresentation;
    }

    public String getCommentaireSpecifique() {
        return commentaireSpecifique;
    }

    public void setCommentaireSpecifique(String commentaireSpecifique) {
        this.commentaireSpecifique = commentaireSpecifique;
    }

    public String getAutresCommunications() {
        return autresCommunications;
    }

    public void setAutresCommunications(String autresCommunications) {
        this.autresCommunications = autresCommunications;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getAvatarContentType() {
        return avatarContentType;
    }

    public void setAvatarContentType(String avatarContentType) {
        this.avatarContentType = avatarContentType;
    }

    public String getCommentaireQualification() {
        return commentaireQualification;
    }

    public void setCommentaireQualification(String commentaireQualification) {
        this.commentaireQualification = commentaireQualification;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getViadeo() {
        return viadeo;
    }

    public void setViadeo(String viadeo) {
        this.viadeo = viadeo;
    }

    public String getCommentaireInformationsConsultant() {
        return commentaireInformationsConsultant;
    }

    public void setCommentaireInformationsConsultant(String commentaireInformationsConsultant) {
        this.commentaireInformationsConsultant = commentaireInformationsConsultant;
    }

    public String getCommentaireLiens() {
        return commentaireLiens;
    }

    public void setCommentaireLiens(String commentaireLiens) {
        this.commentaireLiens = commentaireLiens;
    }

    public String getCommentaireDisponibilite() {
        return commentaireDisponibilite;
    }

    public void setCommentaireDisponibilite(String commentaireDisponibilite) {
        this.commentaireDisponibilite = commentaireDisponibilite;
    }

    public String getCommentaireInfoComplementaires() {
        return commentaireInfoComplementaires;
    }

    public void setCommentaireInfoComplementaires(String commentaireInfoComplementaires) {
        this.commentaireInfoComplementaires = commentaireInfoComplementaires;
    }

    public String getAvancementSourcing() {
        return avancementSourcing;
    }

    public void setAvancementSourcing(String avancementSourcing) {
        this.avancementSourcing = avancementSourcing;
    }

    public String getRemarquesParticulieres() {
        return remarquesParticulieres;
    }

    public void setRemarquesParticulieres(String remarquesParticulieres) {
        this.remarquesParticulieres = remarquesParticulieres;
    }

    public String getFinDernierPoste() {
        return finDernierPoste;
    }

    public void setFinDernierPoste(String finDernierPoste) {
        this.finDernierPoste = finDernierPoste;
    }

    public String getDureeExperience() {
        return dureeExperience;
    }

    public void setDureeExperience(String dureeExperience) {
        this.dureeExperience = dureeExperience;
    }

    public String getMessageAccuseRetour() {
        return messageAccuseRetour;
    }

    public void setMessageAccuseRetour(String messageAccuseRetour) {
        this.messageAccuseRetour = messageAccuseRetour;
    }

    public String getCompteRenduPresentation() {
        return compteRenduPresentation;
    }

    public void setCompteRenduPresentation(String compteRenduPresentation) {
        this.compteRenduPresentation = compteRenduPresentation;
    }

    public Integer getTjvStandard() {
        return tjvStandard;
    }

    public void setTjvStandard(Integer tjvStandard) {
        this.tjvStandard = tjvStandard;
    }

    public Boolean getCvPropositionFait() {
        return cvPropositionFait;
    }

    public void setCvPropositionFait(Boolean cvPropositionFait) {
        this.cvPropositionFait = cvPropositionFait;
    }

    public LocalDate getDateCvProposition() {
        return dateCvProposition;
    }

    public void setDateCvProposition(LocalDate dateCvProposition) {
        this.dateCvProposition = dateCvProposition;
    }

    public OrigineSourcing getOrigineSourcing() {
        return origineSourcing;
    }

    public void setOrigineSourcing(OrigineSourcing origineSourcing) {
        this.origineSourcing = origineSourcing;
    }

    public EtatQualification getEtatQualification() {
        return etatQualification;
    }

    public void setEtatQualification(EtatQualification etatQualification) {
        this.etatQualification = etatQualification;
    }

    public EtatDisponibilite getEtatDisponibilite() {
        return etatDisponibilite;
    }

    public void setEtatDisponibilite(EtatDisponibilite etatDisponibilite) {
        this.etatDisponibilite = etatDisponibilite;
    }

    public VilleRattachement getVilleRattachement() {
        return villeRattachement;
    }

    public void setVilleRattachement(VilleRattachement villeRattachement) {
        this.villeRattachement = villeRattachement;
    }

    public List<TypeContrat> getTypeContrats() {
        return typeContrats;
    }

    public void setTypeContrats(List<TypeContrat> typeContrats) {
        this.typeContrats = typeContrats;
    }

    public List<SiteTechvalley> getSiteTechvalleys() {
        return siteTechvalleys;
    }

    public void setSiteTechvalleys(List<SiteTechvalley> siteTechvalleys) {
        this.siteTechvalleys = siteTechvalleys;
    }

    public List<Domaine> getDomaines() {
        return domaines;
    }

    public void setDomaines(List<Domaine> domaines) {
        this.domaines = domaines;
    }

    public List<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(List<Specialite> specialites) {
        this.specialites = specialites;
    }
}
