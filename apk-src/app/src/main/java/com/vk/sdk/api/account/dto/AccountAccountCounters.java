package com.vk.sdk.api.account.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
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
public final class AccountAccountCounters {

    @b("app_requests")
    @Nullable
    private final Integer appRequests;

    @b("events")
    @Nullable
    private final Integer events;

    @b("faves")
    @Nullable
    private final Integer faves;

    @b("friends")
    @Nullable
    private final Integer friends;

    @b("friends_recommendations")
    @Nullable
    private final Integer friendsRecommendations;

    @b("friends_suggestions")
    @Nullable
    private final Integer friendsSuggestions;

    @b("gifts")
    @Nullable
    private final Integer gifts;

    @b("groups")
    @Nullable
    private final Integer groups;

    @b("memories")
    @Nullable
    private final Integer memories;

    @b("menu_clips_badge")
    @Nullable
    private final Integer menuClipsBadge;

    @b("menu_discover_badge")
    @Nullable
    private final Integer menuDiscoverBadge;

    @b("messages")
    @Nullable
    private final Integer messages;

    @b("notes")
    @Nullable
    private final Integer notes;

    @b("notifications")
    @Nullable
    private final Integer notifications;

    @b("photos")
    @Nullable
    private final Integer photos;

    @b("sdk")
    @Nullable
    private final Integer sdk;

    public AccountAccountCounters() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    @Nullable
    public final Integer component1() {
        return this.appRequests;
    }

    @Nullable
    public final Integer component10() {
        return this.menuClipsBadge;
    }

    @Nullable
    public final Integer component11() {
        return this.messages;
    }

    @Nullable
    public final Integer component12() {
        return this.memories;
    }

    @Nullable
    public final Integer component13() {
        return this.notes;
    }

    @Nullable
    public final Integer component14() {
        return this.notifications;
    }

    @Nullable
    public final Integer component15() {
        return this.photos;
    }

    @Nullable
    public final Integer component16() {
        return this.sdk;
    }

    @Nullable
    public final Integer component2() {
        return this.events;
    }

    @Nullable
    public final Integer component3() {
        return this.faves;
    }

    @Nullable
    public final Integer component4() {
        return this.friends;
    }

    @Nullable
    public final Integer component5() {
        return this.friendsSuggestions;
    }

    @Nullable
    public final Integer component6() {
        return this.friendsRecommendations;
    }

    @Nullable
    public final Integer component7() {
        return this.gifts;
    }

    @Nullable
    public final Integer component8() {
        return this.groups;
    }

    @Nullable
    public final Integer component9() {
        return this.menuDiscoverBadge;
    }

