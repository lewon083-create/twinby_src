package com.vk.sdk.api.search.dto;

import com.vk.sdk.api.apps.dto.AppsApp;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.groups.dto.GroupsGroup;
import com.vk.sdk.api.users.dto.UsersUserMin;
import io.sentry.protocol.App;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class SearchHint {

    @b(App.TYPE)
    @Nullable
    private final AppsApp app;

    @b("description")
    @NotNull
    private final String description;

    @b("global")
    @Nullable
    private final BaseBoolInt global;

    @b("group")
    @Nullable
    private final GroupsGroup group;

    @b("link")
    @Nullable
    private final BaseLink link;

    @b("profile")
    @Nullable
    private final UsersUserMin profile;

    @b("section")
    @Nullable
    private final SearchHintSection section;

    @b("type")
    @NotNull
    private final SearchHintType type;

    public SearchHint(@NotNull String description, @NotNull SearchHintType type, @Nullable AppsApp appsApp, @Nullable BaseBoolInt baseBoolInt, @Nullable GroupsGroup groupsGroup, @Nullable UsersUserMin usersUserMin, @Nullable SearchHintSection searchHintSection, @Nullable BaseLink baseLink) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        this.description = description;
        this.type = type;
        this.app = appsApp;
        this.global = baseBoolInt;
        this.group = groupsGroup;
        this.profile = usersUserMin;
        this.section = searchHintSection;
        this.link = baseLink;
    }

    public static /* synthetic */ SearchHint copy$default(SearchHint searchHint, String str, SearchHintType searchHintType, AppsApp appsApp, BaseBoolInt baseBoolInt, GroupsGroup groupsGroup, UsersUserMin usersUserMin, SearchHintSection searchHintSection, BaseLink baseLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchHint.description;
        }
        if ((i & 2) != 0) {
            searchHintType = searchHint.type;
        }
        if ((i & 4) != 0) {
            appsApp = searchHint.app;
        }
        if ((i & 8) != 0) {
            baseBoolInt = searchHint.global;
        }
        if ((i & 16) != 0) {
            groupsGroup = searchHint.group;
        }
        if ((i & 32) != 0) {
            usersUserMin = searchHint.profile;
        }
        if ((i & 64) != 0) {
            searchHintSection = searchHint.section;
        }
        if ((i & 128) != 0) {
            baseLink = searchHint.link;
        }
        SearchHintSection searchHintSection2 = searchHintSection;
        BaseLink baseLink2 = baseLink;
        GroupsGroup groupsGroup2 = groupsGroup;
        UsersUserMin usersUserMin2 = usersUserMin;
        return searchHint.copy(str, searchHintType, appsApp, baseBoolInt, groupsGroup2, usersUserMin2, searchHintSection2, baseLink2);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    @NotNull
    public final SearchHintType component2() {
        return this.type;
    }

    @Nullable
    public final AppsApp component3() {
        return this.app;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.global;
    }

    @Nullable
    public final GroupsGroup component5() {
        return this.group;
    }

    @Nullable
    public final UsersUserMin component6() {
        return this.profile;
    }

    @Nullable
    public final SearchHintSection component7() {
        return this.section;
    }

    @Nullable
    public final BaseLink component8() {
        return this.link;
    }

    @NotNull
    public final SearchHint copy(@NotNull String description, @NotNull SearchHintType type, @Nullable AppsApp appsApp, @Nullable BaseBoolInt baseBoolInt, @Nullable GroupsGroup groupsGroup, @Nullable UsersUserMin usersUserMin, @Nullable SearchHintSection searchHintSection, @Nullable BaseLink baseLink) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SearchHint(description, type, appsApp, baseBoolInt, groupsGroup, usersUserMin, searchHintSection, baseLink);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHint)) {
            return false;
        }
        SearchHint searchHint = (SearchHint) obj;
        return Intrinsics.a(this.description, searchHint.description) && this.type == searchHint.type && Intrinsics.a(this.app, searchHint.app) && this.global == searchHint.global && Intrinsics.a(this.group, searchHint.group) && Intrinsics.a(this.profile, searchHint.profile) && this.section == searchHint.section && Intrinsics.a(this.link, searchHint.link);
    }

    @Nullable
    public final AppsApp getApp() {
        return this.app;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final BaseBoolInt getGlobal() {
        return this.global;
    }

    @Nullable
    public final GroupsGroup getGroup() {
        return this.group;
    }

    @Nullable
    public final BaseLink getLink() {
        return this.link;
    }

    @Nullable
    public final UsersUserMin getProfile() {
        return this.profile;
    }

    @Nullable
    public final SearchHintSection getSection() {
        return this.section;
    }

    @NotNull
    public final SearchHintType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.description.hashCode() * 31)) * 31;
        AppsApp appsApp = this.app;
        int iHashCode2 = (iHashCode + (appsApp == null ? 0 : appsApp.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.global;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        GroupsGroup groupsGroup = this.group;
        int iHashCode4 = (iHashCode3 + (groupsGroup == null ? 0 : groupsGroup.hashCode())) * 31;
        UsersUserMin usersUserMin = this.profile;
        int iHashCode5 = (iHashCode4 + (usersUserMin == null ? 0 : usersUserMin.hashCode())) * 31;
        SearchHintSection searchHintSection = this.section;
        int iHashCode6 = (iHashCode5 + (searchHintSection == null ? 0 : searchHintSection.hashCode())) * 31;
        BaseLink baseLink = this.link;
        return iHashCode6 + (baseLink != null ? baseLink.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchHint(description=" + this.description + ", type=" + this.type + ", app=" + this.app + ", global=" + this.global + ", group=" + this.group + ", profile=" + this.profile + ", section=" + this.section + ", link=" + this.link + ")";
    }

    public /* synthetic */ SearchHint(String str, SearchHintType searchHintType, AppsApp appsApp, BaseBoolInt baseBoolInt, GroupsGroup groupsGroup, UsersUserMin usersUserMin, SearchHintSection searchHintSection, BaseLink baseLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, searchHintType, (i & 4) != 0 ? null : appsApp, (i & 8) != 0 ? null : baseBoolInt, (i & 16) != 0 ? null : groupsGroup, (i & 32) != 0 ? null : usersUserMin, (i & 64) != 0 ? null : searchHintSection, (i & 128) != 0 ? null : baseLink);
    }
}
