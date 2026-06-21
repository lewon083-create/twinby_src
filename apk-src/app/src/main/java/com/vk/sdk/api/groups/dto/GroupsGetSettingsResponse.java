package com.vk.sdk.api.groups.dto;

import a0.u;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.SentryLockReason;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsGetSettingsResponse {

    @b("access")
    @Nullable
    private final GroupsGroupAccess access;

    @b(SentryLockReason.JsonKeys.ADDRESS)
    @Nullable
    private final String address;

    @b("age_limits")
    @Nullable
    private final GroupsGroupAgeLimits ageLimits;

    @b("articles")
    private final int articles;

    @b("audio")
    @NotNull
    private final GroupsGroupAudio audio;

    @b("city_id")
    private final int cityId;

    @b("city_name")
    @NotNull
    private final String cityName;

    @b("contacts")
    @Nullable
    private final BaseBoolInt contacts;

    @b("country_id")
    private final int countryId;

    @b("country_name")
    @NotNull
    private final String countryName;

    @b("description")
    @NotNull
    private final String description;

    @b("docs")
    @NotNull
    private final GroupsGroupDocs docs;

    @b("email")
    @Nullable
    private final String email;

    @b("event_group_id")
    @Nullable
    private final Integer eventGroupId;

    @b("events")
    @Nullable
    private final BaseBoolInt events;

    @b("finish_date")
    @Nullable
    private final Integer finishDate;

    @b("links")
    @Nullable
    private final BaseBoolInt links;

    @b("main_section")
    @Nullable
    private final GroupsGroupFullSection mainSection;

    @b("obscene_filter")
    @NotNull
    private final BaseBoolInt obsceneFilter;

    @b("obscene_stopwords")
    @NotNull
    private final BaseBoolInt obsceneStopwords;

    @b("obscene_words")
    @NotNull
    private final List<String> obsceneWords;

    @b("phone")
    @Nullable
    private final String phone;

    @b("photos")
    @NotNull
    private final GroupsGroupPhotos photos;

    @b("public_category")
    @Nullable
    private final Integer publicCategory;

    @b("public_category_list")
    @Nullable
    private final List<GroupsGroupPublicCategoryList> publicCategoryList;

    @b("public_date")
    @Nullable
    private final String publicDate;

    @b("public_date_label")
    @Nullable
    private final String publicDateLabel;

    @b("public_subcategory")
    @Nullable
    private final Integer publicSubcategory;

    @b("recognize_photo")
    @Nullable
    private final Integer recognizePhoto;

    @b("rss")
    @Nullable
    private final String rss;

    @b("secondary_section")
    @Nullable
    private final GroupsGroupFullSection secondarySection;

    @b("sections_list")
    @Nullable
    private final List<List<Integer>> sectionsList;

    @b("start_date")
    @Nullable
    private final Integer startDate;

    @b("subject")
    @Nullable
    private final Integer subject;

    @b("subject_list")
    @Nullable
    private final List<GroupsSubjectItem> subjectList;

    @b("suggested_privacy")
    @Nullable
    private final GroupsGroupSuggestedPrivacy suggestedPrivacy;

    @b("title")
    @NotNull
    private final String title;

    @b("topics")
    @NotNull
    private final GroupsGroupTopics topics;

    @b("twitter")
    @Nullable
    private final GroupsSettingsTwitter twitter;

    @b(RRWebVideoEvent.EVENT_TAG)
    @NotNull
    private final GroupsGroupVideo video;

    @b("wall")
    @NotNull
    private final GroupsGroupWall wall;

    @b("website")
    @Nullable
    private final String website;

    @b("wiki")
    @NotNull
    private final GroupsGroupWiki wiki;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsGetSettingsResponse(@NotNull GroupsGroupAudio audio, int i, int i10, @NotNull String cityName, int i11, @NotNull String countryName, @NotNull String description, @NotNull GroupsGroupDocs docs, @NotNull BaseBoolInt obsceneFilter, @NotNull BaseBoolInt obsceneStopwords, @NotNull List<String> obsceneWords, @NotNull GroupsGroupPhotos photos, @NotNull String title, @NotNull GroupsGroupTopics topics, @NotNull GroupsGroupVideo video, @NotNull GroupsGroupWall wall, @NotNull GroupsGroupWiki wiki, @Nullable GroupsGroupAccess groupsGroupAccess, @Nullable String str, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable List<? extends List<Integer>> list, @Nullable GroupsGroupFullSection groupsGroupFullSection, @Nullable GroupsGroupFullSection groupsGroupFullSection2, @Nullable GroupsGroupAgeLimits groupsGroupAgeLimits, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<GroupsGroupPublicCategoryList> list2, @Nullable String str2, @Nullable String str3, @Nullable Integer num4, @Nullable String str4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable List<GroupsSubjectItem> list3, @Nullable GroupsGroupSuggestedPrivacy groupsGroupSuggestedPrivacy, @Nullable GroupsSettingsTwitter groupsSettingsTwitter, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(docs, "docs");
        Intrinsics.checkNotNullParameter(obsceneFilter, "obsceneFilter");
        Intrinsics.checkNotNullParameter(obsceneStopwords, "obsceneStopwords");
        Intrinsics.checkNotNullParameter(obsceneWords, "obsceneWords");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(wiki, "wiki");
        this.audio = audio;
        this.articles = i;
        this.cityId = i10;
        this.cityName = cityName;
        this.countryId = i11;
        this.countryName = countryName;
        this.description = description;
        this.docs = docs;
        this.obsceneFilter = obsceneFilter;
        this.obsceneStopwords = obsceneStopwords;
        this.obsceneWords = obsceneWords;
        this.photos = photos;
        this.title = title;
        this.topics = topics;
        this.video = video;
        this.wall = wall;
        this.wiki = wiki;
        this.access = groupsGroupAccess;
        this.address = str;
        this.recognizePhoto = num;
        this.contacts = baseBoolInt;
        this.links = baseBoolInt2;
        this.sectionsList = list;
        this.mainSection = groupsGroupFullSection;
        this.secondarySection = groupsGroupFullSection2;
        this.ageLimits = groupsGroupAgeLimits;
        this.events = baseBoolInt3;
        this.eventGroupId = num2;
        this.publicCategory = num3;
        this.publicCategoryList = list2;
        this.publicDate = str2;
        this.publicDateLabel = str3;
        this.publicSubcategory = num4;
        this.rss = str4;
        this.startDate = num5;
        this.finishDate = num6;
        this.subject = num7;
        this.subjectList = list3;
        this.suggestedPrivacy = groupsGroupSuggestedPrivacy;
        this.twitter = groupsSettingsTwitter;
        this.website = str5;
        this.phone = str6;
        this.email = str7;
    }

    @NotNull
    public final GroupsGroupAudio component1() {
        return this.audio;
    }

    @NotNull
    public final BaseBoolInt component10() {
        return this.obsceneStopwords;
    }

    @NotNull
    public final List<String> component11() {
        return this.obsceneWords;
    }

    @NotNull
    public final GroupsGroupPhotos component12() {
        return this.photos;
    }

    @NotNull
    public final String component13() {
        return this.title;
    }

    @NotNull
    public final GroupsGroupTopics component14() {
        return this.topics;
    }

    @NotNull
    public final GroupsGroupVideo component15() {
        return this.video;
    }

    @NotNull
    public final GroupsGroupWall component16() {
        return this.wall;
    }

    @NotNull
    public final GroupsGroupWiki component17() {
        return this.wiki;
    }

    @Nullable
    public final GroupsGroupAccess component18() {
        return this.access;
    }

    @Nullable
    public final String component19() {
        return this.address;
    }

    public final int component2() {
        return this.articles;
    }

    @Nullable
    public final Integer component20() {
        return this.recognizePhoto;
    }

    @Nullable
    public final BaseBoolInt component21() {
        return this.contacts;
    }

    @Nullable
    public final BaseBoolInt component22() {
        return this.links;
    }

    @Nullable
    public final List<List<Integer>> component23() {
        return this.sectionsList;
    }

    @Nullable
    public final GroupsGroupFullSection component24() {
        return this.mainSection;
    }

    @Nullable
    public final GroupsGroupFullSection component25() {
        return this.secondarySection;
    }

    @Nullable
    public final GroupsGroupAgeLimits component26() {
        return this.ageLimits;
    }

    @Nullable
    public final BaseBoolInt component27() {
        return this.events;
    }

    @Nullable
    public final Integer component28() {
        return this.eventGroupId;
    }

    @Nullable
    public final Integer component29() {
        return this.publicCategory;
    }

    public final int component3() {
        return this.cityId;
    }

    @Nullable
    public final List<GroupsGroupPublicCategoryList> component30() {
        return this.publicCategoryList;
    }

    @Nullable
    public final String component31() {
        return this.publicDate;
    }

    @Nullable
    public final String component32() {
        return this.publicDateLabel;
    }

    @Nullable
    public final Integer component33() {
        return this.publicSubcategory;
    }

    @Nullable
    public final String component34() {
        return this.rss;
    }

    @Nullable
    public final Integer component35() {
        return this.startDate;
    }

    @Nullable
    public final Integer component36() {
        return this.finishDate;
    }

    @Nullable
    public final Integer component37() {
        return this.subject;
    }

    @Nullable
    public final List<GroupsSubjectItem> component38() {
        return this.subjectList;
    }

    @Nullable
    public final GroupsGroupSuggestedPrivacy component39() {
        return this.suggestedPrivacy;
    }

    @NotNull
    public final String component4() {
        return this.cityName;
    }

    @Nullable
    public final GroupsSettingsTwitter component40() {
        return this.twitter;
    }

    @Nullable
    public final String component41() {
        return this.website;
    }

    @Nullable
    public final String component42() {
        return this.phone;
    }

    @Nullable
    public final String component43() {
        return this.email;
    }

    public final int component5() {
        return this.countryId;
    }

    @NotNull
    public final String component6() {
        return this.countryName;
    }

    @NotNull
    public final String component7() {
        return this.description;
    }

    @NotNull
    public final GroupsGroupDocs component8() {
        return this.docs;
    }

    @NotNull
    public final BaseBoolInt component9() {
        return this.obsceneFilter;
    }

    @NotNull
    public final GroupsGetSettingsResponse copy(@NotNull GroupsGroupAudio audio, int i, int i10, @NotNull String cityName, int i11, @NotNull String countryName, @NotNull String description, @NotNull GroupsGroupDocs docs, @NotNull BaseBoolInt obsceneFilter, @NotNull BaseBoolInt obsceneStopwords, @NotNull List<String> obsceneWords, @NotNull GroupsGroupPhotos photos, @NotNull String title, @NotNull GroupsGroupTopics topics, @NotNull GroupsGroupVideo video, @NotNull GroupsGroupWall wall, @NotNull GroupsGroupWiki wiki, @Nullable GroupsGroupAccess groupsGroupAccess, @Nullable String str, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable List<? extends List<Integer>> list, @Nullable GroupsGroupFullSection groupsGroupFullSection, @Nullable GroupsGroupFullSection groupsGroupFullSection2, @Nullable GroupsGroupAgeLimits groupsGroupAgeLimits, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<GroupsGroupPublicCategoryList> list2, @Nullable String str2, @Nullable String str3, @Nullable Integer num4, @Nullable String str4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable List<GroupsSubjectItem> list3, @Nullable GroupsGroupSuggestedPrivacy groupsGroupSuggestedPrivacy, @Nullable GroupsSettingsTwitter groupsSettingsTwitter, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(docs, "docs");
        Intrinsics.checkNotNullParameter(obsceneFilter, "obsceneFilter");
        Intrinsics.checkNotNullParameter(obsceneStopwords, "obsceneStopwords");
        Intrinsics.checkNotNullParameter(obsceneWords, "obsceneWords");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(wiki, "wiki");
        return new GroupsGetSettingsResponse(audio, i, i10, cityName, i11, countryName, description, docs, obsceneFilter, obsceneStopwords, obsceneWords, photos, title, topics, video, wall, wiki, groupsGroupAccess, str, num, baseBoolInt, baseBoolInt2, list, groupsGroupFullSection, groupsGroupFullSection2, groupsGroupAgeLimits, baseBoolInt3, num2, num3, list2, str2, str3, num4, str4, num5, num6, num7, list3, groupsGroupSuggestedPrivacy, groupsSettingsTwitter, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetSettingsResponse)) {
            return false;
        }
        GroupsGetSettingsResponse groupsGetSettingsResponse = (GroupsGetSettingsResponse) obj;
        return this.audio == groupsGetSettingsResponse.audio && this.articles == groupsGetSettingsResponse.articles && this.cityId == groupsGetSettingsResponse.cityId && Intrinsics.a(this.cityName, groupsGetSettingsResponse.cityName) && this.countryId == groupsGetSettingsResponse.countryId && Intrinsics.a(this.countryName, groupsGetSettingsResponse.countryName) && Intrinsics.a(this.description, groupsGetSettingsResponse.description) && this.docs == groupsGetSettingsResponse.docs && this.obsceneFilter == groupsGetSettingsResponse.obsceneFilter && this.obsceneStopwords == groupsGetSettingsResponse.obsceneStopwords && Intrinsics.a(this.obsceneWords, groupsGetSettingsResponse.obsceneWords) && this.photos == groupsGetSettingsResponse.photos && Intrinsics.a(this.title, groupsGetSettingsResponse.title) && this.topics == groupsGetSettingsResponse.topics && this.video == groupsGetSettingsResponse.video && this.wall == groupsGetSettingsResponse.wall && this.wiki == groupsGetSettingsResponse.wiki && this.access == groupsGetSettingsResponse.access && Intrinsics.a(this.address, groupsGetSettingsResponse.address) && Intrinsics.a(this.recognizePhoto, groupsGetSettingsResponse.recognizePhoto) && this.contacts == groupsGetSettingsResponse.contacts && this.links == groupsGetSettingsResponse.links && Intrinsics.a(this.sectionsList, groupsGetSettingsResponse.sectionsList) && this.mainSection == groupsGetSettingsResponse.mainSection && this.secondarySection == groupsGetSettingsResponse.secondarySection && this.ageLimits == groupsGetSettingsResponse.ageLimits && this.events == groupsGetSettingsResponse.events && Intrinsics.a(this.eventGroupId, groupsGetSettingsResponse.eventGroupId) && Intrinsics.a(this.publicCategory, groupsGetSettingsResponse.publicCategory) && Intrinsics.a(this.publicCategoryList, groupsGetSettingsResponse.publicCategoryList) && Intrinsics.a(this.publicDate, groupsGetSettingsResponse.publicDate) && Intrinsics.a(this.publicDateLabel, groupsGetSettingsResponse.publicDateLabel) && Intrinsics.a(this.publicSubcategory, groupsGetSettingsResponse.publicSubcategory) && Intrinsics.a(this.rss, groupsGetSettingsResponse.rss) && Intrinsics.a(this.startDate, groupsGetSettingsResponse.startDate) && Intrinsics.a(this.finishDate, groupsGetSettingsResponse.finishDate) && Intrinsics.a(this.subject, groupsGetSettingsResponse.subject) && Intrinsics.a(this.subjectList, groupsGetSettingsResponse.subjectList) && this.suggestedPrivacy == groupsGetSettingsResponse.suggestedPrivacy && Intrinsics.a(this.twitter, groupsGetSettingsResponse.twitter) && Intrinsics.a(this.website, groupsGetSettingsResponse.website) && Intrinsics.a(this.phone, groupsGetSettingsResponse.phone) && Intrinsics.a(this.email, groupsGetSettingsResponse.email);
    }

    @Nullable
    public final GroupsGroupAccess getAccess() {
        return this.access;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final GroupsGroupAgeLimits getAgeLimits() {
        return this.ageLimits;
    }

    public final int getArticles() {
        return this.articles;
    }

    @NotNull
    public final GroupsGroupAudio getAudio() {
        return this.audio;
    }

    public final int getCityId() {
        return this.cityId;
    }

    @NotNull
    public final String getCityName() {
        return this.cityName;
    }

    @Nullable
    public final BaseBoolInt getContacts() {
        return this.contacts;
    }

    public final int getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final GroupsGroupDocs getDocs() {
        return this.docs;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Integer getEventGroupId() {
        return this.eventGroupId;
    }

    @Nullable
    public final BaseBoolInt getEvents() {
        return this.events;
    }

    @Nullable
    public final Integer getFinishDate() {
        return this.finishDate;
    }

    @Nullable
    public final BaseBoolInt getLinks() {
        return this.links;
    }

    @Nullable
    public final GroupsGroupFullSection getMainSection() {
        return this.mainSection;
    }

    @NotNull
    public final BaseBoolInt getObsceneFilter() {
        return this.obsceneFilter;
    }

    @NotNull
    public final BaseBoolInt getObsceneStopwords() {
        return this.obsceneStopwords;
    }

    @NotNull
    public final List<String> getObsceneWords() {
        return this.obsceneWords;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final GroupsGroupPhotos getPhotos() {
        return this.photos;
    }

    @Nullable
    public final Integer getPublicCategory() {
        return this.publicCategory;
    }

    @Nullable
    public final List<GroupsGroupPublicCategoryList> getPublicCategoryList() {
        return this.publicCategoryList;
    }

    @Nullable
    public final String getPublicDate() {
        return this.publicDate;
    }

    @Nullable
    public final String getPublicDateLabel() {
        return this.publicDateLabel;
    }

    @Nullable
    public final Integer getPublicSubcategory() {
        return this.publicSubcategory;
    }

    @Nullable
    public final Integer getRecognizePhoto() {
        return this.recognizePhoto;
    }

    @Nullable
    public final String getRss() {
        return this.rss;
    }

    @Nullable
    public final GroupsGroupFullSection getSecondarySection() {
        return this.secondarySection;
    }

    @Nullable
    public final List<List<Integer>> getSectionsList() {
        return this.sectionsList;
    }

    @Nullable
    public final Integer getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final Integer getSubject() {
        return this.subject;
    }

    @Nullable
    public final List<GroupsSubjectItem> getSubjectList() {
        return this.subjectList;
    }

    @Nullable
    public final GroupsGroupSuggestedPrivacy getSuggestedPrivacy() {
        return this.suggestedPrivacy;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final GroupsGroupTopics getTopics() {
        return this.topics;
    }

    @Nullable
    public final GroupsSettingsTwitter getTwitter() {
        return this.twitter;
    }

    @NotNull
    public final GroupsGroupVideo getVideo() {
        return this.video;
    }

    @NotNull
    public final GroupsGroupWall getWall() {
        return this.wall;
    }

    @Nullable
    public final String getWebsite() {
        return this.website;
    }

    @NotNull
    public final GroupsGroupWiki getWiki() {
        return this.wiki;
    }

    public int hashCode() {
        int iHashCode = (this.wiki.hashCode() + ((this.wall.hashCode() + ((this.video.hashCode() + ((this.topics.hashCode() + a.e((this.photos.hashCode() + u.i(this.obsceneWords, a.f(this.obsceneStopwords, a.f(this.obsceneFilter, (this.docs.hashCode() + a.e(a.e(u.g(this.countryId, a.e(u.g(this.cityId, u.g(this.articles, this.audio.hashCode() * 31, 31), 31), 31, this.cityName), 31), 31, this.countryName), 31, this.description)) * 31, 31), 31), 31)) * 31, 31, this.title)) * 31)) * 31)) * 31)) * 31;
        GroupsGroupAccess groupsGroupAccess = this.access;
        int iHashCode2 = (iHashCode + (groupsGroupAccess == null ? 0 : groupsGroupAccess.hashCode())) * 31;
        String str = this.address;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.recognizePhoto;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.contacts;
        int iHashCode5 = (iHashCode4 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.links;
        int iHashCode6 = (iHashCode5 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        List<List<Integer>> list = this.sectionsList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsGroupFullSection groupsGroupFullSection = this.mainSection;
        int iHashCode8 = (iHashCode7 + (groupsGroupFullSection == null ? 0 : groupsGroupFullSection.hashCode())) * 31;
        GroupsGroupFullSection groupsGroupFullSection2 = this.secondarySection;
        int iHashCode9 = (iHashCode8 + (groupsGroupFullSection2 == null ? 0 : groupsGroupFullSection2.hashCode())) * 31;
        GroupsGroupAgeLimits groupsGroupAgeLimits = this.ageLimits;
        int iHashCode10 = (iHashCode9 + (groupsGroupAgeLimits == null ? 0 : groupsGroupAgeLimits.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.events;
        int iHashCode11 = (iHashCode10 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        Integer num2 = this.eventGroupId;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.publicCategory;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<GroupsGroupPublicCategoryList> list2 = this.publicCategoryList;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.publicDate;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicDateLabel;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.publicSubcategory;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.rss;
        int iHashCode18 = (iHashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.startDate;
        int iHashCode19 = (iHashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.finishDate;
        int iHashCode20 = (iHashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.subject;
        int iHashCode21 = (iHashCode20 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<GroupsSubjectItem> list3 = this.subjectList;
        int iHashCode22 = (iHashCode21 + (list3 == null ? 0 : list3.hashCode())) * 31;
        GroupsGroupSuggestedPrivacy groupsGroupSuggestedPrivacy = this.suggestedPrivacy;
        int iHashCode23 = (iHashCode22 + (groupsGroupSuggestedPrivacy == null ? 0 : groupsGroupSuggestedPrivacy.hashCode())) * 31;
        GroupsSettingsTwitter groupsSettingsTwitter = this.twitter;
        int iHashCode24 = (iHashCode23 + (groupsSettingsTwitter == null ? 0 : groupsSettingsTwitter.hashCode())) * 31;
        String str5 = this.website;
        int iHashCode25 = (iHashCode24 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        int iHashCode26 = (iHashCode25 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.email;
        return iHashCode26 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        GroupsGroupAudio groupsGroupAudio = this.audio;
        int i = this.articles;
        int i10 = this.cityId;
        String str = this.cityName;
        int i11 = this.countryId;
        String str2 = this.countryName;
        String str3 = this.description;
        GroupsGroupDocs groupsGroupDocs = this.docs;
        BaseBoolInt baseBoolInt = this.obsceneFilter;
        BaseBoolInt baseBoolInt2 = this.obsceneStopwords;
        List<String> list = this.obsceneWords;
        GroupsGroupPhotos groupsGroupPhotos = this.photos;
        String str4 = this.title;
        GroupsGroupTopics groupsGroupTopics = this.topics;
        GroupsGroupVideo groupsGroupVideo = this.video;
        GroupsGroupWall groupsGroupWall = this.wall;
        GroupsGroupWiki groupsGroupWiki = this.wiki;
        GroupsGroupAccess groupsGroupAccess = this.access;
        String str5 = this.address;
        Integer num = this.recognizePhoto;
        BaseBoolInt baseBoolInt3 = this.contacts;
        BaseBoolInt baseBoolInt4 = this.links;
        List<List<Integer>> list2 = this.sectionsList;
        GroupsGroupFullSection groupsGroupFullSection = this.mainSection;
        GroupsGroupFullSection groupsGroupFullSection2 = this.secondarySection;
        GroupsGroupAgeLimits groupsGroupAgeLimits = this.ageLimits;
        BaseBoolInt baseBoolInt5 = this.events;
        Integer num2 = this.eventGroupId;
        Integer num3 = this.publicCategory;
        List<GroupsGroupPublicCategoryList> list3 = this.publicCategoryList;
        String str6 = this.publicDate;
        String str7 = this.publicDateLabel;
        Integer num4 = this.publicSubcategory;
        String str8 = this.rss;
        Integer num5 = this.startDate;
        Integer num6 = this.finishDate;
        Integer num7 = this.subject;
        List<GroupsSubjectItem> list4 = this.subjectList;
        GroupsGroupSuggestedPrivacy groupsGroupSuggestedPrivacy = this.suggestedPrivacy;
        GroupsSettingsTwitter groupsSettingsTwitter = this.twitter;
        String str9 = this.website;
        String str10 = this.phone;
        String str11 = this.email;
        StringBuilder sb2 = new StringBuilder("GroupsGetSettingsResponse(audio=");
        sb2.append(groupsGroupAudio);
        sb2.append(", articles=");
        sb2.append(i);
        sb2.append(", cityId=");
        a.q(i10, ", cityName=", str, ", countryId=", sb2);
        a.q(i11, ", countryName=", str2, ", description=", sb2);
        sb2.append(str3);
        sb2.append(", docs=");
        sb2.append(groupsGroupDocs);
        sb2.append(", obsceneFilter=");
        a.s(sb2, baseBoolInt, ", obsceneStopwords=", baseBoolInt2, ", obsceneWords=");
        sb2.append(list);
        sb2.append(", photos=");
        sb2.append(groupsGroupPhotos);
        sb2.append(", title=");
        sb2.append(str4);
        sb2.append(", topics=");
        sb2.append(groupsGroupTopics);
        sb2.append(", video=");
        sb2.append(groupsGroupVideo);
        sb2.append(", wall=");
        sb2.append(groupsGroupWall);
        sb2.append(", wiki=");
        sb2.append(groupsGroupWiki);
        sb2.append(", access=");
        sb2.append(groupsGroupAccess);
        sb2.append(", address=");
        a.r(num, str5, ", recognizePhoto=", ", contacts=", sb2);
        a.s(sb2, baseBoolInt3, ", links=", baseBoolInt4, ", sectionsList=");
        sb2.append(list2);
        sb2.append(", mainSection=");
        sb2.append(groupsGroupFullSection);
        sb2.append(", secondarySection=");
        sb2.append(groupsGroupFullSection2);
        sb2.append(", ageLimits=");
        sb2.append(groupsGroupAgeLimits);
        sb2.append(", events=");
        sb2.append(baseBoolInt5);
        sb2.append(", eventGroupId=");
        sb2.append(num2);
        sb2.append(", publicCategory=");
        sb2.append(num3);
        sb2.append(", publicCategoryList=");
        sb2.append(list3);
        sb2.append(", publicDate=");
        o.t(sb2, str6, ", publicDateLabel=", str7, ", publicSubcategory=");
        pe.a.r(num4, ", rss=", str8, ", startDate=", sb2);
        a.t(sb2, num5, ", finishDate=", num6, ", subject=");
        sb2.append(num7);
        sb2.append(", subjectList=");
        sb2.append(list4);
        sb2.append(", suggestedPrivacy=");
        sb2.append(groupsGroupSuggestedPrivacy);
        sb2.append(", twitter=");
        sb2.append(groupsSettingsTwitter);
        sb2.append(", website=");
        o.t(sb2, str9, ", phone=", str10, ", email=");
        return u.o(sb2, str11, ")");
    }

    public /* synthetic */ GroupsGetSettingsResponse(GroupsGroupAudio groupsGroupAudio, int i, int i10, String str, int i11, String str2, String str3, GroupsGroupDocs groupsGroupDocs, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, List list, GroupsGroupPhotos groupsGroupPhotos, String str4, GroupsGroupTopics groupsGroupTopics, GroupsGroupVideo groupsGroupVideo, GroupsGroupWall groupsGroupWall, GroupsGroupWiki groupsGroupWiki, GroupsGroupAccess groupsGroupAccess, String str5, Integer num, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, List list2, GroupsGroupFullSection groupsGroupFullSection, GroupsGroupFullSection groupsGroupFullSection2, GroupsGroupAgeLimits groupsGroupAgeLimits, BaseBoolInt baseBoolInt5, Integer num2, Integer num3, List list3, String str6, String str7, Integer num4, String str8, Integer num5, Integer num6, Integer num7, List list4, GroupsGroupSuggestedPrivacy groupsGroupSuggestedPrivacy, GroupsSettingsTwitter groupsSettingsTwitter, String str9, String str10, String str11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupsGroupAudio, i, i10, str, i11, str2, str3, groupsGroupDocs, baseBoolInt, baseBoolInt2, list, groupsGroupPhotos, str4, groupsGroupTopics, groupsGroupVideo, groupsGroupWall, groupsGroupWiki, (i12 & 131072) != 0 ? null : groupsGroupAccess, (i12 & 262144) != 0 ? null : str5, (i12 & 524288) != 0 ? null : num, (i12 & 1048576) != 0 ? null : baseBoolInt3, (i12 & 2097152) != 0 ? null : baseBoolInt4, (i12 & 4194304) != 0 ? null : list2, (i12 & 8388608) != 0 ? null : groupsGroupFullSection, (i12 & 16777216) != 0 ? null : groupsGroupFullSection2, (i12 & 33554432) != 0 ? null : groupsGroupAgeLimits, (i12 & 67108864) != 0 ? null : baseBoolInt5, (i12 & 134217728) != 0 ? null : num2, (i12 & 268435456) != 0 ? null : num3, (i12 & 536870912) != 0 ? null : list3, (i12 & 1073741824) != 0 ? null : str6, (i12 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : str7, (i13 & 1) != 0 ? null : num4, (i13 & 2) != 0 ? null : str8, (i13 & 4) != 0 ? null : num5, (i13 & 8) != 0 ? null : num6, (i13 & 16) != 0 ? null : num7, (i13 & 32) != 0 ? null : list4, (i13 & 64) != 0 ? null : groupsGroupSuggestedPrivacy, (i13 & 128) != 0 ? null : groupsSettingsTwitter, (i13 & 256) != 0 ? null : str9, (i13 & 512) != 0 ? null : str10, (i13 & 1024) != 0 ? null : str11);
    }
}
