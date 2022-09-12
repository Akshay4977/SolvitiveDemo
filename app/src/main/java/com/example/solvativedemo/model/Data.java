package com.example.solvativedemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("api_model")
    @Expose
    private String apiModel;
    @SerializedName("api_link")
    @Expose
    private String apiLink;
    @SerializedName("is_boosted")
    @Expose
    private Boolean isBoosted;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("alt_titles")
    @Expose
    private Object altTitles;
    @SerializedName("main_reference_number")
    @Expose
    private String mainReferenceNumber;
    @SerializedName("has_not_been_viewed_much")
    @Expose
    private Boolean hasNotBeenViewedMuch;
    @SerializedName("boost_rank")
    @Expose
    private Object boostRank;
    @SerializedName("date_start")
    @Expose
    private Integer dateStart;
    @SerializedName("date_end")
    @Expose
    private Integer dateEnd;
    @SerializedName("date_display")
    @Expose
    private String dateDisplay;
    @SerializedName("date_qualifier_title")
    @Expose
    private String dateQualifierTitle;
    @SerializedName("date_qualifier_id")
    @Expose
    private Integer dateQualifierId;
    @SerializedName("artist_display")
    @Expose
    private String artistDisplay;
    @SerializedName("place_of_origin")
    @Expose
    private String placeOfOrigin;
    @SerializedName("dimensions")
    @Expose
    private String dimensions;
    @SerializedName("medium_display")
    @Expose
    private String mediumDisplay;
    @SerializedName("inscriptions")
    @Expose
    private Object inscriptions;
    @SerializedName("credit_line")
    @Expose
    private String creditLine;
    @SerializedName("catalogue_display")
    @Expose
    private String catalogueDisplay;
    @SerializedName("publication_history")
    @Expose
    private Object publicationHistory;
    @SerializedName("exhibition_history")
    @Expose
    private Object exhibitionHistory;
    @SerializedName("provenance_text")
    @Expose
    private Object provenanceText;
    @SerializedName("publishing_verification_level")
    @Expose
    private String publishingVerificationLevel;
    @SerializedName("internal_department_id")
    @Expose
    private Integer internalDepartmentId;
    @SerializedName("fiscal_year")
    @Expose
    private Object fiscalYear;
    @SerializedName("fiscal_year_deaccession")
    @Expose
    private Object fiscalYearDeaccession;
    @SerializedName("is_public_domain")
    @Expose
    private Boolean isPublicDomain;
    @SerializedName("is_zoomable")
    @Expose
    private Boolean isZoomable;
    @SerializedName("max_zoom_window_size")
    @Expose
    private Integer maxZoomWindowSize;
    @SerializedName("copyright_notice")
    @Expose
    private Object copyrightNotice;
    @SerializedName("has_multimedia_resources")
    @Expose
    private Boolean hasMultimediaResources;
    @SerializedName("has_educational_resources")
    @Expose
    private Boolean hasEducationalResources;
    @SerializedName("colorfulness")
    @Expose
    private Double colorfulness;
    @SerializedName("color")
    @Expose
    private Color color;
    @SerializedName("latitude")
    @Expose
    private Object latitude;
    @SerializedName("longitude")
    @Expose
    private Object longitude;
    @SerializedName("latlon")
    @Expose
    private Object latlon;
    @SerializedName("is_on_view")
    @Expose
    private Boolean isOnView;
    @SerializedName("on_loan_display")
    @Expose
    private String onLoanDisplay;
    @SerializedName("gallery_title")
    @Expose
    private Object galleryTitle;
    @SerializedName("gallery_id")
    @Expose
    private Object galleryId;
    @SerializedName("artwork_type_title")
    @Expose
    private String artworkTypeTitle;
    @SerializedName("artwork_type_id")
    @Expose
    private Integer artworkTypeId;
    @SerializedName("department_title")
    @Expose
    private String departmentTitle;
    @SerializedName("department_id")
    @Expose
    private String departmentId;
    @SerializedName("artist_id")
    @Expose
    private Integer artistId;
    @SerializedName("artist_title")
    @Expose
    private String artistTitle;
    @SerializedName("alt_artist_ids")
    @Expose
    private List<Object> altArtistIds = null;
    @SerializedName("artist_ids")
    @Expose
    private List<Integer> artistIds = null;
    @SerializedName("artist_titles")
    @Expose
    private List<String> artistTitles = null;
    @SerializedName("category_ids")
    @Expose
    private List<String> categoryIds = null;
    @SerializedName("category_titles")
    @Expose
    private List<String> categoryTitles = null;
    @SerializedName("term_titles")
    @Expose
    private List<String> termTitles = null;
    @SerializedName("style_id")
    @Expose
    private Object styleId;
    @SerializedName("style_title")
    @Expose
    private Object styleTitle;
    @SerializedName("alt_style_ids")
    @Expose
    private List<String> altStyleIds = null;
    @SerializedName("style_ids")
    @Expose
    private List<String> styleIds = null;
    @SerializedName("style_titles")
    @Expose
    private List<String> styleTitles = null;
    @SerializedName("classification_id")
    @Expose
    private String classificationId;
    @SerializedName("classification_title")
    @Expose
    private String classificationTitle;
    @SerializedName("alt_classification_ids")
    @Expose
    private List<String> altClassificationIds = null;
    @SerializedName("classification_ids")
    @Expose
    private List<String> classificationIds = null;
    @SerializedName("classification_titles")
    @Expose
    private List<String> classificationTitles = null;
    @SerializedName("subject_id")
    @Expose
    private Object subjectId;
    @SerializedName("alt_subject_ids")
    @Expose
    private List<String> altSubjectIds = null;
    @SerializedName("subject_ids")
    @Expose
    private List<String> subjectIds = null;
    @SerializedName("subject_titles")
    @Expose
    private List<String> subjectTitles = null;
    @SerializedName("material_id")
    @Expose
    private String materialId;
    @SerializedName("alt_material_ids")
    @Expose
    private List<String> altMaterialIds = null;
    @SerializedName("material_ids")
    @Expose
    private List<String> materialIds = null;
    @SerializedName("material_titles")
    @Expose
    private List<String> materialTitles = null;
    @SerializedName("technique_id")
    @Expose
    private Object techniqueId;
    @SerializedName("alt_technique_ids")
    @Expose
    private List<String> altTechniqueIds = null;
    @SerializedName("technique_ids")
    @Expose
    private List<String> techniqueIds = null;
    @SerializedName("technique_titles")
    @Expose
    private List<String> techniqueTitles = null;
    @SerializedName("theme_titles")
    @Expose
    private List<Object> themeTitles = null;
    @SerializedName("image_id")
    @Expose
    private String imageId;
    @SerializedName("alt_image_ids")
    @Expose
    private List<String> altImageIds = null;
    @SerializedName("document_ids")
    @Expose
    private List<String> documentIds = null;
    @SerializedName("sound_ids")
    @Expose
    private List<String> soundIds = null;
    @SerializedName("video_ids")
    @Expose
    private List<Object> videoIds = null;
    @SerializedName("text_ids")
    @Expose
    private List<Object> textIds = null;
    @SerializedName("section_ids")
    @Expose
    private List<Object> sectionIds = null;
    @SerializedName("section_titles")
    @Expose
    private List<Object> sectionTitles = null;
    @SerializedName("site_ids")
    @Expose
    private List<Object> siteIds = null;
    @SerializedName("source_updated_at")
    @Expose
    private String sourceUpdatedAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    public Data(int id, String artistDisplay) {
        this.artistId = id;
        this.artistDisplay = artistDisplay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApiModel() {
        return apiModel;
    }

    public void setApiModel(String apiModel) {
        this.apiModel = apiModel;
    }

    public String getApiLink() {
        return apiLink;
    }

    public void setApiLink(String apiLink) {
        this.apiLink = apiLink;
    }

    public Boolean getIsBoosted() {
        return isBoosted;
    }

    public void setIsBoosted(Boolean isBoosted) {
        this.isBoosted = isBoosted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getAltTitles() {
        return altTitles;
    }

    public void setAltTitles(Object altTitles) {
        this.altTitles = altTitles;
    }

//    public Thumbnail getThumbnail() {
//        return thumbnail;
//    }
//
//    public void setThumbnail(Thumbnail thumbnail) {
//        this.thumbnail = thumbnail;
//    }

    public String getMainReferenceNumber() {
        return mainReferenceNumber;
    }

    public void setMainReferenceNumber(String mainReferenceNumber) {
        this.mainReferenceNumber = mainReferenceNumber;
    }

    public Boolean getHasNotBeenViewedMuch() {
        return hasNotBeenViewedMuch;
    }

    public void setHasNotBeenViewedMuch(Boolean hasNotBeenViewedMuch) {
        this.hasNotBeenViewedMuch = hasNotBeenViewedMuch;
    }

    public Object getBoostRank() {
        return boostRank;
    }

    public void setBoostRank(Object boostRank) {
        this.boostRank = boostRank;
    }

    public Integer getDateStart() {
        return dateStart;
    }

    public void setDateStart(Integer dateStart) {
        this.dateStart = dateStart;
    }

    public Integer getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Integer dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDateDisplay() {
        return dateDisplay;
    }

    public void setDateDisplay(String dateDisplay) {
        this.dateDisplay = dateDisplay;
    }

    public String getDateQualifierTitle() {
        return dateQualifierTitle;
    }

    public void setDateQualifierTitle(String dateQualifierTitle) {
        this.dateQualifierTitle = dateQualifierTitle;
    }

    public Integer getDateQualifierId() {
        return dateQualifierId;
    }

    public void setDateQualifierId(Integer dateQualifierId) {
        this.dateQualifierId = dateQualifierId;
    }

    public String getArtistDisplay() {
        return artistDisplay;
    }

    public void setArtistDisplay(String artistDisplay) {
        this.artistDisplay = artistDisplay;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getMediumDisplay() {
        return mediumDisplay;
    }

    public void setMediumDisplay(String mediumDisplay) {
        this.mediumDisplay = mediumDisplay;
    }

    public Object getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(Object inscriptions) {
        this.inscriptions = inscriptions;
    }

    public String getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(String creditLine) {
        this.creditLine = creditLine;
    }

    public String getCatalogueDisplay() {
        return catalogueDisplay;
    }

    public void setCatalogueDisplay(String catalogueDisplay) {
        this.catalogueDisplay = catalogueDisplay;
    }

    public Object getPublicationHistory() {
        return publicationHistory;
    }

    public void setPublicationHistory(Object publicationHistory) {
        this.publicationHistory = publicationHistory;
    }

    public Object getExhibitionHistory() {
        return exhibitionHistory;
    }

    public void setExhibitionHistory(Object exhibitionHistory) {
        this.exhibitionHistory = exhibitionHistory;
    }

    public Object getProvenanceText() {
        return provenanceText;
    }

    public void setProvenanceText(Object provenanceText) {
        this.provenanceText = provenanceText;
    }

    public String getPublishingVerificationLevel() {
        return publishingVerificationLevel;
    }

    public void setPublishingVerificationLevel(String publishingVerificationLevel) {
        this.publishingVerificationLevel = publishingVerificationLevel;
    }

    public Integer getInternalDepartmentId() {
        return internalDepartmentId;
    }

    public void setInternalDepartmentId(Integer internalDepartmentId) {
        this.internalDepartmentId = internalDepartmentId;
    }

    public Object getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Object fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public Object getFiscalYearDeaccession() {
        return fiscalYearDeaccession;
    }

    public void setFiscalYearDeaccession(Object fiscalYearDeaccession) {
        this.fiscalYearDeaccession = fiscalYearDeaccession;
    }

    public Boolean getIsPublicDomain() {
        return isPublicDomain;
    }

    public void setIsPublicDomain(Boolean isPublicDomain) {
        this.isPublicDomain = isPublicDomain;
    }

    public Boolean getIsZoomable() {
        return isZoomable;
    }

    public void setIsZoomable(Boolean isZoomable) {
        this.isZoomable = isZoomable;
    }

    public Integer getMaxZoomWindowSize() {
        return maxZoomWindowSize;
    }

    public void setMaxZoomWindowSize(Integer maxZoomWindowSize) {
        this.maxZoomWindowSize = maxZoomWindowSize;
    }

    public Object getCopyrightNotice() {
        return copyrightNotice;
    }

    public void setCopyrightNotice(Object copyrightNotice) {
        this.copyrightNotice = copyrightNotice;
    }

    public Boolean getHasMultimediaResources() {
        return hasMultimediaResources;
    }

    public void setHasMultimediaResources(Boolean hasMultimediaResources) {
        this.hasMultimediaResources = hasMultimediaResources;
    }

    public Boolean getHasEducationalResources() {
        return hasEducationalResources;
    }

    public void setHasEducationalResources(Boolean hasEducationalResources) {
        this.hasEducationalResources = hasEducationalResources;
    }

    public Double getColorfulness() {
        return colorfulness;
    }

    public void setColorfulness(Double colorfulness) {
        this.colorfulness = colorfulness;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Object getLatlon() {
        return latlon;
    }

    public void setLatlon(Object latlon) {
        this.latlon = latlon;
    }

    public Boolean getIsOnView() {
        return isOnView;
    }

    public void setIsOnView(Boolean isOnView) {
        this.isOnView = isOnView;
    }

    public String getOnLoanDisplay() {
        return onLoanDisplay;
    }

    public void setOnLoanDisplay(String onLoanDisplay) {
        this.onLoanDisplay = onLoanDisplay;
    }

    public Object getGalleryTitle() {
        return galleryTitle;
    }

    public void setGalleryTitle(Object galleryTitle) {
        this.galleryTitle = galleryTitle;
    }

    public Object getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(Object galleryId) {
        this.galleryId = galleryId;
    }

    public String getArtworkTypeTitle() {
        return artworkTypeTitle;
    }

    public void setArtworkTypeTitle(String artworkTypeTitle) {
        this.artworkTypeTitle = artworkTypeTitle;
    }

    public Integer getArtworkTypeId() {
        return artworkTypeId;
    }

    public void setArtworkTypeId(Integer artworkTypeId) {
        this.artworkTypeId = artworkTypeId;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistTitle() {
        return artistTitle;
    }

    public void setArtistTitle(String artistTitle) {
        this.artistTitle = artistTitle;
    }

    public List<Object> getAltArtistIds() {
        return altArtistIds;
    }

    public void setAltArtistIds(List<Object> altArtistIds) {
        this.altArtistIds = altArtistIds;
    }

    public List<Integer> getArtistIds() {
        return artistIds;
    }

    public void setArtistIds(List<Integer> artistIds) {
        this.artistIds = artistIds;
    }

    public List<String> getArtistTitles() {
        return artistTitles;
    }

    public void setArtistTitles(List<String> artistTitles) {
        this.artistTitles = artistTitles;
    }

    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public List<String> getCategoryTitles() {
        return categoryTitles;
    }

    public void setCategoryTitles(List<String> categoryTitles) {
        this.categoryTitles = categoryTitles;
    }

    public List<String> getTermTitles() {
        return termTitles;
    }

    public void setTermTitles(List<String> termTitles) {
        this.termTitles = termTitles;
    }

    public Object getStyleId() {
        return styleId;
    }

    public void setStyleId(Object styleId) {
        this.styleId = styleId;
    }

    public Object getStyleTitle() {
        return styleTitle;
    }

    public void setStyleTitle(Object styleTitle) {
        this.styleTitle = styleTitle;
    }

    public List<String> getAltStyleIds() {
        return altStyleIds;
    }

    public void setAltStyleIds(List<String> altStyleIds) {
        this.altStyleIds = altStyleIds;
    }

    public List<String> getStyleIds() {
        return styleIds;
    }

    public void setStyleIds(List<String> styleIds) {
        this.styleIds = styleIds;
    }

    public List<String> getStyleTitles() {
        return styleTitles;
    }

    public void setStyleTitles(List<String> styleTitles) {
        this.styleTitles = styleTitles;
    }

    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationTitle() {
        return classificationTitle;
    }

    public void setClassificationTitle(String classificationTitle) {
        this.classificationTitle = classificationTitle;
    }

    public List<String> getAltClassificationIds() {
        return altClassificationIds;
    }

    public void setAltClassificationIds(List<String> altClassificationIds) {
        this.altClassificationIds = altClassificationIds;
    }

    public List<String> getClassificationIds() {
        return classificationIds;
    }

    public void setClassificationIds(List<String> classificationIds) {
        this.classificationIds = classificationIds;
    }

    public List<String> getClassificationTitles() {
        return classificationTitles;
    }

    public void setClassificationTitles(List<String> classificationTitles) {
        this.classificationTitles = classificationTitles;
    }

    public Object getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Object subjectId) {
        this.subjectId = subjectId;
    }

    public List<String> getAltSubjectIds() {
        return altSubjectIds;
    }

    public void setAltSubjectIds(List<String> altSubjectIds) {
        this.altSubjectIds = altSubjectIds;
    }

    public List<String> getSubjectIds() {
        return subjectIds;
    }

    public void setSubjectIds(List<String> subjectIds) {
        this.subjectIds = subjectIds;
    }

    public List<String> getSubjectTitles() {
        return subjectTitles;
    }

    public void setSubjectTitles(List<String> subjectTitles) {
        this.subjectTitles = subjectTitles;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public List<String> getAltMaterialIds() {
        return altMaterialIds;
    }

    public void setAltMaterialIds(List<String> altMaterialIds) {
        this.altMaterialIds = altMaterialIds;
    }

    public List<String> getMaterialIds() {
        return materialIds;
    }

    public void setMaterialIds(List<String> materialIds) {
        this.materialIds = materialIds;
    }

    public List<String> getMaterialTitles() {
        return materialTitles;
    }

    public void setMaterialTitles(List<String> materialTitles) {
        this.materialTitles = materialTitles;
    }

    public Object getTechniqueId() {
        return techniqueId;
    }

    public void setTechniqueId(Object techniqueId) {
        this.techniqueId = techniqueId;
    }

    public List<String> getAltTechniqueIds() {
        return altTechniqueIds;
    }

    public void setAltTechniqueIds(List<String> altTechniqueIds) {
        this.altTechniqueIds = altTechniqueIds;
    }

    public List<String> getTechniqueIds() {
        return techniqueIds;
    }

    public void setTechniqueIds(List<String> techniqueIds) {
        this.techniqueIds = techniqueIds;
    }

    public List<String> getTechniqueTitles() {
        return techniqueTitles;
    }

    public void setTechniqueTitles(List<String> techniqueTitles) {
        this.techniqueTitles = techniqueTitles;
    }

    public List<Object> getThemeTitles() {
        return themeTitles;
    }

    public void setThemeTitles(List<Object> themeTitles) {
        this.themeTitles = themeTitles;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<String> getAltImageIds() {
        return altImageIds;
    }

    public void setAltImageIds(List<String> altImageIds) {
        this.altImageIds = altImageIds;
    }

    public List<String> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<String> documentIds) {
        this.documentIds = documentIds;
    }

    public List<String> getSoundIds() {
        return soundIds;
    }

    public void setSoundIds(List<String> soundIds) {
        this.soundIds = soundIds;
    }

    public List<Object> getVideoIds() {
        return videoIds;
    }

    public void setVideoIds(List<Object> videoIds) {
        this.videoIds = videoIds;
    }

    public List<Object> getTextIds() {
        return textIds;
    }

    public void setTextIds(List<Object> textIds) {
        this.textIds = textIds;
    }

    public List<Object> getSectionIds() {
        return sectionIds;
    }

    public void setSectionIds(List<Object> sectionIds) {
        this.sectionIds = sectionIds;
    }

    public List<Object> getSectionTitles() {
        return sectionTitles;
    }

    public void setSectionTitles(List<Object> sectionTitles) {
        this.sectionTitles = sectionTitles;
    }

    public List<Object> getSiteIds() {
        return siteIds;
    }

    public void setSiteIds(List<Object> siteIds) {
        this.siteIds = siteIds;
    }


    public String getSourceUpdatedAt() {
        return sourceUpdatedAt;
    }

    public void setSourceUpdatedAt(String sourceUpdatedAt) {
        this.sourceUpdatedAt = sourceUpdatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
