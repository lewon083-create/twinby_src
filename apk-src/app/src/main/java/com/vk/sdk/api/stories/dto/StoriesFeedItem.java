package com.vk.sdk.api.stories.dto;

import com.vk.sdk.api.apps.dto.AppsAppMin;
import gf.a;
import io.sentry.protocol.App;
import java.util.List;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class StoriesFeedItem {

    @b(App.TYPE)
    @Nullable
    private final AppsAppMin app;

    @b("birthday_user_id")
    @Nullable
    private final Integer birthdayUserId;

    @b("grouped")
    @Nullable
    private final List<StoriesFeedItem> grouped;

    @b("has_unseen")
    @Nullable
    private final Boolean hasUnseen;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final String f15237id;

    @b("name")
    @Nullable
    private final String name;

    @b("promo_data")
    @Nullable
    private final StoriesPromoBlock promoData;

    @b("stories")
    @Nullable
    private final List<StoriesStory> stories;

    @b("track_code")
    @Nullable
    private final String trackCode;

    @b("type")
    @NotNull
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        PROMO_STORIES("promo_stories"),
        STORIES("stories"),
        LIVE_ACTIVE("live_active"),
        LIVE_FINISHED("live_finished"),
        COMMUNITY_GROUPED_STORIES("community_grouped_stories"),
        APP_GROUPED_STORIES("app_grouped_stories"),
        BIRTHDAY("birthday");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public StoriesFeedItem(@NotNull Type type, @Nullable String str, @Nullable List<StoriesStory> list, @Nullable List<StoriesFeedItem> list2, @Nullable AppsAppMin appsAppMin, @Nullable StoriesPromoBlock storiesPromoBlock, @Nullable Integer num, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.f15237id = str;
        this.stories = list;
        this.grouped = list2;
        this.app = appsAppMin;
        this.promoData = storiesPromoBlock;
        this.birthdayUserId = num;
        this.trackCode = str2;
        this.hasUnseen = bool;
        this.name = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoriesFeedItem copy$default(StoriesFeedItem storiesFeedItem, Type type, String str, List list, List list2, AppsAppMin appsAppMin, StoriesPromoBlock storiesPromoBlock, Integer num, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            type = storiesFeedItem.type;
        }
        if ((i & 2) != 0) {
            str = storiesFeedItem.f15237id;
        }
        if ((i & 4) != 0) {
            list = storiesFeedItem.stories;
        }
        if ((i & 8) != 0) {
            list2 = storiesFeedItem.grouped;
        }
        if ((i & 16) != 0) {
            appsAppMin = storiesFeedItem.app;
        }
        if ((i & 32) != 0) {
            storiesPromoBlock = storiesFeedItem.promoData;
        }
        if ((i & 64) != 0) {
            num = storiesFeedItem.birthdayUserId;
        }
        if ((i & 128) != 0) {
            str2 = storiesFeedItem.trackCode;
        }
        if ((i & 256) != 0) {
            bool = storiesFeedItem.hasUnseen;
        }
        if ((i & 512) != 0) {
            str3 = storiesFeedItem.name;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        Integer num2 = num;
        String str5 = str2;
        AppsAppMin appsAppMin2 = appsAppMin;
        StoriesPromoBlock storiesPromoBlock2 = storiesPromoBlock;
        return storiesFeedItem.copy(type, str, list, list2, appsAppMin2, storiesPromoBlock2, num2, str5, bool2, str4);
    }

    @NotNull
    public final Type component1() {
        return this.type;
    }

    @Nullable
    public final String component10() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.f15237id;
    }

    @Nullable
    public final List<StoriesStory> component3() {
        return this.stories;
    }

    @Nullable
    public final List<StoriesFeedItem> component4() {
        return this.grouped;
    }

    @Nullable
    public final AppsAppMin component5() {
        return this.app;
    }

    @Nullable
    public final StoriesPromoBlock component6() {
        return this.promoData;
    }

    @Nullable
    public final Integer component7() {
        return this.birthdayUserId;
    }

    @Nullable
    public final String component8() {
        return this.trackCode;
    }

    @Nullable
    public final Boolean component9() {
        return this.hasUnseen;
    }

    @NotNull
    public final StoriesFeedItem copy(@NotNull Type type, @Nullable String str, @Nullable List<StoriesStory> list, @Nullable List<StoriesFeedItem> list2, @Nullable AppsAppMin appsAppMin, @Nullable StoriesPromoBlock storiesPromoBlock, @Nullable Integer num, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new StoriesFeedItem(type, str, list, list2, appsAppMin, storiesPromoBlock, num, str2, bool, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesFeedItem)) {
            return false;
        }
        StoriesFeedItem storiesFeedItem = (StoriesFeedItem) obj;
        return this.type == storiesFeedItem.type && Intrinsics.a(this.f15237id, storiesFeedItem.f15237id) && Intrinsics.a(this.stories, storiesFeedItem.stories) && Intrinsics.a(this.grouped, storiesFeedItem.grouped) && Intrinsics.a(this.app, storiesFeedItem.app) && Intrinsics.a(this.promoData, storiesFeedItem.promoData) && Intrinsics.a(this.birthdayUserId, storiesFeedItem.birthdayUserId) && Intrinsics.a(this.trackCode, storiesFeedItem.trackCode) && Intrinsics.a(this.hasUnseen, storiesFeedItem.hasUnseen) && Intrinsics.a(this.name, storiesFeedItem.name);
    }

    @Nullable
    public final AppsAppMin getApp() {
        return this.app;
    }

    @Nullable
    public final Integer getBirthdayUserId() {
        return this.birthdayUserId;
    }

    @Nullable
    public final List<StoriesFeedItem> getGrouped() {
        return this.grouped;
    }

    @Nullable
    public final Boolean getHasUnseen() {
        return this.hasUnseen;
    }

    @Nullable
    public final String getId() {
        return this.f15237id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final StoriesPromoBlock getPromoData() {
        return this.promoData;
    }

    @Nullable
    public final List<StoriesStory> getStories() {
        return this.stories;
    }

    @Nullable
    public final String getTrackCode() {
        return this.trackCode;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.f15237id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<StoriesStory> list = this.stories;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<StoriesFeedItem> list2 = this.grouped;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AppsAppMin appsAppMin = this.app;
        int iHashCode5 = (iHashCode4 + (appsAppMin == null ? 0 : appsAppMin.hashCode())) * 31;
        StoriesPromoBlock storiesPromoBlock = this.promoData;
        int iHashCode6 = (iHashCode5 + (storiesPromoBlock == null ? 0 : storiesPromoBlock.hashCode())) * 31;
        Integer num = this.birthdayUserId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.trackCode;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasUnseen;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Type type = this.type;
        String str = this.f15237id;
        List<StoriesStory> list = this.stories;
        List<StoriesFeedItem> list2 = this.grouped;
        AppsAppMin appsAppMin = this.app;
        StoriesPromoBlock storiesPromoBlock = this.promoData;
        Integer num = this.birthdayUserId;
        String str2 = this.trackCode;
        Boolean bool = this.hasUnseen;
        String str3 = this.name;
        StringBuilder sb2 = new StringBuilder("StoriesFeedItem(type=");
        sb2.append(type);
        sb2.append(", id=");
        sb2.append(str);
        sb2.append(", stories=");
        a.u(sb2, list, ", grouped=", list2, ", app=");
        sb2.append(appsAppMin);
        sb2.append(", promoData=");
        sb2.append(storiesPromoBlock);
        sb2.append(", birthdayUserId=");
        pe.a.r(num, ", trackCode=", str2, ", hasUnseen=", sb2);
        sb2.append(bool);
        sb2.append(", name=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ StoriesFeedItem(Type type, String str, List list, List list2, AppsAppMin appsAppMin, StoriesPromoBlock storiesPromoBlock, Integer num, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : appsAppMin, (i & 32) != 0 ? null : storiesPromoBlock, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str3);
    }
}
