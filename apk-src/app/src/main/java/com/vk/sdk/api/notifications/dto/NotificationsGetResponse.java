package com.vk.sdk.api.notifications.dto;

import com.vk.sdk.api.apps.dto.AppsApp;
import com.vk.sdk.api.groups.dto.GroupsGroup;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.users.dto.UsersUser;
import com.vk.sdk.api.video.dto.VideoVideo;
import gf.a;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class NotificationsGetResponse {

    @b("apps")
    @Nullable
    private final List<AppsApp> apps;

    @b("count")
    @Nullable
    private final Integer count;

    @b("groups")
    @Nullable
    private final List<GroupsGroup> groups;

    @b("items")
    @Nullable
    private final List<NotificationsNotificationItem> items;

    @b("last_viewed")
    @Nullable
    private final Integer lastViewed;

    @b("next_from")
    @Nullable
    private final String nextFrom;

    @b("photos")
    @Nullable
    private final List<PhotosPhoto> photos;

    @b("profiles")
    @Nullable
    private final List<UsersUser> profiles;

    @b("ttl")
    @Nullable
    private final Integer ttl;

    @b("videos")
    @Nullable
    private final List<VideoVideo> videos;

    public NotificationsGetResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationsGetResponse copy$default(NotificationsGetResponse notificationsGetResponse, Integer num, List list, List list2, List list3, Integer num2, List list4, List list5, List list6, String str, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = notificationsGetResponse.count;
        }
        if ((i & 2) != 0) {
            list = notificationsGetResponse.items;
        }
        if ((i & 4) != 0) {
            list2 = notificationsGetResponse.profiles;
        }
        if ((i & 8) != 0) {
            list3 = notificationsGetResponse.groups;
        }
        if ((i & 16) != 0) {
            num2 = notificationsGetResponse.lastViewed;
        }
        if ((i & 32) != 0) {
            list4 = notificationsGetResponse.photos;
        }
        if ((i & 64) != 0) {
            list5 = notificationsGetResponse.videos;
        }
        if ((i & 128) != 0) {
            list6 = notificationsGetResponse.apps;
        }
        if ((i & 256) != 0) {
            str = notificationsGetResponse.nextFrom;
        }
        if ((i & 512) != 0) {
            num3 = notificationsGetResponse.ttl;
        }
        String str2 = str;
        Integer num4 = num3;
        List list7 = list5;
        List list8 = list6;
        Integer num5 = num2;
        List list9 = list4;
        return notificationsGetResponse.copy(num, list, list2, list3, num5, list9, list7, list8, str2, num4);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final Integer component10() {
        return this.ttl;
    }

    @Nullable
    public final List<NotificationsNotificationItem> component2() {
        return this.items;
    }

    @Nullable
    public final List<UsersUser> component3() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroup> component4() {
        return this.groups;
    }

    @Nullable
    public final Integer component5() {
        return this.lastViewed;
    }

    @Nullable
    public final List<PhotosPhoto> component6() {
        return this.photos;
    }

    @Nullable
    public final List<VideoVideo> component7() {
        return this.videos;
    }

    @Nullable
    public final List<AppsApp> component8() {
        return this.apps;
    }

    @Nullable
    public final String component9() {
        return this.nextFrom;
    }

    @NotNull
    public final NotificationsGetResponse copy(@Nullable Integer num, @Nullable List<NotificationsNotificationItem> list, @Nullable List<UsersUser> list2, @Nullable List<GroupsGroup> list3, @Nullable Integer num2, @Nullable List<PhotosPhoto> list4, @Nullable List<VideoVideo> list5, @Nullable List<AppsApp> list6, @Nullable String str, @Nullable Integer num3) {
        return new NotificationsGetResponse(num, list, list2, list3, num2, list4, list5, list6, str, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGetResponse)) {
            return false;
        }
        NotificationsGetResponse notificationsGetResponse = (NotificationsGetResponse) obj;
        return Intrinsics.a(this.count, notificationsGetResponse.count) && Intrinsics.a(this.items, notificationsGetResponse.items) && Intrinsics.a(this.profiles, notificationsGetResponse.profiles) && Intrinsics.a(this.groups, notificationsGetResponse.groups) && Intrinsics.a(this.lastViewed, notificationsGetResponse.lastViewed) && Intrinsics.a(this.photos, notificationsGetResponse.photos) && Intrinsics.a(this.videos, notificationsGetResponse.videos) && Intrinsics.a(this.apps, notificationsGetResponse.apps) && Intrinsics.a(this.nextFrom, notificationsGetResponse.nextFrom) && Intrinsics.a(this.ttl, notificationsGetResponse.ttl);
    }

    @Nullable
    public final List<AppsApp> getApps() {
        return this.apps;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroup> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<NotificationsNotificationItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getLastViewed() {
        return this.lastViewed;
    }

    @Nullable
    public final String getNextFrom() {
        return this.nextFrom;
    }

    @Nullable
    public final List<PhotosPhoto> getPhotos() {
        return this.photos;
    }

    @Nullable
    public final List<UsersUser> getProfiles() {
        return this.profiles;
    }

    @Nullable
    public final Integer getTtl() {
        return this.ttl;
    }

    @Nullable
    public final List<VideoVideo> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<NotificationsNotificationItem> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUser> list2 = this.profiles;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroup> list3 = this.groups;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.lastViewed;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<PhotosPhoto> list4 = this.photos;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<VideoVideo> list5 = this.videos;
        int iHashCode7 = (iHashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<AppsApp> list6 = this.apps;
        int iHashCode8 = (iHashCode7 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str = this.nextFrom;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.ttl;
        return iHashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.count;
        List<NotificationsNotificationItem> list = this.items;
        List<UsersUser> list2 = this.profiles;
        List<GroupsGroup> list3 = this.groups;
        Integer num2 = this.lastViewed;
        List<PhotosPhoto> list4 = this.photos;
        List<VideoVideo> list5 = this.videos;
        List<AppsApp> list6 = this.apps;
        String str = this.nextFrom;
        Integer num3 = this.ttl;
        StringBuilder sb2 = new StringBuilder("NotificationsGetResponse(count=");
        sb2.append(num);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", profiles=");
        a.u(sb2, list2, ", groups=", list3, ", lastViewed=");
        sb2.append(num2);
        sb2.append(", photos=");
        sb2.append(list4);
        sb2.append(", videos=");
        a.u(sb2, list5, ", apps=", list6, ", nextFrom=");
        sb2.append(str);
        sb2.append(", ttl=");
        sb2.append(num3);
        sb2.append(")");
        return sb2.toString();
    }

    public NotificationsGetResponse(@Nullable Integer num, @Nullable List<NotificationsNotificationItem> list, @Nullable List<UsersUser> list2, @Nullable List<GroupsGroup> list3, @Nullable Integer num2, @Nullable List<PhotosPhoto> list4, @Nullable List<VideoVideo> list5, @Nullable List<AppsApp> list6, @Nullable String str, @Nullable Integer num3) {
        this.count = num;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.lastViewed = num2;
        this.photos = list4;
        this.videos = list5;
        this.apps = list6;
        this.nextFrom = str;
        this.ttl = num3;
    }

    public /* synthetic */ NotificationsGetResponse(Integer num, List list, List list2, List list3, Integer num2, List list4, List list5, List list6, String str, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : list6, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : num3);
    }
}
