package com.vk.sdk.api.stories.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.apps.dto.AppsAppMin;
import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.market.dto.MarketMarketItem;
import com.vk.sdk.api.polls.dto.PollsPoll;
import io.sentry.protocol.App;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class StoriesClickableSticker {

    @b(App.TYPE)
    @Nullable
    private final AppsAppMin app;

    @b("app_context")
    @Nullable
    private final String appContext;

    @b("audio")
    @Nullable
    private final AudioAudio audio;

    @b("audio_start_time")
    @Nullable
    private final Integer audioStartTime;

    @b("clickable_area")
    @NotNull
    private final List<StoriesClickableArea> clickableArea;

    @b("color")
    @Nullable
    private final String color;

    @b("has_new_interactions")
    @Nullable
    private final Boolean hasNewInteractions;

    @b("hashtag")
    @Nullable
    private final String hashtag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15236id;

    @b("is_broadcast_notify_allowed")
    @Nullable
    private final Boolean isBroadcastNotifyAllowed;

    @b("link_object")
    @Nullable
    private final BaseLink linkObject;

    @b("market_item")
    @Nullable
    private final MarketMarketItem marketItem;

    @b("mention")
    @Nullable
    private final String mention;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("place_id")
    @Nullable
    private final Integer placeId;

    @b("poll")
    @Nullable
    private final PollsPoll poll;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("post_owner_id")
    @Nullable
    private final UserId postOwnerId;

    @b("question")
    @Nullable
    private final String question;

    @b("question_button")
    @Nullable
    private final String questionButton;

    @b("situational_app_url")
    @Nullable
    private final String situationalAppUrl;

    @b("situational_theme_id")
    @Nullable
    private final Integer situationalThemeId;

    @b("sticker_id")
    @Nullable
    private final Integer stickerId;

    @b("sticker_pack_id")
    @Nullable
    private final Integer stickerPackId;

    @b("story_id")
    @Nullable
    private final Integer storyId;

    @b("style")
    @Nullable
    private final Style style;

    @b("subtype")
    @Nullable
    private final Subtype subtype;

    @b("tooltip_text")
    @Nullable
    private final String tooltipText;

    @b("type")
    @NotNull
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Style {
        TRANSPARENT("transparent"),
        BLUE_GRADIENT("blue_gradient"),
        RED_GRADIENT("red_gradient"),
        UNDERLINE("underline"),
        BLUE("blue"),
        GREEN("green"),
        WHITE("white"),
        QUESTION_REPLY("question_reply"),
        LIGHT("light"),
        IMPRESSIVE("impressive");


        @NotNull
        private final String value;

        Style(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Subtype {
        MARKET_ITEM("market_item"),
        ALIEXPRESS_PRODUCT("aliexpress_product");


        @NotNull
        private final String value;

        Subtype(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        HASHTAG("hashtag"),
        MENTION("mention"),
        LINK("link"),
        QUESTION("question"),
        PLACE("place"),
        MARKET_ITEM("market_item"),
        MUSIC("music"),
        STORY_REPLY("story_reply"),
        OWNER("owner"),
        POST("post"),
        POLL("poll"),
        STICKER("sticker"),
        APP(App.TYPE),
        SITUATIONAL_THEME("situational_theme");


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

    public StoriesClickableSticker(@NotNull List<StoriesClickableArea> clickableArea, int i, @NotNull Type type, @Nullable String str, @Nullable BaseLink baseLink, @Nullable String str2, @Nullable String str3, @Nullable UserId userId, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable MarketMarketItem marketMarketItem, @Nullable AudioAudio audioAudio, @Nullable Integer num3, @Nullable Style style, @Nullable Subtype subtype, @Nullable UserId userId2, @Nullable Integer num4, @Nullable PollsPoll pollsPoll, @Nullable String str6, @Nullable Integer num5, @Nullable Integer num6, @Nullable AppsAppMin appsAppMin, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(clickableArea, "clickableArea");
        Intrinsics.checkNotNullParameter(type, "type");
        this.clickableArea = clickableArea;
        this.f15236id = i;
        this.type = type;
        this.hashtag = str;
        this.linkObject = baseLink;
        this.mention = str2;
        this.tooltipText = str3;
        this.ownerId = userId;
        this.storyId = num;
        this.question = str4;
        this.questionButton = str5;
        this.placeId = num2;
        this.marketItem = marketMarketItem;
        this.audio = audioAudio;
        this.audioStartTime = num3;
        this.style = style;
        this.subtype = subtype;
        this.postOwnerId = userId2;
        this.postId = num4;
        this.poll = pollsPoll;
        this.color = str6;
        this.stickerId = num5;
        this.stickerPackId = num6;
        this.app = appsAppMin;
        this.appContext = str7;
        this.hasNewInteractions = bool;
        this.isBroadcastNotifyAllowed = bool2;
        this.situationalThemeId = num7;
        this.situationalAppUrl = str8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoriesClickableSticker copy$default(StoriesClickableSticker storiesClickableSticker, List list, int i, Type type, String str, BaseLink baseLink, String str2, String str3, UserId userId, Integer num, String str4, String str5, Integer num2, MarketMarketItem marketMarketItem, AudioAudio audioAudio, Integer num3, Style style, Subtype subtype, UserId userId2, Integer num4, PollsPoll pollsPoll, String str6, Integer num5, Integer num6, AppsAppMin appsAppMin, String str7, Boolean bool, Boolean bool2, Integer num7, String str8, int i10, Object obj) {
        String str9;
        Integer num8;
        List list2 = (i10 & 1) != 0 ? storiesClickableSticker.clickableArea : list;
        int i11 = (i10 & 2) != 0 ? storiesClickableSticker.f15236id : i;
        Type type2 = (i10 & 4) != 0 ? storiesClickableSticker.type : type;
        String str10 = (i10 & 8) != 0 ? storiesClickableSticker.hashtag : str;
        BaseLink baseLink2 = (i10 & 16) != 0 ? storiesClickableSticker.linkObject : baseLink;
        String str11 = (i10 & 32) != 0 ? storiesClickableSticker.mention : str2;
        String str12 = (i10 & 64) != 0 ? storiesClickableSticker.tooltipText : str3;
        UserId userId3 = (i10 & 128) != 0 ? storiesClickableSticker.ownerId : userId;
        Integer num9 = (i10 & 256) != 0 ? storiesClickableSticker.storyId : num;
        String str13 = (i10 & 512) != 0 ? storiesClickableSticker.question : str4;
        String str14 = (i10 & 1024) != 0 ? storiesClickableSticker.questionButton : str5;
        Integer num10 = (i10 & 2048) != 0 ? storiesClickableSticker.placeId : num2;
        MarketMarketItem marketMarketItem2 = (i10 & 4096) != 0 ? storiesClickableSticker.marketItem : marketMarketItem;
        AudioAudio audioAudio2 = (i10 & 8192) != 0 ? storiesClickableSticker.audio : audioAudio;
        List list3 = list2;
        Integer num11 = (i10 & 16384) != 0 ? storiesClickableSticker.audioStartTime : num3;
        Style style2 = (i10 & 32768) != 0 ? storiesClickableSticker.style : style;
        Subtype subtype2 = (i10 & 65536) != 0 ? storiesClickableSticker.subtype : subtype;
        UserId userId4 = (i10 & 131072) != 0 ? storiesClickableSticker.postOwnerId : userId2;
        Integer num12 = (i10 & 262144) != 0 ? storiesClickableSticker.postId : num4;
        PollsPoll pollsPoll2 = (i10 & 524288) != 0 ? storiesClickableSticker.poll : pollsPoll;
        String str15 = (i10 & 1048576) != 0 ? storiesClickableSticker.color : str6;
        Integer num13 = (i10 & 2097152) != 0 ? storiesClickableSticker.stickerId : num5;
        Integer num14 = (i10 & 4194304) != 0 ? storiesClickableSticker.stickerPackId : num6;
        AppsAppMin appsAppMin2 = (i10 & 8388608) != 0 ? storiesClickableSticker.app : appsAppMin;
        String str16 = (i10 & 16777216) != 0 ? storiesClickableSticker.appContext : str7;
        Boolean bool3 = (i10 & 33554432) != 0 ? storiesClickableSticker.hasNewInteractions : bool;
        Boolean bool4 = (i10 & 67108864) != 0 ? storiesClickableSticker.isBroadcastNotifyAllowed : bool2;
        Integer num15 = (i10 & 134217728) != 0 ? storiesClickableSticker.situationalThemeId : num7;
        if ((i10 & 268435456) != 0) {
            num8 = num15;
            str9 = storiesClickableSticker.situationalAppUrl;
        } else {
            str9 = str8;
            num8 = num15;
        }
        return storiesClickableSticker.copy(list3, i11, type2, str10, baseLink2, str11, str12, userId3, num9, str13, str14, num10, marketMarketItem2, audioAudio2, num11, style2, subtype2, userId4, num12, pollsPoll2, str15, num13, num14, appsAppMin2, str16, bool3, bool4, num8, str9);
    }

    @NotNull
    public final List<StoriesClickableArea> component1() {
        return this.clickableArea;
    }

    @Nullable
    public final String component10() {
        return this.question;
    }

    @Nullable
    public final String component11() {
        return this.questionButton;
    }

    @Nullable
    public final Integer component12() {
        return this.placeId;
    }

    @Nullable
    public final MarketMarketItem component13() {
        return this.marketItem;
    }

    @Nullable
    public final AudioAudio component14() {
        return this.audio;
    }

    @Nullable
    public final Integer component15() {
        return this.audioStartTime;
    }

    @Nullable
    public final Style component16() {
        return this.style;
    }

    @Nullable
    public final Subtype component17() {
        return this.subtype;
    }

    @Nullable
    public final UserId component18() {
        return this.postOwnerId;
    }

    @Nullable
    public final Integer component19() {
        return this.postId;
    }

    public final int component2() {
        return this.f15236id;
    }

    @Nullable
    public final PollsPoll component20() {
        return this.poll;
    }

    @Nullable
    public final String component21() {
        return this.color;
    }

    @Nullable
    public final Integer component22() {
        return this.stickerId;
    }

    @Nullable
    public final Integer component23() {
        return this.stickerPackId;
    }

    @Nullable
    public final AppsAppMin component24() {
        return this.app;
    }

    @Nullable
    public final String component25() {
        return this.appContext;
    }

    @Nullable
    public final Boolean component26() {
        return this.hasNewInteractions;
    }

    @Nullable
    public final Boolean component27() {
        return this.isBroadcastNotifyAllowed;
    }

    @Nullable
    public final Integer component28() {
        return this.situationalThemeId;
    }

    @Nullable
    public final String component29() {
        return this.situationalAppUrl;
    }

    @NotNull
    public final Type component3() {
        return this.type;
    }

    @Nullable
    public final String component4() {
        return this.hashtag;
    }

    @Nullable
    public final BaseLink component5() {
        return this.linkObject;
    }

    @Nullable
    public final String component6() {
        return this.mention;
    }

    @Nullable
    public final String component7() {
        return this.tooltipText;
    }

    @Nullable
    public final UserId component8() {
        return this.ownerId;
    }

    @Nullable
    public final Integer component9() {
        return this.storyId;
    }

    @NotNull
    public final StoriesClickableSticker copy(@NotNull List<StoriesClickableArea> clickableArea, int i, @NotNull Type type, @Nullable String str, @Nullable BaseLink baseLink, @Nullable String str2, @Nullable String str3, @Nullable UserId userId, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable MarketMarketItem marketMarketItem, @Nullable AudioAudio audioAudio, @Nullable Integer num3, @Nullable Style style, @Nullable Subtype subtype, @Nullable UserId userId2, @Nullable Integer num4, @Nullable PollsPoll pollsPoll, @Nullable String str6, @Nullable Integer num5, @Nullable Integer num6, @Nullable AppsAppMin appsAppMin, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(clickableArea, "clickableArea");
        Intrinsics.checkNotNullParameter(type, "type");
        return new StoriesClickableSticker(clickableArea, i, type, str, baseLink, str2, str3, userId, num, str4, str5, num2, marketMarketItem, audioAudio, num3, style, subtype, userId2, num4, pollsPoll, str6, num5, num6, appsAppMin, str7, bool, bool2, num7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableSticker)) {
            return false;
        }
        StoriesClickableSticker storiesClickableSticker = (StoriesClickableSticker) obj;
        return Intrinsics.a(this.clickableArea, storiesClickableSticker.clickableArea) && this.f15236id == storiesClickableSticker.f15236id && this.type == storiesClickableSticker.type && Intrinsics.a(this.hashtag, storiesClickableSticker.hashtag) && Intrinsics.a(this.linkObject, storiesClickableSticker.linkObject) && Intrinsics.a(this.mention, storiesClickableSticker.mention) && Intrinsics.a(this.tooltipText, storiesClickableSticker.tooltipText) && Intrinsics.a(this.ownerId, storiesClickableSticker.ownerId) && Intrinsics.a(this.storyId, storiesClickableSticker.storyId) && Intrinsics.a(this.question, storiesClickableSticker.question) && Intrinsics.a(this.questionButton, storiesClickableSticker.questionButton) && Intrinsics.a(this.placeId, storiesClickableSticker.placeId) && Intrinsics.a(this.marketItem, storiesClickableSticker.marketItem) && Intrinsics.a(this.audio, storiesClickableSticker.audio) && Intrinsics.a(this.audioStartTime, storiesClickableSticker.audioStartTime) && this.style == storiesClickableSticker.style && this.subtype == storiesClickableSticker.subtype && Intrinsics.a(this.postOwnerId, storiesClickableSticker.postOwnerId) && Intrinsics.a(this.postId, storiesClickableSticker.postId) && Intrinsics.a(this.poll, storiesClickableSticker.poll) && Intrinsics.a(this.color, storiesClickableSticker.color) && Intrinsics.a(this.stickerId, storiesClickableSticker.stickerId) && Intrinsics.a(this.stickerPackId, storiesClickableSticker.stickerPackId) && Intrinsics.a(this.app, storiesClickableSticker.app) && Intrinsics.a(this.appContext, storiesClickableSticker.appContext) && Intrinsics.a(this.hasNewInteractions, storiesClickableSticker.hasNewInteractions) && Intrinsics.a(this.isBroadcastNotifyAllowed, storiesClickableSticker.isBroadcastNotifyAllowed) && Intrinsics.a(this.situationalThemeId, storiesClickableSticker.situationalThemeId) && Intrinsics.a(this.situationalAppUrl, storiesClickableSticker.situationalAppUrl);
    }

    @Nullable
    public final AppsAppMin getApp() {
        return this.app;
    }

    @Nullable
    public final String getAppContext() {
        return this.appContext;
    }

    @Nullable
    public final AudioAudio getAudio() {
        return this.audio;
    }

    @Nullable
    public final Integer getAudioStartTime() {
        return this.audioStartTime;
    }

    @NotNull
    public final List<StoriesClickableArea> getClickableArea() {
        return this.clickableArea;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final Boolean getHasNewInteractions() {
        return this.hasNewInteractions;
    }

    @Nullable
    public final String getHashtag() {
        return this.hashtag;
    }

    public final int getId() {
        return this.f15236id;
    }

    @Nullable
    public final BaseLink getLinkObject() {
        return this.linkObject;
    }

    @Nullable
    public final MarketMarketItem getMarketItem() {
        return this.marketItem;
    }

    @Nullable
    public final String getMention() {
        return this.mention;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final Integer getPlaceId() {
        return this.placeId;
    }

    @Nullable
    public final PollsPoll getPoll() {
        return this.poll;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final UserId getPostOwnerId() {
        return this.postOwnerId;
    }

    @Nullable
    public final String getQuestion() {
        return this.question;
    }

    @Nullable
    public final String getQuestionButton() {
        return this.questionButton;
    }

    @Nullable
    public final String getSituationalAppUrl() {
        return this.situationalAppUrl;
    }

    @Nullable
    public final Integer getSituationalThemeId() {
        return this.situationalThemeId;
    }

    @Nullable
    public final Integer getStickerId() {
        return this.stickerId;
    }

    @Nullable
    public final Integer getStickerPackId() {
        return this.stickerPackId;
    }

    @Nullable
    public final Integer getStoryId() {
        return this.storyId;
    }

    @Nullable
    public final Style getStyle() {
        return this.style;
    }

    @Nullable
    public final Subtype getSubtype() {
        return this.subtype;
    }

    @Nullable
    public final String getTooltipText() {
        return this.tooltipText;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + u.g(this.f15236id, this.clickableArea.hashCode() * 31, 31)) * 31;
        String str = this.hashtag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLink baseLink = this.linkObject;
        int iHashCode3 = (iHashCode2 + (baseLink == null ? 0 : baseLink.hashCode())) * 31;
        String str2 = this.mention;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tooltipText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.ownerId;
        int iHashCode6 = (iHashCode5 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num = this.storyId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.question;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.questionButton;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.placeId;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MarketMarketItem marketMarketItem = this.marketItem;
        int iHashCode11 = (iHashCode10 + (marketMarketItem == null ? 0 : marketMarketItem.hashCode())) * 31;
        AudioAudio audioAudio = this.audio;
        int iHashCode12 = (iHashCode11 + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        Integer num3 = this.audioStartTime;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Style style = this.style;
        int iHashCode14 = (iHashCode13 + (style == null ? 0 : style.hashCode())) * 31;
        Subtype subtype = this.subtype;
        int iHashCode15 = (iHashCode14 + (subtype == null ? 0 : subtype.hashCode())) * 31;
        UserId userId2 = this.postOwnerId;
        int iHashCode16 = (iHashCode15 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        Integer num4 = this.postId;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        PollsPoll pollsPoll = this.poll;
        int iHashCode18 = (iHashCode17 + (pollsPoll == null ? 0 : pollsPoll.hashCode())) * 31;
        String str6 = this.color;
        int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.stickerId;
        int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.stickerPackId;
        int iHashCode21 = (iHashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        AppsAppMin appsAppMin = this.app;
        int iHashCode22 = (iHashCode21 + (appsAppMin == null ? 0 : appsAppMin.hashCode())) * 31;
        String str7 = this.appContext;
        int iHashCode23 = (iHashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.hasNewInteractions;
        int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBroadcastNotifyAllowed;
        int iHashCode25 = (iHashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num7 = this.situationalThemeId;
        int iHashCode26 = (iHashCode25 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str8 = this.situationalAppUrl;
        return iHashCode26 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isBroadcastNotifyAllowed() {
        return this.isBroadcastNotifyAllowed;
    }

    @NotNull
    public String toString() {
        List<StoriesClickableArea> list = this.clickableArea;
        int i = this.f15236id;
        Type type = this.type;
        String str = this.hashtag;
        BaseLink baseLink = this.linkObject;
        String str2 = this.mention;
        String str3 = this.tooltipText;
        UserId userId = this.ownerId;
        Integer num = this.storyId;
        String str4 = this.question;
        String str5 = this.questionButton;
        Integer num2 = this.placeId;
        MarketMarketItem marketMarketItem = this.marketItem;
        AudioAudio audioAudio = this.audio;
        Integer num3 = this.audioStartTime;
        Style style = this.style;
        Subtype subtype = this.subtype;
        UserId userId2 = this.postOwnerId;
        Integer num4 = this.postId;
        PollsPoll pollsPoll = this.poll;
        String str6 = this.color;
        Integer num5 = this.stickerId;
        Integer num6 = this.stickerPackId;
        AppsAppMin appsAppMin = this.app;
        String str7 = this.appContext;
        Boolean bool = this.hasNewInteractions;
        Boolean bool2 = this.isBroadcastNotifyAllowed;
        Integer num7 = this.situationalThemeId;
        String str8 = this.situationalAppUrl;
        StringBuilder sb2 = new StringBuilder("StoriesClickableSticker(clickableArea=");
        sb2.append(list);
        sb2.append(", id=");
        sb2.append(i);
        sb2.append(", type=");
        sb2.append(type);
        sb2.append(", hashtag=");
        sb2.append(str);
        sb2.append(", linkObject=");
        sb2.append(baseLink);
        sb2.append(", mention=");
        sb2.append(str2);
        sb2.append(", tooltipText=");
        sb2.append(str3);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", storyId=");
        a.r(num, ", question=", str4, ", questionButton=", sb2);
        gf.a.r(num2, str5, ", placeId=", ", marketItem=", sb2);
        sb2.append(marketMarketItem);
        sb2.append(", audio=");
        sb2.append(audioAudio);
        sb2.append(", audioStartTime=");
        sb2.append(num3);
        sb2.append(", style=");
        sb2.append(style);
        sb2.append(", subtype=");
        sb2.append(subtype);
        sb2.append(", postOwnerId=");
        sb2.append(userId2);
        sb2.append(", postId=");
        sb2.append(num4);
        sb2.append(", poll=");
        sb2.append(pollsPoll);
        sb2.append(", color=");
        gf.a.r(num5, str6, ", stickerId=", ", stickerPackId=", sb2);
        sb2.append(num6);
        sb2.append(", app=");
        sb2.append(appsAppMin);
        sb2.append(", appContext=");
        sb2.append(str7);
        sb2.append(", hasNewInteractions=");
        sb2.append(bool);
        sb2.append(", isBroadcastNotifyAllowed=");
        sb2.append(bool2);
        sb2.append(", situationalThemeId=");
        sb2.append(num7);
        sb2.append(", situationalAppUrl=");
        return u.o(sb2, str8, ")");
    }

    public /* synthetic */ StoriesClickableSticker(List list, int i, Type type, String str, BaseLink baseLink, String str2, String str3, UserId userId, Integer num, String str4, String str5, Integer num2, MarketMarketItem marketMarketItem, AudioAudio audioAudio, Integer num3, Style style, Subtype subtype, UserId userId2, Integer num4, PollsPoll pollsPoll, String str6, Integer num5, Integer num6, AppsAppMin appsAppMin, String str7, Boolean bool, Boolean bool2, Integer num7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, type, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : baseLink, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : userId, (i10 & 256) != 0 ? null : num, (i10 & 512) != 0 ? null : str4, (i10 & 1024) != 0 ? null : str5, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : marketMarketItem, (i10 & 8192) != 0 ? null : audioAudio, (i10 & 16384) != 0 ? null : num3, (32768 & i10) != 0 ? null : style, (65536 & i10) != 0 ? null : subtype, (131072 & i10) != 0 ? null : userId2, (262144 & i10) != 0 ? null : num4, (524288 & i10) != 0 ? null : pollsPoll, (1048576 & i10) != 0 ? null : str6, (2097152 & i10) != 0 ? null : num5, (4194304 & i10) != 0 ? null : num6, (8388608 & i10) != 0 ? null : appsAppMin, (16777216 & i10) != 0 ? null : str7, (33554432 & i10) != 0 ? null : bool, (67108864 & i10) != 0 ? null : bool2, (134217728 & i10) != 0 ? null : num7, (i10 & 268435456) != 0 ? null : str8);
    }
}