    @NotNull
    public final AccountAccountCounters copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16) {
        return new AccountAccountCounters(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAccountCounters)) {
            return false;
        }
        AccountAccountCounters accountAccountCounters = (AccountAccountCounters) obj;
        return Intrinsics.a(this.appRequests, accountAccountCounters.appRequests) && Intrinsics.a(this.events, accountAccountCounters.events) && Intrinsics.a(this.faves, accountAccountCounters.faves) && Intrinsics.a(this.friends, accountAccountCounters.friends) && Intrinsics.a(this.friendsSuggestions, accountAccountCounters.friendsSuggestions) && Intrinsics.a(this.friendsRecommendations, accountAccountCounters.friendsRecommendations) && Intrinsics.a(this.gifts, accountAccountCounters.gifts) && Intrinsics.a(this.groups, accountAccountCounters.groups) && Intrinsics.a(this.menuDiscoverBadge, accountAccountCounters.menuDiscoverBadge) && Intrinsics.a(this.menuClipsBadge, accountAccountCounters.menuClipsBadge) && Intrinsics.a(this.messages, accountAccountCounters.messages) && Intrinsics.a(this.memories, accountAccountCounters.memories) && Intrinsics.a(this.notes, accountAccountCounters.notes) && Intrinsics.a(this.notifications, accountAccountCounters.notifications) && Intrinsics.a(this.photos, accountAccountCounters.photos) && Intrinsics.a(this.sdk, accountAccountCounters.sdk);
    }

    @Nullable
    public final Integer getAppRequests() {
        return this.appRequests;
    }

    @Nullable
    public final Integer getEvents() {
        return this.events;
    }

    @Nullable
    public final Integer getFaves() {
        return this.faves;
    }

    @Nullable
    public final Integer getFriends() {
        return this.friends;
    }

    @Nullable
    public final Integer getFriendsRecommendations() {
        return this.friendsRecommendations;
    }

    @Nullable
    public final Integer getFriendsSuggestions() {
        return this.friendsSuggestions;
    }

    @Nullable
    public final Integer getGifts() {
        return this.gifts;
    }

    @Nullable
    public final Integer getGroups() {
        return this.groups;
    }

    @Nullable
    public final Integer getMemories() {
        return this.memories;
    }

    @Nullable
    public final Integer getMenuClipsBadge() {
        return this.menuClipsBadge;
    }

    @Nullable
    public final Integer getMenuDiscoverBadge() {
        return this.menuDiscoverBadge;
    }

    @Nullable
    public final Integer getMessages() {
        return this.messages;
    }

    @Nullable
    public final Integer getNotes() {
        return this.notes;
    }

    @Nullable
    public final Integer getNotifications() {
        return this.notifications;
    }

    @Nullable
    public final Integer getPhotos() {
        return this.photos;
    }

    @Nullable
    public final Integer getSdk() {
        return this.sdk;
    }

    public int hashCode() {
        Integer num = this.appRequests;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.events;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.faves;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.friends;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.friendsSuggestions;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.friendsRecommendations;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.gifts;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.groups;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.menuDiscoverBadge;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.menuClipsBadge;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.messages;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.memories;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.notes;
        int iHashCode13 = (iHashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.notifications;
        int iHashCode14 = (iHashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.photos;
        int iHashCode15 = (iHashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.sdk;
        return iHashCode15 + (num16 != null ? num16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.appRequests;
        Integer num2 = this.events;
        Integer num3 = this.faves;
        Integer num4 = this.friends;
        Integer num5 = this.friendsSuggestions;
        Integer num6 = this.friendsRecommendations;
        Integer num7 = this.gifts;
        Integer num8 = this.groups;
        Integer num9 = this.menuDiscoverBadge;
        Integer num10 = this.menuClipsBadge;
        Integer num11 = this.messages;
        Integer num12 = this.memories;
        Integer num13 = this.notes;
        Integer num14 = this.notifications;
        Integer num15 = this.photos;
        Integer num16 = this.sdk;
        StringBuilder sbO = om1.o("AccountAccountCounters(appRequests=", ", events=", num, num2, ", faves=");
        a.t(sbO, num3, ", friends=", num4, ", friendsSuggestions=");
        a.t(sbO, num5, ", friendsRecommendations=", num6, ", gifts=");
        a.t(sbO, num7, ", groups=", num8, ", menuDiscoverBadge=");
        a.t(sbO, num9, ", menuClipsBadge=", num10, ", messages=");
        a.t(sbO, num11, ", memories=", num12, ", notes=");
        a.t(sbO, num13, ", notifications=", num14, ", photos=");
        sbO.append(num15);
        sbO.append(", sdk=");
        sbO.append(num16);
        sbO.append(")");
        return sbO.toString();
    }

    public AccountAccountCounters(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16) {
        this.appRequests = num;
        this.events = num2;
        this.faves = num3;
        this.friends = num4;
        this.friendsSuggestions = num5;
        this.friendsRecommendations = num6;
        this.gifts = num7;
        this.groups = num8;
        this.menuDiscoverBadge = num9;
        this.menuClipsBadge = num10;
        this.messages = num11;
        this.memories = num12;
        this.notes = num13;
        this.notifications = num14;
        this.photos = num15;
        this.sdk = num16;
    }

    public /* synthetic */ AccountAccountCounters(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : num14, (i & 16384) != 0 ? null : num15, (i & 32768) != 0 ? null : num16);
    }
}
