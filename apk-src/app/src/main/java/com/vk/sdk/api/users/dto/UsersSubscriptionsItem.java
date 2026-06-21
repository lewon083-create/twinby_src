package com.vk.sdk.api.users.dto;

import a0.b1;
import a0.u;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.internal.ads.om1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseCountry;
import com.vk.sdk.api.base.dto.BaseCropPhoto;
import com.vk.sdk.api.base.dto.BaseObject;
import com.vk.sdk.api.base.dto.BaseSex;
import com.vk.sdk.api.friends.dto.FriendsFriendStatusStatus;
import com.vk.sdk.api.friends.dto.FriendsRequestsMutual;
import com.vk.sdk.api.groups.dto.GroupsAddressesInfo;
import com.vk.sdk.api.groups.dto.GroupsContactsItem;
import com.vk.sdk.api.groups.dto.GroupsCountersGroup;
import com.vk.sdk.api.groups.dto.GroupsCover;
import com.vk.sdk.api.groups.dto.GroupsGroupAdminLevel;
import com.vk.sdk.api.groups.dto.GroupsGroupBanInfo;
import com.vk.sdk.api.groups.dto.GroupsGroupFullAgeLimits;
import com.vk.sdk.api.groups.dto.GroupsGroupFullMemberStatus;
import com.vk.sdk.api.groups.dto.GroupsGroupFullSection;
import com.vk.sdk.api.groups.dto.GroupsGroupIsClosed;
import com.vk.sdk.api.groups.dto.GroupsGroupType;
import com.vk.sdk.api.groups.dto.GroupsLinksItem;
import com.vk.sdk.api.groups.dto.GroupsLiveCovers;
import com.vk.sdk.api.groups.dto.GroupsMarketInfo;
import com.vk.sdk.api.groups.dto.GroupsOnlineStatus;
import com.vk.sdk.api.groups.dto.GroupsPhotoSize;
import com.vk.sdk.api.video.dto.VideoLiveInfo;
import gf.a;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.n;
import me.o;
import me.p;
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
public abstract class UsersSubscriptionsItem {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Deserializer implements o {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // me.o
        @NotNull
        public UsersSubscriptionsItem deserialize(@NotNull p json, @Nullable Type type, @NotNull n context) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(context, "context");
            String strE = ((p) json.a().f28895b.get("type")).e();
            if (strE != null) {
                switch (strE.hashCode()) {
                    case -309425751:
                        if (strE.equals("profile")) {
                            Object objR = ((b1) context).r(json, UsersUserXtrType.class);
                            Intrinsics.checkNotNullExpressionValue(objR, "context.deserialize(json…sUserXtrType::class.java)");
                            return (UsersSubscriptionsItem) objR;
                        }
                        break;
                    case 3433103:
                        if (strE.equals("page")) {
                            Object objR2 = ((b1) context).r(json, GroupsGroupFull.class);
                            Intrinsics.checkNotNullExpressionValue(objR2, "context.deserialize(json…upsGroupFull::class.java)");
                            return (UsersSubscriptionsItem) objR2;
                        }
                        break;
                    case 96891546:
                        if (strE.equals("event")) {
                            Object objR3 = ((b1) context).r(json, GroupsGroupFull.class);
                            Intrinsics.checkNotNullExpressionValue(objR3, "context.deserialize(json…upsGroupFull::class.java)");
                            return (UsersSubscriptionsItem) objR3;
                        }
                        break;
                    case 98629247:
                        if (strE.equals("group")) {
                            Object objR4 = ((b1) context).r(json, GroupsGroupFull.class);
                            Intrinsics.checkNotNullExpressionValue(objR4, "context.deserialize(json…upsGroupFull::class.java)");
                            return (UsersSubscriptionsItem) objR4;
                        }
                        break;
                }
            }
            throw new IllegalStateException(om1.k("no mapping for the type:", strE));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class GroupsGroupFull extends UsersSubscriptionsItem {

        @b("activity")
        @Nullable
        private final String activity;

        @b("addresses")
        @Nullable
        private final GroupsAddressesInfo addresses;

        @b("admin_level")
        @Nullable
        private final GroupsGroupAdminLevel adminLevel;

        @b("age_limits")
        @Nullable
        private final GroupsGroupFullAgeLimits ageLimits;

        @b(VKApiCodes.PARAM_BAN_INFO)
        @Nullable
        private final GroupsGroupBanInfo banInfo;

        @b("can_create_topic")
        @Nullable
        private final BaseBoolInt canCreateTopic;

        @b("can_message")
        @Nullable
        private final BaseBoolInt canMessage;

        @b("can_post")
        @Nullable
        private final BaseBoolInt canPost;

        @b("can_see_all_posts")
        @Nullable
        private final BaseBoolInt canSeeAllPosts;

        @b("can_send_notify")
        @Nullable
        private final BaseBoolInt canSendNotify;

        @b("can_subscribe_podcasts")
        @Nullable
        private final Boolean canSubscribePodcasts;

        @b("can_subscribe_posts")
        @Nullable
        private final Boolean canSubscribePosts;

        @b("can_suggest")
        @Nullable
        private final BaseBoolInt canSuggest;

        @b("can_upload_doc")
        @Nullable
        private final BaseBoolInt canUploadDoc;

        @b("can_upload_story")
        @Nullable
        private final BaseBoolInt canUploadStory;

        @b("can_upload_video")
        @Nullable
        private final BaseBoolInt canUploadVideo;

        @b(Geo.JsonKeys.CITY)
        @Nullable
        private final BaseObject city;

        @b("clips_count")
        @Nullable
        private final Integer clipsCount;

        @b("contacts")
        @Nullable
        private final List<GroupsContactsItem> contacts;

        @b("counters")
        @Nullable
        private final GroupsCountersGroup counters;

        @b(AdRevenueScheme.COUNTRY)
        @Nullable
        private final BaseCountry country;

        @b("cover")
        @Nullable
        private final GroupsCover cover;

        @b("crop_photo")
        @Nullable
        private final BaseCropPhoto cropPhoto;

        @b("deactivated")
        @Nullable
        private final String deactivated;

        @b("description")
        @Nullable
        private final String description;

        @b("est_date")
        @Nullable
        private final String estDate;

        @b("finish_date")
        @Nullable
        private final Integer finishDate;

        @b("fixed_post")
        @Nullable
        private final Integer fixedPost;

        @b("has_group_channel")
        @Nullable
        private final Boolean hasGroupChannel;

        @b("has_market_app")
        @Nullable
        private final Boolean hasMarketApp;

        @b("has_photo")
        @Nullable
        private final BaseBoolInt hasPhoto;

        @b("has_unseen_stories")
        @Nullable
        private final Boolean hasUnseenStories;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @b("id")
        @NotNull
        private final UserId f15244id;

        @b("invited_by")
        @Nullable
        private final Integer invitedBy;

        @b("is_admin")
        @Nullable
        private final BaseBoolInt isAdmin;

        @b("is_adult")
        @Nullable
        private final BaseBoolInt isAdult;

        @b("is_advertiser")
        @Nullable
        private final BaseBoolInt isAdvertiser;

        @b("is_closed")
        @Nullable
        private final GroupsGroupIsClosed isClosed;

        @b("is_favorite")
        @Nullable
        private final BaseBoolInt isFavorite;

        @b("is_hidden_from_feed")
        @Nullable
        private final BaseBoolInt isHiddenFromFeed;

        @b("is_member")
        @Nullable
        private final BaseBoolInt isMember;

        @b("is_messages_blocked")
        @Nullable
        private final BaseBoolInt isMessagesBlocked;

        @b("is_subscribed")
        @Nullable
        private final BaseBoolInt isSubscribed;

        @b("is_subscribed_podcasts")
        @Nullable
        private final Boolean isSubscribedPodcasts;

        @b("is_video_live_notifications_blocked")
        @Nullable
        private final BaseBoolInt isVideoLiveNotificationsBlocked;

        @b("links")
        @Nullable
        private final List<GroupsLinksItem> links;

        @b("live_covers")
        @Nullable
        private final GroupsLiveCovers liveCovers;

        @b("main_album_id")
        @Nullable
        private final Integer mainAlbumId;

        @b("main_section")
        @Nullable
        private final GroupsGroupFullSection mainSection;

        @b("market")
        @Nullable
        private final GroupsMarketInfo market;

        @b("member_status")
        @Nullable
        private final GroupsGroupFullMemberStatus memberStatus;

        @b("members_count")
        @Nullable
        private final Integer membersCount;

        @b("members_count_text")
        @Nullable
        private final String membersCountText;

        @b("name")
        @Nullable
        private final String name;

        @b("online_status")
        @Nullable
        private final GroupsOnlineStatus onlineStatus;

        @b("photo_100")
        @Nullable
        private final String photo100;

        @b("photo_200")
        @Nullable
        private final String photo200;

        @b("photo_200_orig")
        @Nullable
        private final String photo200Orig;

        @b("photo_400")
        @Nullable
        private final String photo400;

        @b("photo_400_orig")
        @Nullable
        private final String photo400Orig;

        @b("photo_50")
        @Nullable
        private final String photo50;

        @b("photo_max")
        @Nullable
        private final String photoMax;

        @b("photo_max_orig")
        @Nullable
        private final String photoMaxOrig;

        @b("photo_max_size")
        @Nullable
        private final GroupsPhotoSize photoMaxSize;

        @b("public_date_label")
        @Nullable
        private final String publicDateLabel;

        @b("requests_count")
        @Nullable
        private final Integer requestsCount;

        @b("screen_name")
        @Nullable
        private final String screenName;

        @b("secondary_section")
        @Nullable
        private final GroupsGroupFullSection secondarySection;

        @b("site")
        @Nullable
        private final String site;

        @b("start_date")
        @Nullable
        private final Integer startDate;

        @b("status")
        @Nullable
        private final String status;

        @b("status_audio")
        @Nullable
        private final AudioAudio statusAudio;

        @b("stories_archive_count")
        @Nullable
        private final Integer storiesArchiveCount;

        @b("trending")
        @Nullable
        private final BaseBoolInt trending;

        @b("type")
        @Nullable
        private final GroupsGroupType type;

        @b("using_vkpay_market_app")
        @Nullable
        private final Boolean usingVkpayMarketApp;

        @b("verified")
        @Nullable
        private final BaseBoolInt verified;

        @b("video_live")
        @Nullable
        private final VideoLiveInfo videoLive;

        @b("video_live_count")
        @Nullable
        private final Integer videoLiveCount;

        @b("video_live_level")
        @Nullable
        private final Integer videoLiveLevel;

        @b("wall")
        @Nullable
        private final Wall wall;

        @b("wiki_page")
        @Nullable
        private final String wikiPage;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Wall {
            DISABLED(0),
            OPEN(1),
            LIMITED(2),
            RESTRICTED(3);

            private final int value;

            Wall(int i) {
                this.value = i;
            }

            public final int getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ GroupsGroupFull(UserId userId, GroupsMarketInfo groupsMarketInfo, GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseObject baseObject, BaseCountry baseCountry, BaseBoolInt baseBoolInt5, String str, String str2, Integer num, String str3, Integer num2, Integer num3, Integer num4, Integer num5, GroupsCountersGroup groupsCountersGroup, GroupsCover groupsCover, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, BaseBoolInt baseBoolInt8, BaseBoolInt baseBoolInt9, BaseBoolInt baseBoolInt10, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, String str4, Integer num6, BaseBoolInt baseBoolInt13, BaseCropPhoto baseCropPhoto, String str5, AudioAudio audioAudio, Integer num7, List list, List list2, Wall wall, String str6, GroupsGroupFullSection groupsGroupFullSection, GroupsGroupFullSection groupsGroupFullSection2, BaseBoolInt baseBoolInt14, BaseBoolInt baseBoolInt15, BaseBoolInt baseBoolInt16, BaseBoolInt baseBoolInt17, GroupsOnlineStatus groupsOnlineStatus, Integer num8, GroupsGroupFullAgeLimits groupsGroupFullAgeLimits, GroupsGroupBanInfo groupsGroupBanInfo, Boolean bool, Boolean bool2, Boolean bool3, GroupsAddressesInfo groupsAddressesInfo, Boolean bool4, Boolean bool5, Boolean bool6, GroupsLiveCovers groupsLiveCovers, Integer num9, Boolean bool7, String str7, String str8, GroupsGroupIsClosed groupsGroupIsClosed, GroupsGroupType groupsGroupType, BaseBoolInt baseBoolInt18, GroupsGroupAdminLevel groupsGroupAdminLevel, BaseBoolInt baseBoolInt19, BaseBoolInt baseBoolInt20, Integer num10, Integer num11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, GroupsPhotoSize groupsPhotoSize, BaseBoolInt baseBoolInt21, VideoLiveInfo videoLiveInfo, int i, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            GroupsMarketInfo groupsMarketInfo2 = (i & 2) != 0 ? null : groupsMarketInfo;
            GroupsGroupFullMemberStatus groupsGroupFullMemberStatus2 = (i & 4) != 0 ? null : groupsGroupFullMemberStatus;
            BaseBoolInt baseBoolInt22 = (i & 8) != 0 ? null : baseBoolInt;
            BaseBoolInt baseBoolInt23 = (i & 16) != 0 ? null : baseBoolInt2;
            BaseBoolInt baseBoolInt24 = (i & 32) != 0 ? null : baseBoolInt3;
            BaseBoolInt baseBoolInt25 = (i & 64) != 0 ? null : baseBoolInt4;
            BaseObject baseObject2 = (i & 128) != 0 ? null : baseObject;
            BaseCountry baseCountry2 = (i & 256) != 0 ? null : baseCountry;
            BaseBoolInt baseBoolInt26 = (i & 512) != 0 ? null : baseBoolInt5;
            String str20 = (i & 1024) != 0 ? null : str;
            String str21 = (i & 2048) != 0 ? null : str2;
            Integer num12 = (i & 4096) != 0 ? null : num;
            String str22 = (i & 8192) != 0 ? null : str3;
            GroupsMarketInfo groupsMarketInfo3 = groupsMarketInfo2;
            Integer num13 = (i & 16384) != 0 ? null : num2;
            Integer num14 = (i & 32768) != 0 ? null : num3;
            Integer num15 = (i & 65536) != 0 ? null : num4;
            Integer num16 = (i & 131072) != 0 ? null : num5;
            GroupsCountersGroup groupsCountersGroup2 = (i & 262144) != 0 ? null : groupsCountersGroup;
            GroupsCover groupsCover2 = (i & 524288) != 0 ? null : groupsCover;
            BaseBoolInt baseBoolInt27 = (i & 1048576) != 0 ? null : baseBoolInt6;
            BaseBoolInt baseBoolInt28 = (i & 2097152) != 0 ? null : baseBoolInt7;
            BaseBoolInt baseBoolInt29 = (i & 4194304) != 0 ? null : baseBoolInt8;
            BaseBoolInt baseBoolInt30 = (i & 8388608) != 0 ? null : baseBoolInt9;
            BaseBoolInt baseBoolInt31 = (i & 16777216) != 0 ? null : baseBoolInt10;
            BaseBoolInt baseBoolInt32 = (i & 33554432) != 0 ? null : baseBoolInt11;
            BaseBoolInt baseBoolInt33 = (i & 67108864) != 0 ? null : baseBoolInt12;
            String str23 = (i & 134217728) != 0 ? null : str4;
            Integer num17 = (i & 268435456) != 0 ? null : num6;
            BaseBoolInt baseBoolInt34 = (i & 536870912) != 0 ? null : baseBoolInt13;
            BaseCropPhoto baseCropPhoto2 = (i & 1073741824) != 0 ? null : baseCropPhoto;
            String str24 = (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : str5;
            this(userId, groupsMarketInfo3, groupsGroupFullMemberStatus2, baseBoolInt22, baseBoolInt23, baseBoolInt24, baseBoolInt25, baseObject2, baseCountry2, baseBoolInt26, str20, str21, num12, str22, num13, num14, num15, num16, groupsCountersGroup2, groupsCover2, baseBoolInt27, baseBoolInt28, baseBoolInt29, baseBoolInt30, baseBoolInt31, baseBoolInt32, baseBoolInt33, str23, num17, baseBoolInt34, baseCropPhoto2, str24, (i10 & 1) != 0 ? null : audioAudio, (i10 & 2) != 0 ? null : num7, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : wall, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : groupsGroupFullSection, (i10 & 128) != 0 ? null : groupsGroupFullSection2, (i10 & 256) != 0 ? null : baseBoolInt14, (i10 & 512) != 0 ? null : baseBoolInt15, (i10 & 1024) != 0 ? null : baseBoolInt16, (i10 & 2048) != 0 ? null : baseBoolInt17, (i10 & 4096) != 0 ? null : groupsOnlineStatus, (i10 & 8192) != 0 ? null : num8, (i10 & 16384) != 0 ? null : groupsGroupFullAgeLimits, (i10 & 32768) != 0 ? null : groupsGroupBanInfo, (i10 & 65536) != 0 ? null : bool, (i10 & 131072) != 0 ? null : bool2, (i10 & 262144) != 0 ? null : bool3, (i10 & 524288) != 0 ? null : groupsAddressesInfo, (i10 & 1048576) != 0 ? null : bool4, (i10 & 2097152) != 0 ? null : bool5, (i10 & 4194304) != 0 ? null : bool6, (i10 & 8388608) != 0 ? null : groupsLiveCovers, (i10 & 16777216) != 0 ? null : num9, (i10 & 33554432) != 0 ? null : bool7, (i10 & 67108864) != 0 ? null : str7, (i10 & 134217728) != 0 ? null : str8, (i10 & 268435456) != 0 ? null : groupsGroupIsClosed, (i10 & 536870912) != 0 ? null : groupsGroupType, (i10 & 1073741824) != 0 ? null : baseBoolInt18, (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : groupsGroupAdminLevel, (i11 & 1) != 0 ? null : baseBoolInt19, (i11 & 2) != 0 ? null : baseBoolInt20, (i11 & 4) != 0 ? null : num10, (i11 & 8) != 0 ? null : num11, (i11 & 16) != 0 ? null : str9, (i11 & 32) != 0 ? null : str10, (i11 & 64) != 0 ? null : str11, (i11 & 128) != 0 ? null : str12, (i11 & 256) != 0 ? null : str13, (i11 & 512) != 0 ? null : str14, (i11 & 1024) != 0 ? null : str15, (i11 & 2048) != 0 ? null : str16, (i11 & 4096) != 0 ? null : str17, (i11 & 8192) != 0 ? null : str18, (i11 & 16384) != 0 ? null : str19, (i11 & 32768) != 0 ? null : groupsPhotoSize, (i11 & 65536) != 0 ? null : baseBoolInt21, (i11 & 131072) != 0 ? null : videoLiveInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GroupsGroupFull copy$default(GroupsGroupFull groupsGroupFull, UserId userId, GroupsMarketInfo groupsMarketInfo, GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseObject baseObject, BaseCountry baseCountry, BaseBoolInt baseBoolInt5, String str, String str2, Integer num, String str3, Integer num2, Integer num3, Integer num4, Integer num5, GroupsCountersGroup groupsCountersGroup, GroupsCover groupsCover, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, BaseBoolInt baseBoolInt8, BaseBoolInt baseBoolInt9, BaseBoolInt baseBoolInt10, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, String str4, Integer num6, BaseBoolInt baseBoolInt13, BaseCropPhoto baseCropPhoto, String str5, AudioAudio audioAudio, Integer num7, List list, List list2, Wall wall, String str6, GroupsGroupFullSection groupsGroupFullSection, GroupsGroupFullSection groupsGroupFullSection2, BaseBoolInt baseBoolInt14, BaseBoolInt baseBoolInt15, BaseBoolInt baseBoolInt16, BaseBoolInt baseBoolInt17, GroupsOnlineStatus groupsOnlineStatus, Integer num8, GroupsGroupFullAgeLimits groupsGroupFullAgeLimits, GroupsGroupBanInfo groupsGroupBanInfo, Boolean bool, Boolean bool2, Boolean bool3, GroupsAddressesInfo groupsAddressesInfo, Boolean bool4, Boolean bool5, Boolean bool6, GroupsLiveCovers groupsLiveCovers, Integer num9, Boolean bool7, String str7, String str8, GroupsGroupIsClosed groupsGroupIsClosed, GroupsGroupType groupsGroupType, BaseBoolInt baseBoolInt18, GroupsGroupAdminLevel groupsGroupAdminLevel, BaseBoolInt baseBoolInt19, BaseBoolInt baseBoolInt20, Integer num10, Integer num11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, GroupsPhotoSize groupsPhotoSize, BaseBoolInt baseBoolInt21, VideoLiveInfo videoLiveInfo, int i, int i10, int i11, Object obj) {
            UserId userId2 = (i & 1) != 0 ? groupsGroupFull.f15244id : userId;
            return groupsGroupFull.copy(userId2, (i & 2) != 0 ? groupsGroupFull.market : groupsMarketInfo, (i & 4) != 0 ? groupsGroupFull.memberStatus : groupsGroupFullMemberStatus, (i & 8) != 0 ? groupsGroupFull.isAdult : baseBoolInt, (i & 16) != 0 ? groupsGroupFull.isHiddenFromFeed : baseBoolInt2, (i & 32) != 0 ? groupsGroupFull.isFavorite : baseBoolInt3, (i & 64) != 0 ? groupsGroupFull.isSubscribed : baseBoolInt4, (i & 128) != 0 ? groupsGroupFull.city : baseObject, (i & 256) != 0 ? groupsGroupFull.country : baseCountry, (i & 512) != 0 ? groupsGroupFull.verified : baseBoolInt5, (i & 1024) != 0 ? groupsGroupFull.description : str, (i & 2048) != 0 ? groupsGroupFull.wikiPage : str2, (i & 4096) != 0 ? groupsGroupFull.membersCount : num, (i & 8192) != 0 ? groupsGroupFull.membersCountText : str3, (i & 16384) != 0 ? groupsGroupFull.requestsCount : num2, (i & 32768) != 0 ? groupsGroupFull.videoLiveLevel : num3, (i & 65536) != 0 ? groupsGroupFull.videoLiveCount : num4, (i & 131072) != 0 ? groupsGroupFull.clipsCount : num5, (i & 262144) != 0 ? groupsGroupFull.counters : groupsCountersGroup, (i & 524288) != 0 ? groupsGroupFull.cover : groupsCover, (i & 1048576) != 0 ? groupsGroupFull.canPost : baseBoolInt6, (i & 2097152) != 0 ? groupsGroupFull.canSuggest : baseBoolInt7, (i & 4194304) != 0 ? groupsGroupFull.canUploadStory : baseBoolInt8, (i & 8388608) != 0 ? groupsGroupFull.canUploadDoc : baseBoolInt9, (i & 16777216) != 0 ? groupsGroupFull.canUploadVideo : baseBoolInt10, (i & 33554432) != 0 ? groupsGroupFull.canSeeAllPosts : baseBoolInt11, (i & 67108864) != 0 ? groupsGroupFull.canCreateTopic : baseBoolInt12, (i & 134217728) != 0 ? groupsGroupFull.activity : str4, (i & 268435456) != 0 ? groupsGroupFull.fixedPost : num6, (i & 536870912) != 0 ? groupsGroupFull.hasPhoto : baseBoolInt13, (i & 1073741824) != 0 ? groupsGroupFull.cropPhoto : baseCropPhoto, (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? groupsGroupFull.status : str5, (i10 & 1) != 0 ? groupsGroupFull.statusAudio : audioAudio, (i10 & 2) != 0 ? groupsGroupFull.mainAlbumId : num7, (i10 & 4) != 0 ? groupsGroupFull.links : list, (i10 & 8) != 0 ? groupsGroupFull.contacts : list2, (i10 & 16) != 0 ? groupsGroupFull.wall : wall, (i10 & 32) != 0 ? groupsGroupFull.site : str6, (i10 & 64) != 0 ? groupsGroupFull.mainSection : groupsGroupFullSection, (i10 & 128) != 0 ? groupsGroupFull.secondarySection : groupsGroupFullSection2, (i10 & 256) != 0 ? groupsGroupFull.trending : baseBoolInt14, (i10 & 512) != 0 ? groupsGroupFull.canMessage : baseBoolInt15, (i10 & 1024) != 0 ? groupsGroupFull.isMessagesBlocked : baseBoolInt16, (i10 & 2048) != 0 ? groupsGroupFull.canSendNotify : baseBoolInt17, (i10 & 4096) != 0 ? groupsGroupFull.onlineStatus : groupsOnlineStatus, (i10 & 8192) != 0 ? groupsGroupFull.invitedBy : num8, (i10 & 16384) != 0 ? groupsGroupFull.ageLimits : groupsGroupFullAgeLimits, (i10 & 32768) != 0 ? groupsGroupFull.banInfo : groupsGroupBanInfo, (i10 & 65536) != 0 ? groupsGroupFull.hasMarketApp : bool, (i10 & 131072) != 0 ? groupsGroupFull.usingVkpayMarketApp : bool2, (i10 & 262144) != 0 ? groupsGroupFull.hasGroupChannel : bool3, (i10 & 524288) != 0 ? groupsGroupFull.addresses : groupsAddressesInfo, (i10 & 1048576) != 0 ? groupsGroupFull.isSubscribedPodcasts : bool4, (i10 & 2097152) != 0 ? groupsGroupFull.canSubscribePodcasts : bool5, (i10 & 4194304) != 0 ? groupsGroupFull.canSubscribePosts : bool6, (i10 & 8388608) != 0 ? groupsGroupFull.liveCovers : groupsLiveCovers, (i10 & 16777216) != 0 ? groupsGroupFull.storiesArchiveCount : num9, (i10 & 33554432) != 0 ? groupsGroupFull.hasUnseenStories : bool7, (i10 & 67108864) != 0 ? groupsGroupFull.name : str7, (i10 & 134217728) != 0 ? groupsGroupFull.screenName : str8, (i10 & 268435456) != 0 ? groupsGroupFull.isClosed : groupsGroupIsClosed, (i10 & 536870912) != 0 ? groupsGroupFull.type : groupsGroupType, (i10 & 1073741824) != 0 ? groupsGroupFull.isAdmin : baseBoolInt18, (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? groupsGroupFull.adminLevel : groupsGroupAdminLevel, (i11 & 1) != 0 ? groupsGroupFull.isMember : baseBoolInt19, (i11 & 2) != 0 ? groupsGroupFull.isAdvertiser : baseBoolInt20, (i11 & 4) != 0 ? groupsGroupFull.startDate : num10, (i11 & 8) != 0 ? groupsGroupFull.finishDate : num11, (i11 & 16) != 0 ? groupsGroupFull.deactivated : str9, (i11 & 32) != 0 ? groupsGroupFull.photo50 : str10, (i11 & 64) != 0 ? groupsGroupFull.photo100 : str11, (i11 & 128) != 0 ? groupsGroupFull.photo200 : str12, (i11 & 256) != 0 ? groupsGroupFull.photo200Orig : str13, (i11 & 512) != 0 ? groupsGroupFull.photo400 : str14, (i11 & 1024) != 0 ? groupsGroupFull.photo400Orig : str15, (i11 & 2048) != 0 ? groupsGroupFull.photoMax : str16, (i11 & 4096) != 0 ? groupsGroupFull.photoMaxOrig : str17, (i11 & 8192) != 0 ? groupsGroupFull.estDate : str18, (i11 & 16384) != 0 ? groupsGroupFull.publicDateLabel : str19, (i11 & 32768) != 0 ? groupsGroupFull.photoMaxSize : groupsPhotoSize, (i11 & 65536) != 0 ? groupsGroupFull.isVideoLiveNotificationsBlocked : baseBoolInt21, (i11 & 131072) != 0 ? groupsGroupFull.videoLive : videoLiveInfo);
        }

        @NotNull
        public final UserId component1() {
            return this.f15244id;
        }

        @Nullable
        public final BaseBoolInt component10() {
            return this.verified;
        }

        @Nullable
        public final String component11() {
            return this.description;
        }

        @Nullable
        public final String component12() {
            return this.wikiPage;
        }

        @Nullable
        public final Integer component13() {
            return this.membersCount;
        }

        @Nullable
        public final String component14() {
            return this.membersCountText;
        }

        @Nullable
        public final Integer component15() {
            return this.requestsCount;
        }

        @Nullable
        public final Integer component16() {
            return this.videoLiveLevel;
        }

        @Nullable
        public final Integer component17() {
            return this.videoLiveCount;
        }

        @Nullable
        public final Integer component18() {
            return this.clipsCount;
        }

        @Nullable
        public final GroupsCountersGroup component19() {
            return this.counters;
        }

        @Nullable
        public final GroupsMarketInfo component2() {
            return this.market;
        }

        @Nullable
        public final GroupsCover component20() {
            return this.cover;
        }

        @Nullable
        public final BaseBoolInt component21() {
            return this.canPost;
        }

        @Nullable
        public final BaseBoolInt component22() {
            return this.canSuggest;
        }

        @Nullable
        public final BaseBoolInt component23() {
            return this.canUploadStory;
        }

        @Nullable
        public final BaseBoolInt component24() {
            return this.canUploadDoc;
        }

        @Nullable
        public final BaseBoolInt component25() {
            return this.canUploadVideo;
        }

        @Nullable
        public final BaseBoolInt component26() {
            return this.canSeeAllPosts;
        }

        @Nullable
        public final BaseBoolInt component27() {
            return this.canCreateTopic;
        }

        @Nullable
        public final String component28() {
            return this.activity;
        }

        @Nullable
        public final Integer component29() {
            return this.fixedPost;
        }

        @Nullable
        public final GroupsGroupFullMemberStatus component3() {
            return this.memberStatus;
        }

        @Nullable
        public final BaseBoolInt component30() {
            return this.hasPhoto;
        }

        @Nullable
        public final BaseCropPhoto component31() {
            return this.cropPhoto;
        }

        @Nullable
        public final String component32() {
            return this.status;
        }

        @Nullable
        public final AudioAudio component33() {
            return this.statusAudio;
        }

        @Nullable
        public final Integer component34() {
            return this.mainAlbumId;
        }

        @Nullable
        public final List<GroupsLinksItem> component35() {
            return this.links;
        }

        @Nullable
        public final List<GroupsContactsItem> component36() {
            return this.contacts;
        }

        @Nullable
        public final Wall component37() {
            return this.wall;
        }

        @Nullable
        public final String component38() {
            return this.site;
        }

        @Nullable
        public final GroupsGroupFullSection component39() {
            return this.mainSection;
        }

        @Nullable
        public final BaseBoolInt component4() {
            return this.isAdult;
        }

        @Nullable
        public final GroupsGroupFullSection component40() {
            return this.secondarySection;
        }

        @Nullable
        public final BaseBoolInt component41() {
            return this.trending;
        }

        @Nullable
        public final BaseBoolInt component42() {
            return this.canMessage;
        }

        @Nullable
        public final BaseBoolInt component43() {
            return this.isMessagesBlocked;
        }

        @Nullable
        public final BaseBoolInt component44() {
            return this.canSendNotify;
        }

        @Nullable
        public final GroupsOnlineStatus component45() {
            return this.onlineStatus;
        }

        @Nullable
        public final Integer component46() {
            return this.invitedBy;
        }

        @Nullable
        public final GroupsGroupFullAgeLimits component47() {
            return this.ageLimits;
        }

        @Nullable
        public final GroupsGroupBanInfo component48() {
            return this.banInfo;
        }

        @Nullable
        public final Boolean component49() {
            return this.hasMarketApp;
        }

        @Nullable
        public final BaseBoolInt component5() {
            return this.isHiddenFromFeed;
        }

        @Nullable
        public final Boolean component50() {
            return this.usingVkpayMarketApp;
        }

        @Nullable
        public final Boolean component51() {
            return this.hasGroupChannel;
        }

        @Nullable
        public final GroupsAddressesInfo component52() {
            return this.addresses;
        }

        @Nullable
        public final Boolean component53() {
            return this.isSubscribedPodcasts;
        }

        @Nullable
        public final Boolean component54() {
            return this.canSubscribePodcasts;
        }

        @Nullable
        public final Boolean component55() {
            return this.canSubscribePosts;
        }

        @Nullable
        public final GroupsLiveCovers component56() {
            return this.liveCovers;
        }

        @Nullable
        public final Integer component57() {
            return this.storiesArchiveCount;
        }

        @Nullable
        public final Boolean component58() {
            return this.hasUnseenStories;
        }

        @Nullable
        public final String component59() {
            return this.name;
        }

        @Nullable
        public final BaseBoolInt component6() {
            return this.isFavorite;
        }

        @Nullable
        public final String component60() {
            return this.screenName;
        }

        @Nullable
        public final GroupsGroupIsClosed component61() {
            return this.isClosed;
        }

        @Nullable
        public final GroupsGroupType component62() {
            return this.type;
        }

        @Nullable
        public final BaseBoolInt component63() {
            return this.isAdmin;
        }

        @Nullable
        public final GroupsGroupAdminLevel component64() {
            return this.adminLevel;
        }

        @Nullable
        public final BaseBoolInt component65() {
            return this.isMember;
        }

        @Nullable
        public final BaseBoolInt component66() {
            return this.isAdvertiser;
        }

        @Nullable
        public final Integer component67() {
            return this.startDate;
        }

        @Nullable
        public final Integer component68() {
            return this.finishDate;
        }

        @Nullable
        public final String component69() {
            return this.deactivated;
        }

        @Nullable
        public final BaseBoolInt component7() {
            return this.isSubscribed;
        }

        @Nullable
        public final String component70() {
            return this.photo50;
        }

        @Nullable
        public final String component71() {
            return this.photo100;
        }

        @Nullable
        public final String component72() {
            return this.photo200;
        }

        @Nullable
        public final String component73() {
            return this.photo200Orig;
        }

        @Nullable
        public final String component74() {
            return this.photo400;
        }

        @Nullable
        public final String component75() {
            return this.photo400Orig;
        }

        @Nullable
        public final String component76() {
            return this.photoMax;
        }

        @Nullable
        public final String component77() {
            return this.photoMaxOrig;
        }

        @Nullable
        public final String component78() {
            return this.estDate;
        }

        @Nullable
        public final String component79() {
            return this.publicDateLabel;
        }

        @Nullable
        public final BaseObject component8() {
            return this.city;
        }

        @Nullable
        public final GroupsPhotoSize component80() {
            return this.photoMaxSize;
        }

        @Nullable
        public final BaseBoolInt component81() {
            return this.isVideoLiveNotificationsBlocked;
        }

        @Nullable
        public final VideoLiveInfo component82() {
            return this.videoLive;
        }

        @Nullable
        public final BaseCountry component9() {
            return this.country;
        }

        @NotNull
        public final GroupsGroupFull copy(@NotNull UserId id2, @Nullable GroupsMarketInfo groupsMarketInfo, @Nullable GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseObject baseObject, @Nullable BaseCountry baseCountry, @Nullable BaseBoolInt baseBoolInt5, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable GroupsCountersGroup groupsCountersGroup, @Nullable GroupsCover groupsCover, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable BaseBoolInt baseBoolInt9, @Nullable BaseBoolInt baseBoolInt10, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable String str4, @Nullable Integer num6, @Nullable BaseBoolInt baseBoolInt13, @Nullable BaseCropPhoto baseCropPhoto, @Nullable String str5, @Nullable AudioAudio audioAudio, @Nullable Integer num7, @Nullable List<GroupsLinksItem> list, @Nullable List<GroupsContactsItem> list2, @Nullable Wall wall, @Nullable String str6, @Nullable GroupsGroupFullSection groupsGroupFullSection, @Nullable GroupsGroupFullSection groupsGroupFullSection2, @Nullable BaseBoolInt baseBoolInt14, @Nullable BaseBoolInt baseBoolInt15, @Nullable BaseBoolInt baseBoolInt16, @Nullable BaseBoolInt baseBoolInt17, @Nullable GroupsOnlineStatus groupsOnlineStatus, @Nullable Integer num8, @Nullable GroupsGroupFullAgeLimits groupsGroupFullAgeLimits, @Nullable GroupsGroupBanInfo groupsGroupBanInfo, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable GroupsAddressesInfo groupsAddressesInfo, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable GroupsLiveCovers groupsLiveCovers, @Nullable Integer num9, @Nullable Boolean bool7, @Nullable String str7, @Nullable String str8, @Nullable GroupsGroupIsClosed groupsGroupIsClosed, @Nullable GroupsGroupType groupsGroupType, @Nullable BaseBoolInt baseBoolInt18, @Nullable GroupsGroupAdminLevel groupsGroupAdminLevel, @Nullable BaseBoolInt baseBoolInt19, @Nullable BaseBoolInt baseBoolInt20, @Nullable Integer num10, @Nullable Integer num11, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable GroupsPhotoSize groupsPhotoSize, @Nullable BaseBoolInt baseBoolInt21, @Nullable VideoLiveInfo videoLiveInfo) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new GroupsGroupFull(id2, groupsMarketInfo, groupsGroupFullMemberStatus, baseBoolInt, baseBoolInt2, baseBoolInt3, baseBoolInt4, baseObject, baseCountry, baseBoolInt5, str, str2, num, str3, num2, num3, num4, num5, groupsCountersGroup, groupsCover, baseBoolInt6, baseBoolInt7, baseBoolInt8, baseBoolInt9, baseBoolInt10, baseBoolInt11, baseBoolInt12, str4, num6, baseBoolInt13, baseCropPhoto, str5, audioAudio, num7, list, list2, wall, str6, groupsGroupFullSection, groupsGroupFullSection2, baseBoolInt14, baseBoolInt15, baseBoolInt16, baseBoolInt17, groupsOnlineStatus, num8, groupsGroupFullAgeLimits, groupsGroupBanInfo, bool, bool2, bool3, groupsAddressesInfo, bool4, bool5, bool6, groupsLiveCovers, num9, bool7, str7, str8, groupsGroupIsClosed, groupsGroupType, baseBoolInt18, groupsGroupAdminLevel, baseBoolInt19, baseBoolInt20, num10, num11, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, groupsPhotoSize, baseBoolInt21, videoLiveInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupsGroupFull)) {
                return false;
            }
            GroupsGroupFull groupsGroupFull = (GroupsGroupFull) obj;
            return Intrinsics.a(this.f15244id, groupsGroupFull.f15244id) && Intrinsics.a(this.market, groupsGroupFull.market) && this.memberStatus == groupsGroupFull.memberStatus && this.isAdult == groupsGroupFull.isAdult && this.isHiddenFromFeed == groupsGroupFull.isHiddenFromFeed && this.isFavorite == groupsGroupFull.isFavorite && this.isSubscribed == groupsGroupFull.isSubscribed && Intrinsics.a(this.city, groupsGroupFull.city) && Intrinsics.a(this.country, groupsGroupFull.country) && this.verified == groupsGroupFull.verified && Intrinsics.a(this.description, groupsGroupFull.description) && Intrinsics.a(this.wikiPage, groupsGroupFull.wikiPage) && Intrinsics.a(this.membersCount, groupsGroupFull.membersCount) && Intrinsics.a(this.membersCountText, groupsGroupFull.membersCountText) && Intrinsics.a(this.requestsCount, groupsGroupFull.requestsCount) && Intrinsics.a(this.videoLiveLevel, groupsGroupFull.videoLiveLevel) && Intrinsics.a(this.videoLiveCount, groupsGroupFull.videoLiveCount) && Intrinsics.a(this.clipsCount, groupsGroupFull.clipsCount) && Intrinsics.a(this.counters, groupsGroupFull.counters) && Intrinsics.a(this.cover, groupsGroupFull.cover) && this.canPost == groupsGroupFull.canPost && this.canSuggest == groupsGroupFull.canSuggest && this.canUploadStory == groupsGroupFull.canUploadStory && this.canUploadDoc == groupsGroupFull.canUploadDoc && this.canUploadVideo == groupsGroupFull.canUploadVideo && this.canSeeAllPosts == groupsGroupFull.canSeeAllPosts && this.canCreateTopic == groupsGroupFull.canCreateTopic && Intrinsics.a(this.activity, groupsGroupFull.activity) && Intrinsics.a(this.fixedPost, groupsGroupFull.fixedPost) && this.hasPhoto == groupsGroupFull.hasPhoto && Intrinsics.a(this.cropPhoto, groupsGroupFull.cropPhoto) && Intrinsics.a(this.status, groupsGroupFull.status) && Intrinsics.a(this.statusAudio, groupsGroupFull.statusAudio) && Intrinsics.a(this.mainAlbumId, groupsGroupFull.mainAlbumId) && Intrinsics.a(this.links, groupsGroupFull.links) && Intrinsics.a(this.contacts, groupsGroupFull.contacts) && this.wall == groupsGroupFull.wall && Intrinsics.a(this.site, groupsGroupFull.site) && this.mainSection == groupsGroupFull.mainSection && this.secondarySection == groupsGroupFull.secondarySection && this.trending == groupsGroupFull.trending && this.canMessage == groupsGroupFull.canMessage && this.isMessagesBlocked == groupsGroupFull.isMessagesBlocked && this.canSendNotify == groupsGroupFull.canSendNotify && Intrinsics.a(this.onlineStatus, groupsGroupFull.onlineStatus) && Intrinsics.a(this.invitedBy, groupsGroupFull.invitedBy) && this.ageLimits == groupsGroupFull.ageLimits && Intrinsics.a(this.banInfo, groupsGroupFull.banInfo) && Intrinsics.a(this.hasMarketApp, groupsGroupFull.hasMarketApp) && Intrinsics.a(this.usingVkpayMarketApp, groupsGroupFull.usingVkpayMarketApp) && Intrinsics.a(this.hasGroupChannel, groupsGroupFull.hasGroupChannel) && Intrinsics.a(this.addresses, groupsGroupFull.addresses) && Intrinsics.a(this.isSubscribedPodcasts, groupsGroupFull.isSubscribedPodcasts) && Intrinsics.a(this.canSubscribePodcasts, groupsGroupFull.canSubscribePodcasts) && Intrinsics.a(this.canSubscribePosts, groupsGroupFull.canSubscribePosts) && Intrinsics.a(this.liveCovers, groupsGroupFull.liveCovers) && Intrinsics.a(this.storiesArchiveCount, groupsGroupFull.storiesArchiveCount) && Intrinsics.a(this.hasUnseenStories, groupsGroupFull.hasUnseenStories) && Intrinsics.a(this.name, groupsGroupFull.name) && Intrinsics.a(this.screenName, groupsGroupFull.screenName) && this.isClosed == groupsGroupFull.isClosed && this.type == groupsGroupFull.type && this.isAdmin == groupsGroupFull.isAdmin && this.adminLevel == groupsGroupFull.adminLevel && this.isMember == groupsGroupFull.isMember && this.isAdvertiser == groupsGroupFull.isAdvertiser && Intrinsics.a(this.startDate, groupsGroupFull.startDate) && Intrinsics.a(this.finishDate, groupsGroupFull.finishDate) && Intrinsics.a(this.deactivated, groupsGroupFull.deactivated) && Intrinsics.a(this.photo50, groupsGroupFull.photo50) && Intrinsics.a(this.photo100, groupsGroupFull.photo100) && Intrinsics.a(this.photo200, groupsGroupFull.photo200) && Intrinsics.a(this.photo200Orig, groupsGroupFull.photo200Orig) && Intrinsics.a(this.photo400, groupsGroupFull.photo400) && Intrinsics.a(this.photo400Orig, groupsGroupFull.photo400Orig) && Intrinsics.a(this.photoMax, groupsGroupFull.photoMax) && Intrinsics.a(this.photoMaxOrig, groupsGroupFull.photoMaxOrig) && Intrinsics.a(this.estDate, groupsGroupFull.estDate) && Intrinsics.a(this.publicDateLabel, groupsGroupFull.publicDateLabel) && Intrinsics.a(this.photoMaxSize, groupsGroupFull.photoMaxSize) && this.isVideoLiveNotificationsBlocked == groupsGroupFull.isVideoLiveNotificationsBlocked && Intrinsics.a(this.videoLive, groupsGroupFull.videoLive);
        }

        @Nullable
        public final String getActivity() {
            return this.activity;
        }

        @Nullable
        public final GroupsAddressesInfo getAddresses() {
            return this.addresses;
        }

        @Nullable
        public final GroupsGroupAdminLevel getAdminLevel() {
            return this.adminLevel;
        }

        @Nullable
        public final GroupsGroupFullAgeLimits getAgeLimits() {
            return this.ageLimits;
        }

        @Nullable
        public final GroupsGroupBanInfo getBanInfo() {
            return this.banInfo;
        }

        @Nullable
        public final BaseBoolInt getCanCreateTopic() {
            return this.canCreateTopic;
        }

        @Nullable
        public final BaseBoolInt getCanMessage() {
            return this.canMessage;
        }

        @Nullable
        public final BaseBoolInt getCanPost() {
            return this.canPost;
        }

        @Nullable
        public final BaseBoolInt getCanSeeAllPosts() {
            return this.canSeeAllPosts;
        }

        @Nullable
        public final BaseBoolInt getCanSendNotify() {
            return this.canSendNotify;
        }

        @Nullable
        public final Boolean getCanSubscribePodcasts() {
            return this.canSubscribePodcasts;
        }

        @Nullable
        public final Boolean getCanSubscribePosts() {
            return this.canSubscribePosts;
        }

        @Nullable
        public final BaseBoolInt getCanSuggest() {
            return this.canSuggest;
        }

        @Nullable
        public final BaseBoolInt getCanUploadDoc() {
            return this.canUploadDoc;
        }

        @Nullable
        public final BaseBoolInt getCanUploadStory() {
            return this.canUploadStory;
        }

        @Nullable
        public final BaseBoolInt getCanUploadVideo() {
            return this.canUploadVideo;
        }

        @Nullable
        public final BaseObject getCity() {
            return this.city;
        }

        @Nullable
        public final Integer getClipsCount() {
            return this.clipsCount;
        }

        @Nullable
        public final List<GroupsContactsItem> getContacts() {
            return this.contacts;
        }

        @Nullable
        public final GroupsCountersGroup getCounters() {
            return this.counters;
        }

        @Nullable
        public final BaseCountry getCountry() {
            return this.country;
        }

        @Nullable
        public final GroupsCover getCover() {
            return this.cover;
        }

        @Nullable
        public final BaseCropPhoto getCropPhoto() {
            return this.cropPhoto;
        }

        @Nullable
        public final String getDeactivated() {
            return this.deactivated;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getEstDate() {
            return this.estDate;
        }

        @Nullable
        public final Integer getFinishDate() {
            return this.finishDate;
        }

        @Nullable
        public final Integer getFixedPost() {
            return this.fixedPost;
        }

        @Nullable
        public final Boolean getHasGroupChannel() {
            return this.hasGroupChannel;
        }

        @Nullable
        public final Boolean getHasMarketApp() {
            return this.hasMarketApp;
        }

        @Nullable
        public final BaseBoolInt getHasPhoto() {
            return this.hasPhoto;
        }

        @Nullable
        public final Boolean getHasUnseenStories() {
            return this.hasUnseenStories;
        }

        @NotNull
        public final UserId getId() {
            return this.f15244id;
        }

        @Nullable
        public final Integer getInvitedBy() {
            return this.invitedBy;
        }

        @Nullable
        public final List<GroupsLinksItem> getLinks() {
            return this.links;
        }

        @Nullable
        public final GroupsLiveCovers getLiveCovers() {
            return this.liveCovers;
        }

        @Nullable
        public final Integer getMainAlbumId() {
            return this.mainAlbumId;
        }

        @Nullable
        public final GroupsGroupFullSection getMainSection() {
            return this.mainSection;
        }

        @Nullable
        public final GroupsMarketInfo getMarket() {
            return this.market;
        }

        @Nullable
        public final GroupsGroupFullMemberStatus getMemberStatus() {
            return this.memberStatus;
        }

        @Nullable
        public final Integer getMembersCount() {
            return this.membersCount;
        }

        @Nullable
        public final String getMembersCountText() {
            return this.membersCountText;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final GroupsOnlineStatus getOnlineStatus() {
            return this.onlineStatus;
        }

        @Nullable
        public final String getPhoto100() {
            return this.photo100;
        }

        @Nullable
        public final String getPhoto200() {
            return this.photo200;
        }

        @Nullable
        public final String getPhoto200Orig() {
            return this.photo200Orig;
        }

        @Nullable
        public final String getPhoto400() {
            return this.photo400;
        }

        @Nullable
        public final String getPhoto400Orig() {
            return this.photo400Orig;
        }

        @Nullable
        public final String getPhoto50() {
            return this.photo50;
        }

        @Nullable
        public final String getPhotoMax() {
            return this.photoMax;
        }

        @Nullable
        public final String getPhotoMaxOrig() {
            return this.photoMaxOrig;
        }

        @Nullable
        public final GroupsPhotoSize getPhotoMaxSize() {
            return this.photoMaxSize;
        }

        @Nullable
        public final String getPublicDateLabel() {
            return this.publicDateLabel;
        }

        @Nullable
        public final Integer getRequestsCount() {
            return this.requestsCount;
        }

        @Nullable
        public final String getScreenName() {
            return this.screenName;
        }

        @Nullable
        public final GroupsGroupFullSection getSecondarySection() {
            return this.secondarySection;
        }

        @Nullable
        public final String getSite() {
            return this.site;
        }

        @Nullable
        public final Integer getStartDate() {
            return this.startDate;
        }

        @Nullable
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        public final AudioAudio getStatusAudio() {
            return this.statusAudio;
        }

        @Nullable
        public final Integer getStoriesArchiveCount() {
            return this.storiesArchiveCount;
        }

        @Nullable
        public final BaseBoolInt getTrending() {
            return this.trending;
        }

        @Nullable
        public final GroupsGroupType getType() {
            return this.type;
        }

        @Nullable
        public final Boolean getUsingVkpayMarketApp() {
            return this.usingVkpayMarketApp;
        }

        @Nullable
        public final BaseBoolInt getVerified() {
            return this.verified;
        }

        @Nullable
        public final VideoLiveInfo getVideoLive() {
            return this.videoLive;
        }

        @Nullable
        public final Integer getVideoLiveCount() {
            return this.videoLiveCount;
        }

        @Nullable
        public final Integer getVideoLiveLevel() {
            return this.videoLiveLevel;
        }

        @Nullable
        public final Wall getWall() {
            return this.wall;
        }

        @Nullable
        public final String getWikiPage() {
            return this.wikiPage;
        }

        public int hashCode() {
            int iHashCode = this.f15244id.hashCode() * 31;
            GroupsMarketInfo groupsMarketInfo = this.market;
            int iHashCode2 = (iHashCode + (groupsMarketInfo == null ? 0 : groupsMarketInfo.hashCode())) * 31;
            GroupsGroupFullMemberStatus groupsGroupFullMemberStatus = this.memberStatus;
            int iHashCode3 = (iHashCode2 + (groupsGroupFullMemberStatus == null ? 0 : groupsGroupFullMemberStatus.hashCode())) * 31;
            BaseBoolInt baseBoolInt = this.isAdult;
            int iHashCode4 = (iHashCode3 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
            BaseBoolInt baseBoolInt2 = this.isHiddenFromFeed;
            int iHashCode5 = (iHashCode4 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
            BaseBoolInt baseBoolInt3 = this.isFavorite;
            int iHashCode6 = (iHashCode5 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
            BaseBoolInt baseBoolInt4 = this.isSubscribed;
            int iHashCode7 = (iHashCode6 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
            BaseObject baseObject = this.city;
            int iHashCode8 = (iHashCode7 + (baseObject == null ? 0 : baseObject.hashCode())) * 31;
            BaseCountry baseCountry = this.country;
            int iHashCode9 = (iHashCode8 + (baseCountry == null ? 0 : baseCountry.hashCode())) * 31;
            BaseBoolInt baseBoolInt5 = this.verified;
            int iHashCode10 = (iHashCode9 + (baseBoolInt5 == null ? 0 : baseBoolInt5.hashCode())) * 31;
            String str = this.description;
            int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.wikiPage;
            int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.membersCount;
            int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.membersCountText;
            int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.requestsCount;
            int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.videoLiveLevel;
            int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.videoLiveCount;
            int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.clipsCount;
            int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
            GroupsCountersGroup groupsCountersGroup = this.counters;
            int iHashCode19 = (iHashCode18 + (groupsCountersGroup == null ? 0 : groupsCountersGroup.hashCode())) * 31;
            GroupsCover groupsCover = this.cover;
            int iHashCode20 = (iHashCode19 + (groupsCover == null ? 0 : groupsCover.hashCode())) * 31;
            BaseBoolInt baseBoolInt6 = this.canPost;
            int iHashCode21 = (iHashCode20 + (baseBoolInt6 == null ? 0 : baseBoolInt6.hashCode())) * 31;
            BaseBoolInt baseBoolInt7 = this.canSuggest;
            int iHashCode22 = (iHashCode21 + (baseBoolInt7 == null ? 0 : baseBoolInt7.hashCode())) * 31;
            BaseBoolInt baseBoolInt8 = this.canUploadStory;
            int iHashCode23 = (iHashCode22 + (baseBoolInt8 == null ? 0 : baseBoolInt8.hashCode())) * 31;
            BaseBoolInt baseBoolInt9 = this.canUploadDoc;
            int iHashCode24 = (iHashCode23 + (baseBoolInt9 == null ? 0 : baseBoolInt9.hashCode())) * 31;
            BaseBoolInt baseBoolInt10 = this.canUploadVideo;
            int iHashCode25 = (iHashCode24 + (baseBoolInt10 == null ? 0 : baseBoolInt10.hashCode())) * 31;
            BaseBoolInt baseBoolInt11 = this.canSeeAllPosts;
            int iHashCode26 = (iHashCode25 + (baseBoolInt11 == null ? 0 : baseBoolInt11.hashCode())) * 31;
            BaseBoolInt baseBoolInt12 = this.canCreateTopic;
            int iHashCode27 = (iHashCode26 + (baseBoolInt12 == null ? 0 : baseBoolInt12.hashCode())) * 31;
            String str4 = this.activity;
            int iHashCode28 = (iHashCode27 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num6 = this.fixedPost;
            int iHashCode29 = (iHashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
            BaseBoolInt baseBoolInt13 = this.hasPhoto;
            int iHashCode30 = (iHashCode29 + (baseBoolInt13 == null ? 0 : baseBoolInt13.hashCode())) * 31;
            BaseCropPhoto baseCropPhoto = this.cropPhoto;
            int iHashCode31 = (iHashCode30 + (baseCropPhoto == null ? 0 : baseCropPhoto.hashCode())) * 31;
            String str5 = this.status;
            int iHashCode32 = (iHashCode31 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AudioAudio audioAudio = this.statusAudio;
            int iHashCode33 = (iHashCode32 + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
            Integer num7 = this.mainAlbumId;
            int iHashCode34 = (iHashCode33 + (num7 == null ? 0 : num7.hashCode())) * 31;
            List<GroupsLinksItem> list = this.links;
            int iHashCode35 = (iHashCode34 + (list == null ? 0 : list.hashCode())) * 31;
            List<GroupsContactsItem> list2 = this.contacts;
            int iHashCode36 = (iHashCode35 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Wall wall = this.wall;
            int iHashCode37 = (iHashCode36 + (wall == null ? 0 : wall.hashCode())) * 31;
            String str6 = this.site;
            int iHashCode38 = (iHashCode37 + (str6 == null ? 0 : str6.hashCode())) * 31;
            GroupsGroupFullSection groupsGroupFullSection = this.mainSection;
            int iHashCode39 = (iHashCode38 + (groupsGroupFullSection == null ? 0 : groupsGroupFullSection.hashCode())) * 31;
            GroupsGroupFullSection groupsGroupFullSection2 = this.secondarySection;
            int iHashCode40 = (iHashCode39 + (groupsGroupFullSection2 == null ? 0 : groupsGroupFullSection2.hashCode())) * 31;
            BaseBoolInt baseBoolInt14 = this.trending;
            int iHashCode41 = (iHashCode40 + (baseBoolInt14 == null ? 0 : baseBoolInt14.hashCode())) * 31;
            BaseBoolInt baseBoolInt15 = this.canMessage;
            int iHashCode42 = (iHashCode41 + (baseBoolInt15 == null ? 0 : baseBoolInt15.hashCode())) * 31;
            BaseBoolInt baseBoolInt16 = this.isMessagesBlocked;
            int iHashCode43 = (iHashCode42 + (baseBoolInt16 == null ? 0 : baseBoolInt16.hashCode())) * 31;
            BaseBoolInt baseBoolInt17 = this.canSendNotify;
            int iHashCode44 = (iHashCode43 + (baseBoolInt17 == null ? 0 : baseBoolInt17.hashCode())) * 31;
            GroupsOnlineStatus groupsOnlineStatus = this.onlineStatus;
            int iHashCode45 = (iHashCode44 + (groupsOnlineStatus == null ? 0 : groupsOnlineStatus.hashCode())) * 31;
            Integer num8 = this.invitedBy;
            int iHashCode46 = (iHashCode45 + (num8 == null ? 0 : num8.hashCode())) * 31;
            GroupsGroupFullAgeLimits groupsGroupFullAgeLimits = this.ageLimits;
            int iHashCode47 = (iHashCode46 + (groupsGroupFullAgeLimits == null ? 0 : groupsGroupFullAgeLimits.hashCode())) * 31;
            GroupsGroupBanInfo groupsGroupBanInfo = this.banInfo;
            int iHashCode48 = (iHashCode47 + (groupsGroupBanInfo == null ? 0 : groupsGroupBanInfo.hashCode())) * 31;
            Boolean bool = this.hasMarketApp;
            int iHashCode49 = (iHashCode48 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.usingVkpayMarketApp;
            int iHashCode50 = (iHashCode49 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.hasGroupChannel;
            int iHashCode51 = (iHashCode50 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            GroupsAddressesInfo groupsAddressesInfo = this.addresses;
            int iHashCode52 = (iHashCode51 + (groupsAddressesInfo == null ? 0 : groupsAddressesInfo.hashCode())) * 31;
            Boolean bool4 = this.isSubscribedPodcasts;
            int iHashCode53 = (iHashCode52 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.canSubscribePodcasts;
            int iHashCode54 = (iHashCode53 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.canSubscribePosts;
            int iHashCode55 = (iHashCode54 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            GroupsLiveCovers groupsLiveCovers = this.liveCovers;
            int iHashCode56 = (iHashCode55 + (groupsLiveCovers == null ? 0 : groupsLiveCovers.hashCode())) * 31;
            Integer num9 = this.storiesArchiveCount;
            int iHashCode57 = (iHashCode56 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Boolean bool7 = this.hasUnseenStories;
            int iHashCode58 = (iHashCode57 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            String str7 = this.name;
            int iHashCode59 = (iHashCode58 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.screenName;
            int iHashCode60 = (iHashCode59 + (str8 == null ? 0 : str8.hashCode())) * 31;
            GroupsGroupIsClosed groupsGroupIsClosed = this.isClosed;
            int iHashCode61 = (iHashCode60 + (groupsGroupIsClosed == null ? 0 : groupsGroupIsClosed.hashCode())) * 31;
            GroupsGroupType groupsGroupType = this.type;
            int iHashCode62 = (iHashCode61 + (groupsGroupType == null ? 0 : groupsGroupType.hashCode())) * 31;
            BaseBoolInt baseBoolInt18 = this.isAdmin;
            int iHashCode63 = (iHashCode62 + (baseBoolInt18 == null ? 0 : baseBoolInt18.hashCode())) * 31;
            GroupsGroupAdminLevel groupsGroupAdminLevel = this.adminLevel;
            int iHashCode64 = (iHashCode63 + (groupsGroupAdminLevel == null ? 0 : groupsGroupAdminLevel.hashCode())) * 31;
            BaseBoolInt baseBoolInt19 = this.isMember;
            int iHashCode65 = (iHashCode64 + (baseBoolInt19 == null ? 0 : baseBoolInt19.hashCode())) * 31;
            BaseBoolInt baseBoolInt20 = this.isAdvertiser;
            int iHashCode66 = (iHashCode65 + (baseBoolInt20 == null ? 0 : baseBoolInt20.hashCode())) * 31;
            Integer num10 = this.startDate;
            int iHashCode67 = (iHashCode66 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.finishDate;
            int iHashCode68 = (iHashCode67 + (num11 == null ? 0 : num11.hashCode())) * 31;
            String str9 = this.deactivated;
            int iHashCode69 = (iHashCode68 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.photo50;
            int iHashCode70 = (iHashCode69 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.photo100;
            int iHashCode71 = (iHashCode70 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.photo200;
            int iHashCode72 = (iHashCode71 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.photo200Orig;
            int iHashCode73 = (iHashCode72 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.photo400;
            int iHashCode74 = (iHashCode73 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.photo400Orig;
            int iHashCode75 = (iHashCode74 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.photoMax;
            int iHashCode76 = (iHashCode75 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.photoMaxOrig;
            int iHashCode77 = (iHashCode76 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.estDate;
            int iHashCode78 = (iHashCode77 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.publicDateLabel;
            int iHashCode79 = (iHashCode78 + (str19 == null ? 0 : str19.hashCode())) * 31;
            GroupsPhotoSize groupsPhotoSize = this.photoMaxSize;
            int iHashCode80 = (iHashCode79 + (groupsPhotoSize == null ? 0 : groupsPhotoSize.hashCode())) * 31;
            BaseBoolInt baseBoolInt21 = this.isVideoLiveNotificationsBlocked;
            int iHashCode81 = (iHashCode80 + (baseBoolInt21 == null ? 0 : baseBoolInt21.hashCode())) * 31;
            VideoLiveInfo videoLiveInfo = this.videoLive;
            return iHashCode81 + (videoLiveInfo != null ? videoLiveInfo.hashCode() : 0);
        }

        @Nullable
        public final BaseBoolInt isAdmin() {
            return this.isAdmin;
        }

        @Nullable
        public final BaseBoolInt isAdult() {
            return this.isAdult;
        }

        @Nullable
        public final BaseBoolInt isAdvertiser() {
            return this.isAdvertiser;
        }

        @Nullable
        public final GroupsGroupIsClosed isClosed() {
            return this.isClosed;
        }

        @Nullable
        public final BaseBoolInt isFavorite() {
            return this.isFavorite;
        }

        @Nullable
        public final BaseBoolInt isHiddenFromFeed() {
            return this.isHiddenFromFeed;
        }

        @Nullable
        public final BaseBoolInt isMember() {
            return this.isMember;
        }

        @Nullable
        public final BaseBoolInt isMessagesBlocked() {
            return this.isMessagesBlocked;
        }

        @Nullable
        public final BaseBoolInt isSubscribed() {
            return this.isSubscribed;
        }

        @Nullable
        public final Boolean isSubscribedPodcasts() {
            return this.isSubscribedPodcasts;
        }

        @Nullable
        public final BaseBoolInt isVideoLiveNotificationsBlocked() {
            return this.isVideoLiveNotificationsBlocked;
        }

        @NotNull
        public String toString() {
            UserId userId = this.f15244id;
            GroupsMarketInfo groupsMarketInfo = this.market;
            GroupsGroupFullMemberStatus groupsGroupFullMemberStatus = this.memberStatus;
            BaseBoolInt baseBoolInt = this.isAdult;
            BaseBoolInt baseBoolInt2 = this.isHiddenFromFeed;
            BaseBoolInt baseBoolInt3 = this.isFavorite;
            BaseBoolInt baseBoolInt4 = this.isSubscribed;
            BaseObject baseObject = this.city;
            BaseCountry baseCountry = this.country;
            BaseBoolInt baseBoolInt5 = this.verified;
            String str = this.description;
            String str2 = this.wikiPage;
            Integer num = this.membersCount;
            String str3 = this.membersCountText;
            Integer num2 = this.requestsCount;
            Integer num3 = this.videoLiveLevel;
            Integer num4 = this.videoLiveCount;
            Integer num5 = this.clipsCount;
            GroupsCountersGroup groupsCountersGroup = this.counters;
            GroupsCover groupsCover = this.cover;
            BaseBoolInt baseBoolInt6 = this.canPost;
            BaseBoolInt baseBoolInt7 = this.canSuggest;
            BaseBoolInt baseBoolInt8 = this.canUploadStory;
            BaseBoolInt baseBoolInt9 = this.canUploadDoc;
            BaseBoolInt baseBoolInt10 = this.canUploadVideo;
            BaseBoolInt baseBoolInt11 = this.canSeeAllPosts;
            BaseBoolInt baseBoolInt12 = this.canCreateTopic;
            String str4 = this.activity;
            Integer num6 = this.fixedPost;
            BaseBoolInt baseBoolInt13 = this.hasPhoto;
            BaseCropPhoto baseCropPhoto = this.cropPhoto;
            String str5 = this.status;
            AudioAudio audioAudio = this.statusAudio;
            Integer num7 = this.mainAlbumId;
            List<GroupsLinksItem> list = this.links;
            List<GroupsContactsItem> list2 = this.contacts;
            Wall wall = this.wall;
            String str6 = this.site;
            GroupsGroupFullSection groupsGroupFullSection = this.mainSection;
            GroupsGroupFullSection groupsGroupFullSection2 = this.secondarySection;
            BaseBoolInt baseBoolInt14 = this.trending;
            BaseBoolInt baseBoolInt15 = this.canMessage;
            BaseBoolInt baseBoolInt16 = this.isMessagesBlocked;
            BaseBoolInt baseBoolInt17 = this.canSendNotify;
            GroupsOnlineStatus groupsOnlineStatus = this.onlineStatus;
            Integer num8 = this.invitedBy;
            GroupsGroupFullAgeLimits groupsGroupFullAgeLimits = this.ageLimits;
            GroupsGroupBanInfo groupsGroupBanInfo = this.banInfo;
            Boolean bool = this.hasMarketApp;
            Boolean bool2 = this.usingVkpayMarketApp;
            Boolean bool3 = this.hasGroupChannel;
            GroupsAddressesInfo groupsAddressesInfo = this.addresses;
            Boolean bool4 = this.isSubscribedPodcasts;
            Boolean bool5 = this.canSubscribePodcasts;
            Boolean bool6 = this.canSubscribePosts;
            GroupsLiveCovers groupsLiveCovers = this.liveCovers;
            Integer num9 = this.storiesArchiveCount;
            Boolean bool7 = this.hasUnseenStories;
            String str7 = this.name;
            String str8 = this.screenName;
            GroupsGroupIsClosed groupsGroupIsClosed = this.isClosed;
            GroupsGroupType groupsGroupType = this.type;
            BaseBoolInt baseBoolInt18 = this.isAdmin;
            GroupsGroupAdminLevel groupsGroupAdminLevel = this.adminLevel;
            BaseBoolInt baseBoolInt19 = this.isMember;
            BaseBoolInt baseBoolInt20 = this.isAdvertiser;
            Integer num10 = this.startDate;
            Integer num11 = this.finishDate;
            String str9 = this.deactivated;
            String str10 = this.photo50;
            String str11 = this.photo100;
            String str12 = this.photo200;
            String str13 = this.photo200Orig;
            String str14 = this.photo400;
            String str15 = this.photo400Orig;
            String str16 = this.photoMax;
            String str17 = this.photoMaxOrig;
            String str18 = this.estDate;
            String str19 = this.publicDateLabel;
            GroupsPhotoSize groupsPhotoSize = this.photoMaxSize;
            BaseBoolInt baseBoolInt21 = this.isVideoLiveNotificationsBlocked;
            VideoLiveInfo videoLiveInfo = this.videoLive;
            StringBuilder sb2 = new StringBuilder("GroupsGroupFull(id=");
            sb2.append(userId);
            sb2.append(", market=");
            sb2.append(groupsMarketInfo);
            sb2.append(", memberStatus=");
            sb2.append(groupsGroupFullMemberStatus);
            sb2.append(", isAdult=");
            sb2.append(baseBoolInt);
            sb2.append(", isHiddenFromFeed=");
            a.s(sb2, baseBoolInt2, ", isFavorite=", baseBoolInt3, ", isSubscribed=");
            sb2.append(baseBoolInt4);
            sb2.append(", city=");
            sb2.append(baseObject);
            sb2.append(", country=");
            sb2.append(baseCountry);
            sb2.append(", verified=");
            sb2.append(baseBoolInt5);
            sb2.append(", description=");
            l7.o.t(sb2, str, ", wikiPage=", str2, ", membersCount=");
            pe.a.r(num, ", membersCountText=", str3, ", requestsCount=", sb2);
            a.t(sb2, num2, ", videoLiveLevel=", num3, ", videoLiveCount=");
            a.t(sb2, num4, ", clipsCount=", num5, ", counters=");
            sb2.append(groupsCountersGroup);
            sb2.append(", cover=");
            sb2.append(groupsCover);
            sb2.append(", canPost=");
            a.s(sb2, baseBoolInt6, ", canSuggest=", baseBoolInt7, ", canUploadStory=");
            a.s(sb2, baseBoolInt8, ", canUploadDoc=", baseBoolInt9, ", canUploadVideo=");
            a.s(sb2, baseBoolInt10, ", canSeeAllPosts=", baseBoolInt11, ", canCreateTopic=");
            sb2.append(baseBoolInt12);
            sb2.append(", activity=");
            sb2.append(str4);
            sb2.append(", fixedPost=");
            sb2.append(num6);
            sb2.append(", hasPhoto=");
            sb2.append(baseBoolInt13);
            sb2.append(", cropPhoto=");
            sb2.append(baseCropPhoto);
            sb2.append(", status=");
            sb2.append(str5);
            sb2.append(", statusAudio=");
            sb2.append(audioAudio);
            sb2.append(", mainAlbumId=");
            sb2.append(num7);
            sb2.append(", links=");
            a.u(sb2, list, ", contacts=", list2, ", wall=");
            sb2.append(wall);
            sb2.append(", site=");
            sb2.append(str6);
            sb2.append(", mainSection=");
            sb2.append(groupsGroupFullSection);
            sb2.append(", secondarySection=");
            sb2.append(groupsGroupFullSection2);
            sb2.append(", trending=");
            a.s(sb2, baseBoolInt14, ", canMessage=", baseBoolInt15, ", isMessagesBlocked=");
            a.s(sb2, baseBoolInt16, ", canSendNotify=", baseBoolInt17, ", onlineStatus=");
            sb2.append(groupsOnlineStatus);
            sb2.append(", invitedBy=");
            sb2.append(num8);
            sb2.append(", ageLimits=");
            sb2.append(groupsGroupFullAgeLimits);
            sb2.append(", banInfo=");
            sb2.append(groupsGroupBanInfo);
            sb2.append(", hasMarketApp=");
            u.s(sb2, bool, ", usingVkpayMarketApp=", bool2, ", hasGroupChannel=");
            sb2.append(bool3);
            sb2.append(", addresses=");
            sb2.append(groupsAddressesInfo);
            sb2.append(", isSubscribedPodcasts=");
            u.s(sb2, bool4, ", canSubscribePodcasts=", bool5, ", canSubscribePosts=");
            sb2.append(bool6);
            sb2.append(", liveCovers=");
            sb2.append(groupsLiveCovers);
            sb2.append(", storiesArchiveCount=");
            sb2.append(num9);
            sb2.append(", hasUnseenStories=");
            sb2.append(bool7);
            sb2.append(", name=");
            l7.o.t(sb2, str7, ", screenName=", str8, ", isClosed=");
            sb2.append(groupsGroupIsClosed);
            sb2.append(", type=");
            sb2.append(groupsGroupType);
            sb2.append(", isAdmin=");
            sb2.append(baseBoolInt18);
            sb2.append(", adminLevel=");
            sb2.append(groupsGroupAdminLevel);
            sb2.append(", isMember=");
            a.s(sb2, baseBoolInt19, ", isAdvertiser=", baseBoolInt20, ", startDate=");
            a.t(sb2, num10, ", finishDate=", num11, ", deactivated=");
            l7.o.t(sb2, str9, ", photo50=", str10, ", photo100=");
            l7.o.t(sb2, str11, ", photo200=", str12, ", photo200Orig=");
            l7.o.t(sb2, str13, ", photo400=", str14, ", photo400Orig=");
            l7.o.t(sb2, str15, ", photoMax=", str16, ", photoMaxOrig=");
            l7.o.t(sb2, str17, ", estDate=", str18, ", publicDateLabel=");
            sb2.append(str19);
            sb2.append(", photoMaxSize=");
            sb2.append(groupsPhotoSize);
            sb2.append(", isVideoLiveNotificationsBlocked=");
            sb2.append(baseBoolInt21);
            sb2.append(", videoLive=");
            sb2.append(videoLiveInfo);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupsGroupFull(@NotNull UserId id2, @Nullable GroupsMarketInfo groupsMarketInfo, @Nullable GroupsGroupFullMemberStatus groupsGroupFullMemberStatus, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseObject baseObject, @Nullable BaseCountry baseCountry, @Nullable BaseBoolInt baseBoolInt5, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable GroupsCountersGroup groupsCountersGroup, @Nullable GroupsCover groupsCover, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable BaseBoolInt baseBoolInt9, @Nullable BaseBoolInt baseBoolInt10, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable String str4, @Nullable Integer num6, @Nullable BaseBoolInt baseBoolInt13, @Nullable BaseCropPhoto baseCropPhoto, @Nullable String str5, @Nullable AudioAudio audioAudio, @Nullable Integer num7, @Nullable List<GroupsLinksItem> list, @Nullable List<GroupsContactsItem> list2, @Nullable Wall wall, @Nullable String str6, @Nullable GroupsGroupFullSection groupsGroupFullSection, @Nullable GroupsGroupFullSection groupsGroupFullSection2, @Nullable BaseBoolInt baseBoolInt14, @Nullable BaseBoolInt baseBoolInt15, @Nullable BaseBoolInt baseBoolInt16, @Nullable BaseBoolInt baseBoolInt17, @Nullable GroupsOnlineStatus groupsOnlineStatus, @Nullable Integer num8, @Nullable GroupsGroupFullAgeLimits groupsGroupFullAgeLimits, @Nullable GroupsGroupBanInfo groupsGroupBanInfo, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable GroupsAddressesInfo groupsAddressesInfo, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable GroupsLiveCovers groupsLiveCovers, @Nullable Integer num9, @Nullable Boolean bool7, @Nullable String str7, @Nullable String str8, @Nullable GroupsGroupIsClosed groupsGroupIsClosed, @Nullable GroupsGroupType groupsGroupType, @Nullable BaseBoolInt baseBoolInt18, @Nullable GroupsGroupAdminLevel groupsGroupAdminLevel, @Nullable BaseBoolInt baseBoolInt19, @Nullable BaseBoolInt baseBoolInt20, @Nullable Integer num10, @Nullable Integer num11, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable GroupsPhotoSize groupsPhotoSize, @Nullable BaseBoolInt baseBoolInt21, @Nullable VideoLiveInfo videoLiveInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f15244id = id2;
            this.market = groupsMarketInfo;
            this.memberStatus = groupsGroupFullMemberStatus;
            this.isAdult = baseBoolInt;
            this.isHiddenFromFeed = baseBoolInt2;
            this.isFavorite = baseBoolInt3;
            this.isSubscribed = baseBoolInt4;
            this.city = baseObject;
            this.country = baseCountry;
            this.verified = baseBoolInt5;
            this.description = str;
            this.wikiPage = str2;
            this.membersCount = num;
            this.membersCountText = str3;
            this.requestsCount = num2;
            this.videoLiveLevel = num3;
            this.videoLiveCount = num4;
            this.clipsCount = num5;
            this.counters = groupsCountersGroup;
            this.cover = groupsCover;
            this.canPost = baseBoolInt6;
            this.canSuggest = baseBoolInt7;
            this.canUploadStory = baseBoolInt8;
            this.canUploadDoc = baseBoolInt9;
            this.canUploadVideo = baseBoolInt10;
            this.canSeeAllPosts = baseBoolInt11;
            this.canCreateTopic = baseBoolInt12;
            this.activity = str4;
            this.fixedPost = num6;
            this.hasPhoto = baseBoolInt13;
            this.cropPhoto = baseCropPhoto;
            this.status = str5;
            this.statusAudio = audioAudio;
            this.mainAlbumId = num7;
            this.links = list;
            this.contacts = list2;
            this.wall = wall;
            this.site = str6;
            this.mainSection = groupsGroupFullSection;
            this.secondarySection = groupsGroupFullSection2;
            this.trending = baseBoolInt14;
            this.canMessage = baseBoolInt15;
            this.isMessagesBlocked = baseBoolInt16;
            this.canSendNotify = baseBoolInt17;
            this.onlineStatus = groupsOnlineStatus;
            this.invitedBy = num8;
            this.ageLimits = groupsGroupFullAgeLimits;
            this.banInfo = groupsGroupBanInfo;
            this.hasMarketApp = bool;
            this.usingVkpayMarketApp = bool2;
            this.hasGroupChannel = bool3;
            this.addresses = groupsAddressesInfo;
            this.isSubscribedPodcasts = bool4;
            this.canSubscribePodcasts = bool5;
            this.canSubscribePosts = bool6;
            this.liveCovers = groupsLiveCovers;
            this.storiesArchiveCount = num9;
            this.hasUnseenStories = bool7;
            this.name = str7;
            this.screenName = str8;
            this.isClosed = groupsGroupIsClosed;
            this.type = groupsGroupType;
            this.isAdmin = baseBoolInt18;
            this.adminLevel = groupsGroupAdminLevel;
            this.isMember = baseBoolInt19;
            this.isAdvertiser = baseBoolInt20;
            this.startDate = num10;
            this.finishDate = num11;
            this.deactivated = str9;
            this.photo50 = str10;
            this.photo100 = str11;
            this.photo200 = str12;
            this.photo200Orig = str13;
            this.photo400 = str14;
            this.photo400Orig = str15;
            this.photoMax = str16;
            this.photoMaxOrig = str17;
            this.estDate = str18;
            this.publicDateLabel = str19;
            this.photoMaxSize = groupsPhotoSize;
            this.isVideoLiveNotificationsBlocked = baseBoolInt21;
            this.videoLive = videoLiveInfo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class UsersUserXtrType extends UsersSubscriptionsItem {

        @b("can_access_closed")
        @Nullable
        private final Boolean canAccessClosed;

        @b("deactivated")
        @Nullable
        private final String deactivated;

        @b("first_name")
        @Nullable
        private final String firstName;

        @b("friend_status")
        @Nullable
        private final FriendsFriendStatusStatus friendStatus;

        @b("hidden")
        @Nullable
        private final Integer hidden;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @b("id")
        @NotNull
        private final UserId f15245id;

        @b("is_closed")
        @Nullable
        private final Boolean isClosed;

        @b("last_name")
        @Nullable
        private final String lastName;

        @b("mutual")
        @Nullable
        private final FriendsRequestsMutual mutual;

        @b(Device.JsonKeys.ONLINE)
        @Nullable
        private final BaseBoolInt online;

        @b("online_app")
        @Nullable
        private final Integer onlineApp;

        @b("online_info")
        @Nullable
        private final UsersOnlineInfo onlineInfo;

        @b("online_mobile")
        @Nullable
        private final BaseBoolInt onlineMobile;

        @b("photo_100")
        @Nullable
        private final String photo100;

        @b("photo_50")
        @Nullable
        private final String photo50;

        @b("screen_name")
        @Nullable
        private final String screenName;

        @b("sex")
        @Nullable
        private final BaseSex sex;

        @b("trending")
        @Nullable
        private final BaseBoolInt trending;

        @b("type")
        @Nullable
        private final UsersUserType type;

        @b("verified")
        @Nullable
        private final BaseBoolInt verified;

        public /* synthetic */ UsersUserXtrType(UserId userId, UsersUserType usersUserType, BaseSex baseSex, String str, String str2, String str3, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str4, String str5, Integer num2, String str6, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(userId, (i & 2) != 0 ? null : usersUserType, (i & 4) != 0 ? null : baseSex, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : usersOnlineInfo, (i & 128) != 0 ? null : baseBoolInt, (i & 256) != 0 ? null : baseBoolInt2, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : baseBoolInt3, (i & 2048) != 0 ? null : baseBoolInt4, (i & 4096) != 0 ? null : friendsFriendStatusStatus, (i & 8192) != 0 ? null : friendsRequestsMutual, (i & 16384) != 0 ? null : str4, (i & 32768) != 0 ? null : str5, (i & 65536) != 0 ? null : num2, (i & 131072) != 0 ? null : str6, (i & 262144) != 0 ? null : bool, (i & 524288) != 0 ? null : bool2);
        }

        public static /* synthetic */ UsersUserXtrType copy$default(UsersUserXtrType usersUserXtrType, UserId userId, UsersUserType usersUserType, BaseSex baseSex, String str, String str2, String str3, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str4, String str5, Integer num2, String str6, Boolean bool, Boolean bool2, int i, Object obj) {
            Boolean bool3;
            Boolean bool4;
            UserId userId2 = (i & 1) != 0 ? usersUserXtrType.f15245id : userId;
            UsersUserType usersUserType2 = (i & 2) != 0 ? usersUserXtrType.type : usersUserType;
            BaseSex baseSex2 = (i & 4) != 0 ? usersUserXtrType.sex : baseSex;
            String str7 = (i & 8) != 0 ? usersUserXtrType.screenName : str;
            String str8 = (i & 16) != 0 ? usersUserXtrType.photo50 : str2;
            String str9 = (i & 32) != 0 ? usersUserXtrType.photo100 : str3;
            UsersOnlineInfo usersOnlineInfo2 = (i & 64) != 0 ? usersUserXtrType.onlineInfo : usersOnlineInfo;
            BaseBoolInt baseBoolInt5 = (i & 128) != 0 ? usersUserXtrType.online : baseBoolInt;
            BaseBoolInt baseBoolInt6 = (i & 256) != 0 ? usersUserXtrType.onlineMobile : baseBoolInt2;
            Integer num3 = (i & 512) != 0 ? usersUserXtrType.onlineApp : num;
            BaseBoolInt baseBoolInt7 = (i & 1024) != 0 ? usersUserXtrType.verified : baseBoolInt3;
            BaseBoolInt baseBoolInt8 = (i & 2048) != 0 ? usersUserXtrType.trending : baseBoolInt4;
            FriendsFriendStatusStatus friendsFriendStatusStatus2 = (i & 4096) != 0 ? usersUserXtrType.friendStatus : friendsFriendStatusStatus;
            FriendsRequestsMutual friendsRequestsMutual2 = (i & 8192) != 0 ? usersUserXtrType.mutual : friendsRequestsMutual;
            UserId userId3 = userId2;
            String str10 = (i & 16384) != 0 ? usersUserXtrType.deactivated : str4;
            String str11 = (i & 32768) != 0 ? usersUserXtrType.firstName : str5;
            Integer num4 = (i & 65536) != 0 ? usersUserXtrType.hidden : num2;
            String str12 = (i & 131072) != 0 ? usersUserXtrType.lastName : str6;
            Boolean bool5 = (i & 262144) != 0 ? usersUserXtrType.canAccessClosed : bool;
            if ((i & 524288) != 0) {
                bool4 = bool5;
                bool3 = usersUserXtrType.isClosed;
            } else {
                bool3 = bool2;
                bool4 = bool5;
            }
            return usersUserXtrType.copy(userId3, usersUserType2, baseSex2, str7, str8, str9, usersOnlineInfo2, baseBoolInt5, baseBoolInt6, num3, baseBoolInt7, baseBoolInt8, friendsFriendStatusStatus2, friendsRequestsMutual2, str10, str11, num4, str12, bool4, bool3);
        }

        @NotNull
        public final UserId component1() {
            return this.f15245id;
        }

        @Nullable
        public final Integer component10() {
            return this.onlineApp;
        }

        @Nullable
        public final BaseBoolInt component11() {
            return this.verified;
        }

        @Nullable
        public final BaseBoolInt component12() {
            return this.trending;
        }

        @Nullable
        public final FriendsFriendStatusStatus component13() {
            return this.friendStatus;
        }

        @Nullable
        public final FriendsRequestsMutual component14() {
            return this.mutual;
        }

        @Nullable
        public final String component15() {
            return this.deactivated;
        }

        @Nullable
        public final String component16() {
            return this.firstName;
        }

        @Nullable
        public final Integer component17() {
            return this.hidden;
        }

        @Nullable
        public final String component18() {
            return this.lastName;
        }

        @Nullable
        public final Boolean component19() {
            return this.canAccessClosed;
        }

        @Nullable
        public final UsersUserType component2() {
            return this.type;
        }

        @Nullable
        public final Boolean component20() {
            return this.isClosed;
        }

        @Nullable
        public final BaseSex component3() {
            return this.sex;
        }

        @Nullable
        public final String component4() {
            return this.screenName;
        }

        @Nullable
        public final String component5() {
            return this.photo50;
        }

        @Nullable
        public final String component6() {
            return this.photo100;
        }

        @Nullable
        public final UsersOnlineInfo component7() {
            return this.onlineInfo;
        }

        @Nullable
        public final BaseBoolInt component8() {
            return this.online;
        }

        @Nullable
        public final BaseBoolInt component9() {
            return this.onlineMobile;
        }

        @NotNull
        public final UsersUserXtrType copy(@NotNull UserId id2, @Nullable UsersUserType usersUserType, @Nullable BaseSex baseSex, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new UsersUserXtrType(id2, usersUserType, baseSex, str, str2, str3, usersOnlineInfo, baseBoolInt, baseBoolInt2, num, baseBoolInt3, baseBoolInt4, friendsFriendStatusStatus, friendsRequestsMutual, str4, str5, num2, str6, bool, bool2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UsersUserXtrType)) {
                return false;
            }
            UsersUserXtrType usersUserXtrType = (UsersUserXtrType) obj;
            return Intrinsics.a(this.f15245id, usersUserXtrType.f15245id) && this.type == usersUserXtrType.type && this.sex == usersUserXtrType.sex && Intrinsics.a(this.screenName, usersUserXtrType.screenName) && Intrinsics.a(this.photo50, usersUserXtrType.photo50) && Intrinsics.a(this.photo100, usersUserXtrType.photo100) && Intrinsics.a(this.onlineInfo, usersUserXtrType.onlineInfo) && this.online == usersUserXtrType.online && this.onlineMobile == usersUserXtrType.onlineMobile && Intrinsics.a(this.onlineApp, usersUserXtrType.onlineApp) && this.verified == usersUserXtrType.verified && this.trending == usersUserXtrType.trending && this.friendStatus == usersUserXtrType.friendStatus && Intrinsics.a(this.mutual, usersUserXtrType.mutual) && Intrinsics.a(this.deactivated, usersUserXtrType.deactivated) && Intrinsics.a(this.firstName, usersUserXtrType.firstName) && Intrinsics.a(this.hidden, usersUserXtrType.hidden) && Intrinsics.a(this.lastName, usersUserXtrType.lastName) && Intrinsics.a(this.canAccessClosed, usersUserXtrType.canAccessClosed) && Intrinsics.a(this.isClosed, usersUserXtrType.isClosed);
        }

        @Nullable
        public final Boolean getCanAccessClosed() {
            return this.canAccessClosed;
        }

        @Nullable
        public final String getDeactivated() {
            return this.deactivated;
        }

        @Nullable
        public final String getFirstName() {
            return this.firstName;
        }

        @Nullable
        public final FriendsFriendStatusStatus getFriendStatus() {
            return this.friendStatus;
        }

        @Nullable
        public final Integer getHidden() {
            return this.hidden;
        }

        @NotNull
        public final UserId getId() {
            return this.f15245id;
        }

        @Nullable
        public final String getLastName() {
            return this.lastName;
        }

        @Nullable
        public final FriendsRequestsMutual getMutual() {
            return this.mutual;
        }

        @Nullable
        public final BaseBoolInt getOnline() {
            return this.online;
        }

        @Nullable
        public final Integer getOnlineApp() {
            return this.onlineApp;
        }

        @Nullable
        public final UsersOnlineInfo getOnlineInfo() {
            return this.onlineInfo;
        }

        @Nullable
        public final BaseBoolInt getOnlineMobile() {
            return this.onlineMobile;
        }

        @Nullable
        public final String getPhoto100() {
            return this.photo100;
        }

        @Nullable
        public final String getPhoto50() {
            return this.photo50;
        }

        @Nullable
        public final String getScreenName() {
            return this.screenName;
        }

        @Nullable
        public final BaseSex getSex() {
            return this.sex;
        }

        @Nullable
        public final BaseBoolInt getTrending() {
            return this.trending;
        }

        @Nullable
        public final UsersUserType getType() {
            return this.type;
        }

        @Nullable
        public final BaseBoolInt getVerified() {
            return this.verified;
        }

        public int hashCode() {
            int iHashCode = this.f15245id.hashCode() * 31;
            UsersUserType usersUserType = this.type;
            int iHashCode2 = (iHashCode + (usersUserType == null ? 0 : usersUserType.hashCode())) * 31;
            BaseSex baseSex = this.sex;
            int iHashCode3 = (iHashCode2 + (baseSex == null ? 0 : baseSex.hashCode())) * 31;
            String str = this.screenName;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.photo50;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.photo100;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
            int iHashCode7 = (iHashCode6 + (usersOnlineInfo == null ? 0 : usersOnlineInfo.hashCode())) * 31;
            BaseBoolInt baseBoolInt = this.online;
            int iHashCode8 = (iHashCode7 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
            BaseBoolInt baseBoolInt2 = this.onlineMobile;
            int iHashCode9 = (iHashCode8 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
            Integer num = this.onlineApp;
            int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
            BaseBoolInt baseBoolInt3 = this.verified;
            int iHashCode11 = (iHashCode10 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
            BaseBoolInt baseBoolInt4 = this.trending;
            int iHashCode12 = (iHashCode11 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
            FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
            int iHashCode13 = (iHashCode12 + (friendsFriendStatusStatus == null ? 0 : friendsFriendStatusStatus.hashCode())) * 31;
            FriendsRequestsMutual friendsRequestsMutual = this.mutual;
            int iHashCode14 = (iHashCode13 + (friendsRequestsMutual == null ? 0 : friendsRequestsMutual.hashCode())) * 31;
            String str4 = this.deactivated;
            int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.firstName;
            int iHashCode16 = (iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.hidden;
            int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str6 = this.lastName;
            int iHashCode18 = (iHashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.canAccessClosed;
            int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isClosed;
            return iHashCode19 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final Boolean isClosed() {
            return this.isClosed;
        }

        @NotNull
        public String toString() {
            UserId userId = this.f15245id;
            UsersUserType usersUserType = this.type;
            BaseSex baseSex = this.sex;
            String str = this.screenName;
            String str2 = this.photo50;
            String str3 = this.photo100;
            UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
            BaseBoolInt baseBoolInt = this.online;
            BaseBoolInt baseBoolInt2 = this.onlineMobile;
            Integer num = this.onlineApp;
            BaseBoolInt baseBoolInt3 = this.verified;
            BaseBoolInt baseBoolInt4 = this.trending;
            FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
            FriendsRequestsMutual friendsRequestsMutual = this.mutual;
            String str4 = this.deactivated;
            String str5 = this.firstName;
            Integer num2 = this.hidden;
            String str6 = this.lastName;
            Boolean bool = this.canAccessClosed;
            Boolean bool2 = this.isClosed;
            StringBuilder sb2 = new StringBuilder("UsersUserXtrType(id=");
            sb2.append(userId);
            sb2.append(", type=");
            sb2.append(usersUserType);
            sb2.append(", sex=");
            sb2.append(baseSex);
            sb2.append(", screenName=");
            sb2.append(str);
            sb2.append(", photo50=");
            l7.o.t(sb2, str2, ", photo100=", str3, ", onlineInfo=");
            sb2.append(usersOnlineInfo);
            sb2.append(", online=");
            sb2.append(baseBoolInt);
            sb2.append(", onlineMobile=");
            sb2.append(baseBoolInt2);
            sb2.append(", onlineApp=");
            sb2.append(num);
            sb2.append(", verified=");
            a.s(sb2, baseBoolInt3, ", trending=", baseBoolInt4, ", friendStatus=");
            sb2.append(friendsFriendStatusStatus);
            sb2.append(", mutual=");
            sb2.append(friendsRequestsMutual);
            sb2.append(", deactivated=");
            l7.o.t(sb2, str4, ", firstName=", str5, ", hidden=");
            pe.a.r(num2, ", lastName=", str6, ", canAccessClosed=", sb2);
            sb2.append(bool);
            sb2.append(", isClosed=");
            sb2.append(bool2);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UsersUserXtrType(@NotNull UserId id2, @Nullable UsersUserType usersUserType, @Nullable BaseSex baseSex, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f15245id = id2;
            this.type = usersUserType;
            this.sex = baseSex;
            this.screenName = str;
            this.photo50 = str2;
            this.photo100 = str3;
            this.onlineInfo = usersOnlineInfo;
            this.online = baseBoolInt;
            this.onlineMobile = baseBoolInt2;
            this.onlineApp = num;
            this.verified = baseBoolInt3;
            this.trending = baseBoolInt4;
            this.friendStatus = friendsFriendStatusStatus;
            this.mutual = friendsRequestsMutual;
            this.deactivated = str4;
            this.firstName = str5;
            this.hidden = num2;
            this.lastName = str6;
            this.canAccessClosed = bool;
            this.isClosed = bool2;
        }
    }

    public /* synthetic */ UsersSubscriptionsItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UsersSubscriptionsItem() {
    }
}
