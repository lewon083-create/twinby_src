package com.vk.sdk.api.leadForms.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
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
public final class LeadFormsForm {

    @b("active")
    @Nullable
    private final BaseBoolInt active;

    @b("confirmation")
    @Nullable
    private final String confirmation;

    @b("description")
    @Nullable
    private final String description;

    @b("form_id")
    private final int formId;

    @b("group_id")
    @NotNull
    private final UserId groupId;

    @b("leads_count")
    private final int leadsCount;

    @b("name")
    @Nullable
    private final String name;

    @b("notify_admins")
    @Nullable
    private final String notifyAdmins;

    @b("notify_emails")
    @Nullable
    private final String notifyEmails;

    @b("once_per_user")
    @Nullable
    private final Integer oncePerUser;

    @b("photo")
    @Nullable
    private final String photo;

    @b("pixel_code")
    @Nullable
    private final String pixelCode;

    @b("policy_link_url")
    @Nullable
    private final String policyLinkUrl;

    @b("questions")
    @Nullable
    private final List<LeadFormsQuestionItem> questions;

    @b("site_link_url")
    @Nullable
    private final String siteLinkUrl;

    @b("title")
    @Nullable
    private final String title;

    @b("url")
    @NotNull
    private final String url;

    public LeadFormsForm(int i, @NotNull UserId groupId, int i10, @NotNull String url, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<LeadFormsQuestionItem> list, @Nullable BaseBoolInt baseBoolInt, @Nullable String str8, @Nullable Integer num, @Nullable String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.formId = i;
        this.groupId = groupId;
        this.leadsCount = i10;
        this.url = url;
        this.photo = str;
        this.name = str2;
        this.title = str3;
        this.description = str4;
        this.confirmation = str5;
        this.siteLinkUrl = str6;
        this.policyLinkUrl = str7;
        this.questions = list;
        this.active = baseBoolInt;
        this.pixelCode = str8;
        this.oncePerUser = num;
        this.notifyAdmins = str9;
        this.notifyEmails = str10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadFormsForm copy$default(LeadFormsForm leadFormsForm, int i, UserId userId, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, BaseBoolInt baseBoolInt, String str9, Integer num, String str10, String str11, int i11, Object obj) {
        String str12;
        String str13;
        int i12;
        LeadFormsForm leadFormsForm2;
        Integer num2;
        UserId userId2;
        int i13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        List list2;
        BaseBoolInt baseBoolInt2;
        String str22;
        int i14 = (i11 & 1) != 0 ? leadFormsForm.formId : i;
        UserId userId3 = (i11 & 2) != 0 ? leadFormsForm.groupId : userId;
        int i15 = (i11 & 4) != 0 ? leadFormsForm.leadsCount : i10;
        String str23 = (i11 & 8) != 0 ? leadFormsForm.url : str;
        String str24 = (i11 & 16) != 0 ? leadFormsForm.photo : str2;
        String str25 = (i11 & 32) != 0 ? leadFormsForm.name : str3;
        String str26 = (i11 & 64) != 0 ? leadFormsForm.title : str4;
        String str27 = (i11 & 128) != 0 ? leadFormsForm.description : str5;
        String str28 = (i11 & 256) != 0 ? leadFormsForm.confirmation : str6;
        String str29 = (i11 & 512) != 0 ? leadFormsForm.siteLinkUrl : str7;
        String str30 = (i11 & 1024) != 0 ? leadFormsForm.policyLinkUrl : str8;
        List list3 = (i11 & 2048) != 0 ? leadFormsForm.questions : list;
        BaseBoolInt baseBoolInt3 = (i11 & 4096) != 0 ? leadFormsForm.active : baseBoolInt;
        String str31 = (i11 & 8192) != 0 ? leadFormsForm.pixelCode : str9;
        int i16 = i14;
        Integer num3 = (i11 & 16384) != 0 ? leadFormsForm.oncePerUser : num;
        String str32 = (i11 & 32768) != 0 ? leadFormsForm.notifyAdmins : str10;
        if ((i11 & 65536) != 0) {
            str13 = str32;
            str12 = leadFormsForm.notifyEmails;
            num2 = num3;
            userId2 = userId3;
            i13 = i15;
            str14 = str23;
            str15 = str24;
            str16 = str25;
            str17 = str26;
            str18 = str27;
            str19 = str28;
            str20 = str29;
            str21 = str30;
            list2 = list3;
            baseBoolInt2 = baseBoolInt3;
            str22 = str31;
            i12 = i16;
            leadFormsForm2 = leadFormsForm;
        } else {
            str12 = str11;
            str13 = str32;
            i12 = i16;
            leadFormsForm2 = leadFormsForm;
            num2 = num3;
            userId2 = userId3;
            i13 = i15;
            str14 = str23;
            str15 = str24;
            str16 = str25;
            str17 = str26;
            str18 = str27;
            str19 = str28;
            str20 = str29;
            str21 = str30;
            list2 = list3;
            baseBoolInt2 = baseBoolInt3;
            str22 = str31;
        }
        return leadFormsForm2.copy(i12, userId2, i13, str14, str15, str16, str17, str18, str19, str20, str21, list2, baseBoolInt2, str22, num2, str13, str12);
    }

    public final int component1() {
        return this.formId;
    }

    @Nullable
    public final String component10() {
        return this.siteLinkUrl;
    }

    @Nullable
    public final String component11() {
        return this.policyLinkUrl;
    }

    @Nullable
    public final List<LeadFormsQuestionItem> component12() {
        return this.questions;
    }

    @Nullable
    public final BaseBoolInt component13() {
        return this.active;
    }

    @Nullable
    public final String component14() {
        return this.pixelCode;
    }

    @Nullable
    public final Integer component15() {
        return this.oncePerUser;
    }

    @Nullable
    public final String component16() {
        return this.notifyAdmins;
    }

    @Nullable
    public final String component17() {
        return this.notifyEmails;
    }

    @NotNull
    public final UserId component2() {
        return this.groupId;
    }

    public final int component3() {
        return this.leadsCount;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @Nullable
    public final String component5() {
        return this.photo;
    }

    @Nullable
    public final String component6() {
        return this.name;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    @Nullable
    public final String component8() {
        return this.description;
    }

    @Nullable
    public final String component9() {
        return this.confirmation;
    }

    @NotNull
    public final LeadFormsForm copy(int i, @NotNull UserId groupId, int i10, @NotNull String url, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable List<LeadFormsQuestionItem> list, @Nullable BaseBoolInt baseBoolInt, @Nullable String str8, @Nullable Integer num, @Nullable String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(url, "url");
        return new LeadFormsForm(i, groupId, i10, url, str, str2, str3, str4, str5, str6, str7, list, baseBoolInt, str8, num, str9, str10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsForm)) {
            return false;
        }
        LeadFormsForm leadFormsForm = (LeadFormsForm) obj;
        return this.formId == leadFormsForm.formId && Intrinsics.a(this.groupId, leadFormsForm.groupId) && this.leadsCount == leadFormsForm.leadsCount && Intrinsics.a(this.url, leadFormsForm.url) && Intrinsics.a(this.photo, leadFormsForm.photo) && Intrinsics.a(this.name, leadFormsForm.name) && Intrinsics.a(this.title, leadFormsForm.title) && Intrinsics.a(this.description, leadFormsForm.description) && Intrinsics.a(this.confirmation, leadFormsForm.confirmation) && Intrinsics.a(this.siteLinkUrl, leadFormsForm.siteLinkUrl) && Intrinsics.a(this.policyLinkUrl, leadFormsForm.policyLinkUrl) && Intrinsics.a(this.questions, leadFormsForm.questions) && this.active == leadFormsForm.active && Intrinsics.a(this.pixelCode, leadFormsForm.pixelCode) && Intrinsics.a(this.oncePerUser, leadFormsForm.oncePerUser) && Intrinsics.a(this.notifyAdmins, leadFormsForm.notifyAdmins) && Intrinsics.a(this.notifyEmails, leadFormsForm.notifyEmails);
    }

    @Nullable
    public final BaseBoolInt getActive() {
        return this.active;
    }

    @Nullable
    public final String getConfirmation() {
        return this.confirmation;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getFormId() {
        return this.formId;
    }

    @NotNull
    public final UserId getGroupId() {
        return this.groupId;
    }

    public final int getLeadsCount() {
        return this.leadsCount;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNotifyAdmins() {
        return this.notifyAdmins;
    }

    @Nullable
    public final String getNotifyEmails() {
        return this.notifyEmails;
    }

    @Nullable
    public final Integer getOncePerUser() {
        return this.oncePerUser;
    }

    @Nullable
    public final String getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getPixelCode() {
        return this.pixelCode;
    }

    @Nullable
    public final String getPolicyLinkUrl() {
        return this.policyLinkUrl;
    }

    @Nullable
    public final List<LeadFormsQuestionItem> getQuestions() {
        return this.questions;
    }

    @Nullable
    public final String getSiteLinkUrl() {
        return this.siteLinkUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iE = a.e(u.g(this.leadsCount, o.e(this.groupId, Integer.hashCode(this.formId) * 31, 31), 31), 31, this.url);
        String str = this.photo;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.confirmation;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.siteLinkUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.policyLinkUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<LeadFormsQuestionItem> list = this.questions;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.active;
        int iHashCode9 = (iHashCode8 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        String str8 = this.pixelCode;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.oncePerUser;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.notifyAdmins;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.notifyEmails;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.formId;
        UserId userId = this.groupId;
        int i10 = this.leadsCount;
        String str = this.url;
        String str2 = this.photo;
        String str3 = this.name;
        String str4 = this.title;
        String str5 = this.description;
        String str6 = this.confirmation;
        String str7 = this.siteLinkUrl;
        String str8 = this.policyLinkUrl;
        List<LeadFormsQuestionItem> list = this.questions;
        BaseBoolInt baseBoolInt = this.active;
        String str9 = this.pixelCode;
        Integer num = this.oncePerUser;
        String str10 = this.notifyAdmins;
        String str11 = this.notifyEmails;
        StringBuilder sb2 = new StringBuilder("LeadFormsForm(formId=");
        sb2.append(i);
        sb2.append(", groupId=");
        sb2.append(userId);
        sb2.append(", leadsCount=");
        a.q(i10, ", url=", str, ", photo=", sb2);
        o.t(sb2, str2, ", name=", str3, ", title=");
        o.t(sb2, str4, ", description=", str5, ", confirmation=");
        o.t(sb2, str6, ", siteLinkUrl=", str7, ", policyLinkUrl=");
        sb2.append(str8);
        sb2.append(", questions=");
        sb2.append(list);
        sb2.append(", active=");
        sb2.append(baseBoolInt);
        sb2.append(", pixelCode=");
        sb2.append(str9);
        sb2.append(", oncePerUser=");
        pe.a.r(num, ", notifyAdmins=", str10, ", notifyEmails=", sb2);
        return u.o(sb2, str11, ")");
    }

    public /* synthetic */ LeadFormsForm(int i, UserId userId, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, BaseBoolInt baseBoolInt, String str9, Integer num, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, i10, str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : list, (i11 & 4096) != 0 ? null : baseBoolInt, (i11 & 8192) != 0 ? null : str9, (i11 & 16384) != 0 ? null : num, (32768 & i11) != 0 ? null : str10, (i11 & 65536) != 0 ? null : str11);
    }
}
