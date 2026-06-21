package com.vk.sdk.api.newsfeed.dto;

import a0.b1;
import a0.u;
import com.google.android.gms.internal.ads.om1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.aliexpress.dto.AliexpressBlockPanel;
import com.vk.sdk.api.aliexpress.dto.AliexpressCarouselItem;
import com.vk.sdk.api.aliexpress.dto.AliexpressPromoCard;
import com.vk.sdk.api.aliexpress.dto.AliexpressSocialFooter;
import com.vk.sdk.api.apps.dto.AppsApp;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseCommentsInfo;
import com.vk.sdk.api.base.dto.BaseImage;
import com.vk.sdk.api.base.dto.BaseLikesInfo;
import com.vk.sdk.api.base.dto.BaseLinkButton;
import com.vk.sdk.api.base.dto.BaseRepostsInfo;
import com.vk.sdk.api.classifieds.dto.ClassifiedsWorkiCarouselItem;
import com.vk.sdk.api.classifieds.dto.ClassifiedsYoulaCarouselBlockGroup;
import com.vk.sdk.api.classifieds.dto.ClassifiedsYoulaGroupsBlock;
import com.vk.sdk.api.classifieds.dto.ClassifiedsYoulaItemExtended;
import com.vk.sdk.api.discover.dto.DiscoverCarouselButton;
import com.vk.sdk.api.discover.dto.DiscoverCarouselItem;
import com.vk.sdk.api.discover.dto.DiscoverCarouselObjectsType;
import com.vk.sdk.api.groups.dto.GroupsSuggestion;
import com.vk.sdk.api.messages.dto.MessagesChatSuggestion;
import com.vk.sdk.api.photos.dto.PhotosTagsSuggestionItem;
import com.vk.sdk.api.photos.dto.PhotosTagsSuggestionItemEndCard;
import com.vk.sdk.api.stories.dto.StoriesStory;
import com.vk.sdk.api.textlives.dto.TextlivesTextliveTextpostBlock;
import com.vk.sdk.api.video.dto.VideoVideo;
import com.vk.sdk.api.video.dto.VideoVideoFull;
import com.vk.sdk.api.wall.dto.WallGeo;
import com.vk.sdk.api.wall.dto.WallPostCopyright;
import com.vk.sdk.api.wall.dto.WallPostSource;
import com.vk.sdk.api.wall.dto.WallPostType;
import com.vk.sdk.api.wall.dto.WallViews;
import com.vk.sdk.api.wall.dto.WallWallpostAttachment;
import com.vk.sdk.api.wall.dto.WallWallpostDonut;
import com.vk.sdk.api.wall.dto.WallWallpostFull;
import gf.a;
import io.appmetrica.analytics.impl.A2;
import io.sentry.MeasurementUnit;
import io.sentry.UserFeedback;
import io.sentry.protocol.App;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.User;
import io.sentry.rrweb.RRWebVideoEvent;
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
import t.z;

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
public abstract class NewsfeedNewsfeedItem {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Deserializer implements o {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // me.o
        @NotNull
        public NewsfeedNewsfeedItem deserialize(@NotNull p json, @Nullable Type type, @NotNull n context) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(context, "context");
            String strE = ((p) json.a().f28895b.get("type")).e();
            if (strE != null) {
                switch (strE.hashCode()) {
                    case -2002177155:
                        if (strE.equals("wall_photo")) {
                            Object objR = ((b1) context).r(json, NewsfeedItemPhoto.class);
                            Intrinsics.checkNotNullExpressionValue(objR, "context.deserialize(json…eedItemPhoto::class.java)");
                            return (NewsfeedNewsfeedItem) objR;
                        }
                        break;
                    case -1331913276:
                        if (strE.equals("digest")) {
                            Object objR2 = ((b1) context).r(json, NewsfeedItemDigest.class);
                            Intrinsics.checkNotNullExpressionValue(objR2, "context.deserialize(json…edItemDigest::class.java)");
                            return (NewsfeedNewsfeedItem) objR2;
                        }
                        break;
                    case -1266283874:
                        if (strE.equals("friend")) {
                            Object objR3 = ((b1) context).r(json, NewsfeedItemFriend.class);
                            Intrinsics.checkNotNullExpressionValue(objR3, "context.deserialize(json…edItemFriend::class.java)");
                            return (NewsfeedNewsfeedItem) objR3;
                        }
                        break;
                    case -847657971:
                        if (strE.equals("photo_tag")) {
                            Object objR4 = ((b1) context).r(json, NewsfeedItemPhotoTag.class);
                            Intrinsics.checkNotNullExpressionValue(objR4, "context.deserialize(json…ItemPhotoTag::class.java)");
                            return (NewsfeedNewsfeedItem) objR4;
                        }
                        break;
                    case 3446944:
                        if (strE.equals("post")) {
                            Object objR5 = ((b1) context).r(json, NewsfeedItemWallpost.class);
                            Intrinsics.checkNotNullExpressionValue(objR5, "context.deserialize(json…ItemWallpost::class.java)");
                            return (NewsfeedNewsfeedItem) objR5;
                        }
                        break;
                    case 93166550:
                        if (strE.equals("audio")) {
                            Object objR6 = ((b1) context).r(json, NewsfeedItemAudio.class);
                            Intrinsics.checkNotNullExpressionValue(objR6, "context.deserialize(json…eedItemAudio::class.java)");
                            return (NewsfeedNewsfeedItem) objR6;
                        }
                        break;
                    case 106642994:
                        if (strE.equals("photo")) {
                            Object objR7 = ((b1) context).r(json, NewsfeedItemPhoto.class);
                            Intrinsics.checkNotNullExpressionValue(objR7, "context.deserialize(json…eedItemPhoto::class.java)");
                            return (NewsfeedNewsfeedItem) objR7;
                        }
                        break;
                    case 110546223:
                        if (strE.equals("topic")) {
                            Object objR8 = ((b1) context).r(json, NewsfeedItemTopic.class);
                            Intrinsics.checkNotNullExpressionValue(objR8, "context.deserialize(json…eedItemTopic::class.java)");
                            return (NewsfeedNewsfeedItem) objR8;
                        }
                        break;
                    case 112202875:
                        if (strE.equals(RRWebVideoEvent.EVENT_TAG)) {
                            Object objR9 = ((b1) context).r(json, NewsfeedItemVideo.class);
                            Intrinsics.checkNotNullExpressionValue(objR9, "context.deserialize(json…eedItemVideo::class.java)");
                            return (NewsfeedNewsfeedItem) objR9;
                        }
                        break;
                    case 310369378:
                        if (strE.equals("promo_button")) {
                            Object objR10 = ((b1) context).r(json, NewsfeedItemPromoButton.class);
                            Intrinsics.checkNotNullExpressionValue(objR10, "context.deserialize(json…mPromoButton::class.java)");
                            return (NewsfeedNewsfeedItem) objR10;
                        }
                        break;
                }
            }
            throw new IllegalStateException(om1.k("no mapping for the type:", strE));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemAliexpressCarouselBlock extends NewsfeedNewsfeedItem {

        @b("block_panel")
        @Nullable
        private final AliexpressBlockPanel blockPanel;

        @b("block_title")
        @NotNull
        private final String blockTitle;

        @b("footer")
        @Nullable
        private final AliexpressSocialFooter footer;

        @b("goods_carousel_view_type")
        @NotNull
        private final String goodsCarouselViewType;

        @b("is_async")
        @Nullable
        private final Boolean isAsync;

        @b("items")
        @Nullable
        private final List<AliexpressCarouselItem> items;

        @b("more_button")
        @Nullable
        private final BaseLinkButton moreButton;

        @b("promo_card")
        @Nullable
        private final AliexpressPromoCard promoCard;

        @b("track_code")
        @NotNull
        private final String trackCode;

        @b("type")
        @NotNull
        private final Type type;

        @b("use_oneline_product_title")
        @Nullable
        private final Boolean useOnelineProductTitle;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Type {
            ALIEXPRESS_CAROUSEL("aliexpress_carousel");


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

        public /* synthetic */ NewsfeedItemAliexpressCarouselBlock(Type type, String str, String str2, String str3, AliexpressBlockPanel aliexpressBlockPanel, AliexpressPromoCard aliexpressPromoCard, List list, BaseLinkButton baseLinkButton, AliexpressSocialFooter aliexpressSocialFooter, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, str2, str3, (i & 16) != 0 ? null : aliexpressBlockPanel, (i & 32) != 0 ? null : aliexpressPromoCard, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : baseLinkButton, (i & 256) != 0 ? null : aliexpressSocialFooter, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemAliexpressCarouselBlock copy$default(NewsfeedItemAliexpressCarouselBlock newsfeedItemAliexpressCarouselBlock, Type type, String str, String str2, String str3, AliexpressBlockPanel aliexpressBlockPanel, AliexpressPromoCard aliexpressPromoCard, List list, BaseLinkButton baseLinkButton, AliexpressSocialFooter aliexpressSocialFooter, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                type = newsfeedItemAliexpressCarouselBlock.type;
            }
            if ((i & 2) != 0) {
                str = newsfeedItemAliexpressCarouselBlock.blockTitle;
            }
            if ((i & 4) != 0) {
                str2 = newsfeedItemAliexpressCarouselBlock.trackCode;
            }
            if ((i & 8) != 0) {
                str3 = newsfeedItemAliexpressCarouselBlock.goodsCarouselViewType;
            }
            if ((i & 16) != 0) {
                aliexpressBlockPanel = newsfeedItemAliexpressCarouselBlock.blockPanel;
            }
            if ((i & 32) != 0) {
                aliexpressPromoCard = newsfeedItemAliexpressCarouselBlock.promoCard;
            }
            if ((i & 64) != 0) {
                list = newsfeedItemAliexpressCarouselBlock.items;
            }
            if ((i & 128) != 0) {
                baseLinkButton = newsfeedItemAliexpressCarouselBlock.moreButton;
            }
            if ((i & 256) != 0) {
                aliexpressSocialFooter = newsfeedItemAliexpressCarouselBlock.footer;
            }
            if ((i & 512) != 0) {
                bool = newsfeedItemAliexpressCarouselBlock.useOnelineProductTitle;
            }
            if ((i & 1024) != 0) {
                bool2 = newsfeedItemAliexpressCarouselBlock.isAsync;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            BaseLinkButton baseLinkButton2 = baseLinkButton;
            AliexpressSocialFooter aliexpressSocialFooter2 = aliexpressSocialFooter;
            AliexpressPromoCard aliexpressPromoCard2 = aliexpressPromoCard;
            List list2 = list;
            AliexpressBlockPanel aliexpressBlockPanel2 = aliexpressBlockPanel;
            String str4 = str2;
            return newsfeedItemAliexpressCarouselBlock.copy(type, str, str4, str3, aliexpressBlockPanel2, aliexpressPromoCard2, list2, baseLinkButton2, aliexpressSocialFooter2, bool3, bool4);
        }

        @NotNull
        public final Type component1() {
            return this.type;
        }

        @Nullable
        public final Boolean component10() {
            return this.useOnelineProductTitle;
        }

        @Nullable
        public final Boolean component11() {
            return this.isAsync;
        }

        @NotNull
        public final String component2() {
            return this.blockTitle;
        }

        @NotNull
        public final String component3() {
            return this.trackCode;
        }

        @NotNull
        public final String component4() {
            return this.goodsCarouselViewType;
        }

        @Nullable
        public final AliexpressBlockPanel component5() {
            return this.blockPanel;
        }

        @Nullable
        public final AliexpressPromoCard component6() {
            return this.promoCard;
        }

        @Nullable
        public final List<AliexpressCarouselItem> component7() {
            return this.items;
        }

        @Nullable
        public final BaseLinkButton component8() {
            return this.moreButton;
        }

        @Nullable
        public final AliexpressSocialFooter component9() {
            return this.footer;
        }

        @NotNull
        public final NewsfeedItemAliexpressCarouselBlock copy(@NotNull Type type, @NotNull String blockTitle, @NotNull String trackCode, @NotNull String goodsCarouselViewType, @Nullable AliexpressBlockPanel aliexpressBlockPanel, @Nullable AliexpressPromoCard aliexpressPromoCard, @Nullable List<AliexpressCarouselItem> list, @Nullable BaseLinkButton baseLinkButton, @Nullable AliexpressSocialFooter aliexpressSocialFooter, @Nullable Boolean bool, @Nullable Boolean bool2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(blockTitle, "blockTitle");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            Intrinsics.checkNotNullParameter(goodsCarouselViewType, "goodsCarouselViewType");
            return new NewsfeedItemAliexpressCarouselBlock(type, blockTitle, trackCode, goodsCarouselViewType, aliexpressBlockPanel, aliexpressPromoCard, list, baseLinkButton, aliexpressSocialFooter, bool, bool2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAliexpressCarouselBlock)) {
                return false;
            }
            NewsfeedItemAliexpressCarouselBlock newsfeedItemAliexpressCarouselBlock = (NewsfeedItemAliexpressCarouselBlock) obj;
            return this.type == newsfeedItemAliexpressCarouselBlock.type && Intrinsics.a(this.blockTitle, newsfeedItemAliexpressCarouselBlock.blockTitle) && Intrinsics.a(this.trackCode, newsfeedItemAliexpressCarouselBlock.trackCode) && Intrinsics.a(this.goodsCarouselViewType, newsfeedItemAliexpressCarouselBlock.goodsCarouselViewType) && Intrinsics.a(this.blockPanel, newsfeedItemAliexpressCarouselBlock.blockPanel) && Intrinsics.a(this.promoCard, newsfeedItemAliexpressCarouselBlock.promoCard) && Intrinsics.a(this.items, newsfeedItemAliexpressCarouselBlock.items) && Intrinsics.a(this.moreButton, newsfeedItemAliexpressCarouselBlock.moreButton) && Intrinsics.a(this.footer, newsfeedItemAliexpressCarouselBlock.footer) && Intrinsics.a(this.useOnelineProductTitle, newsfeedItemAliexpressCarouselBlock.useOnelineProductTitle) && Intrinsics.a(this.isAsync, newsfeedItemAliexpressCarouselBlock.isAsync);
        }

        @Nullable
        public final AliexpressBlockPanel getBlockPanel() {
            return this.blockPanel;
        }

        @NotNull
        public final String getBlockTitle() {
            return this.blockTitle;
        }

        @Nullable
        public final AliexpressSocialFooter getFooter() {
            return this.footer;
        }

        @NotNull
        public final String getGoodsCarouselViewType() {
            return this.goodsCarouselViewType;
        }

        @Nullable
        public final List<AliexpressCarouselItem> getItems() {
            return this.items;
        }

        @Nullable
        public final BaseLinkButton getMoreButton() {
            return this.moreButton;
        }

        @Nullable
        public final AliexpressPromoCard getPromoCard() {
            return this.promoCard;
        }

        @NotNull
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        @Nullable
        public final Boolean getUseOnelineProductTitle() {
            return this.useOnelineProductTitle;
        }

        public int hashCode() {
            int iE = a.e(a.e(a.e(this.type.hashCode() * 31, 31, this.blockTitle), 31, this.trackCode), 31, this.goodsCarouselViewType);
            AliexpressBlockPanel aliexpressBlockPanel = this.blockPanel;
            int iHashCode = (iE + (aliexpressBlockPanel == null ? 0 : aliexpressBlockPanel.hashCode())) * 31;
            AliexpressPromoCard aliexpressPromoCard = this.promoCard;
            int iHashCode2 = (iHashCode + (aliexpressPromoCard == null ? 0 : aliexpressPromoCard.hashCode())) * 31;
            List<AliexpressCarouselItem> list = this.items;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            BaseLinkButton baseLinkButton = this.moreButton;
            int iHashCode4 = (iHashCode3 + (baseLinkButton == null ? 0 : baseLinkButton.hashCode())) * 31;
            AliexpressSocialFooter aliexpressSocialFooter = this.footer;
            int iHashCode5 = (iHashCode4 + (aliexpressSocialFooter == null ? 0 : aliexpressSocialFooter.hashCode())) * 31;
            Boolean bool = this.useOnelineProductTitle;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isAsync;
            return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final Boolean isAsync() {
            return this.isAsync;
        }

        @NotNull
        public String toString() {
            Type type = this.type;
            String str = this.blockTitle;
            String str2 = this.trackCode;
            String str3 = this.goodsCarouselViewType;
            AliexpressBlockPanel aliexpressBlockPanel = this.blockPanel;
            AliexpressPromoCard aliexpressPromoCard = this.promoCard;
            List<AliexpressCarouselItem> list = this.items;
            BaseLinkButton baseLinkButton = this.moreButton;
            AliexpressSocialFooter aliexpressSocialFooter = this.footer;
            Boolean bool = this.useOnelineProductTitle;
            Boolean bool2 = this.isAsync;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemAliexpressCarouselBlock(type=");
            sb2.append(type);
            sb2.append(", blockTitle=");
            sb2.append(str);
            sb2.append(", trackCode=");
            l7.o.t(sb2, str2, ", goodsCarouselViewType=", str3, ", blockPanel=");
            sb2.append(aliexpressBlockPanel);
            sb2.append(", promoCard=");
            sb2.append(aliexpressPromoCard);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", moreButton=");
            sb2.append(baseLinkButton);
            sb2.append(", footer=");
            sb2.append(aliexpressSocialFooter);
            sb2.append(", useOnelineProductTitle=");
            sb2.append(bool);
            sb2.append(", isAsync=");
            sb2.append(bool2);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemAliexpressCarouselBlock(@NotNull Type type, @NotNull String blockTitle, @NotNull String trackCode, @NotNull String goodsCarouselViewType, @Nullable AliexpressBlockPanel aliexpressBlockPanel, @Nullable AliexpressPromoCard aliexpressPromoCard, @Nullable List<AliexpressCarouselItem> list, @Nullable BaseLinkButton baseLinkButton, @Nullable AliexpressSocialFooter aliexpressSocialFooter, @Nullable Boolean bool, @Nullable Boolean bool2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(blockTitle, "blockTitle");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            Intrinsics.checkNotNullParameter(goodsCarouselViewType, "goodsCarouselViewType");
            this.type = type;
            this.blockTitle = blockTitle;
            this.trackCode = trackCode;
            this.goodsCarouselViewType = goodsCarouselViewType;
            this.blockPanel = aliexpressBlockPanel;
            this.promoCard = aliexpressPromoCard;
            this.items = list;
            this.moreButton = baseLinkButton;
            this.footer = aliexpressSocialFooter;
            this.useOnelineProductTitle = bool;
            this.isAsync = bool2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemAnimatedBlock extends NewsfeedNewsfeedItem {

        @b("animation")
        @Nullable
        private final NewsfeedItemAnimatedBlockAnimation animation;

        @b("block_id")
        @Nullable
        private final String blockId;

        @b("button")
        @Nullable
        private final BaseLinkButton button;

        @b("date")
        private final int date;

        @b("decoration")
        @Nullable
        private final Decoration decoration;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("subtitle")
        @Nullable
        private final String subtitle;

        @b("text")
        @Nullable
        private final String text;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Decoration {
            NONE(MeasurementUnit.NONE),
            BACKGROUND(A2.f22054g),
            CARD("card");


            @NotNull
            private final String value;

            Decoration(String str) {
                this.value = str;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ NewsfeedItemAnimatedBlock(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation, String str3, Decoration decoration, String str4, BaseLinkButton baseLinkButton, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : newsfeedItemAnimatedBlockAnimation, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : decoration, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : baseLinkButton);
        }

        public static /* synthetic */ NewsfeedItemAnimatedBlock copy$default(NewsfeedItemAnimatedBlock newsfeedItemAnimatedBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation, String str3, Decoration decoration, String str4, BaseLinkButton baseLinkButton, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemAnimatedBlock.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemAnimatedBlock.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemAnimatedBlock.date;
            }
            if ((i10 & 8) != 0) {
                str = newsfeedItemAnimatedBlock.blockId;
            }
            if ((i10 & 16) != 0) {
                str2 = newsfeedItemAnimatedBlock.text;
            }
            if ((i10 & 32) != 0) {
                newsfeedItemAnimatedBlockAnimation = newsfeedItemAnimatedBlock.animation;
            }
            if ((i10 & 64) != 0) {
                str3 = newsfeedItemAnimatedBlock.trackCode;
            }
            if ((i10 & 128) != 0) {
                decoration = newsfeedItemAnimatedBlock.decoration;
            }
            if ((i10 & 256) != 0) {
                str4 = newsfeedItemAnimatedBlock.subtitle;
            }
            if ((i10 & 512) != 0) {
                baseLinkButton = newsfeedItemAnimatedBlock.button;
            }
            String str5 = str4;
            BaseLinkButton baseLinkButton2 = baseLinkButton;
            String str6 = str3;
            Decoration decoration2 = decoration;
            String str7 = str2;
            NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation2 = newsfeedItemAnimatedBlockAnimation;
            return newsfeedItemAnimatedBlock.copy(newsfeedNewsfeedItemType, userId, i, str, str7, newsfeedItemAnimatedBlockAnimation2, str6, decoration2, str5, baseLinkButton2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @Nullable
        public final BaseLinkButton component10() {
            return this.button;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final String component4() {
            return this.blockId;
        }

        @Nullable
        public final String component5() {
            return this.text;
        }

        @Nullable
        public final NewsfeedItemAnimatedBlockAnimation component6() {
            return this.animation;
        }

        @Nullable
        public final String component7() {
            return this.trackCode;
        }

        @Nullable
        public final Decoration component8() {
            return this.decoration;
        }

        @Nullable
        public final String component9() {
            return this.subtitle;
        }

        @NotNull
        public final NewsfeedItemAnimatedBlock copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation, @Nullable String str3, @Nullable Decoration decoration, @Nullable String str4, @Nullable BaseLinkButton baseLinkButton) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemAnimatedBlock(type, sourceId, i, str, str2, newsfeedItemAnimatedBlockAnimation, str3, decoration, str4, baseLinkButton);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAnimatedBlock)) {
                return false;
            }
            NewsfeedItemAnimatedBlock newsfeedItemAnimatedBlock = (NewsfeedItemAnimatedBlock) obj;
            return this.type == newsfeedItemAnimatedBlock.type && Intrinsics.a(this.sourceId, newsfeedItemAnimatedBlock.sourceId) && this.date == newsfeedItemAnimatedBlock.date && Intrinsics.a(this.blockId, newsfeedItemAnimatedBlock.blockId) && Intrinsics.a(this.text, newsfeedItemAnimatedBlock.text) && Intrinsics.a(this.animation, newsfeedItemAnimatedBlock.animation) && Intrinsics.a(this.trackCode, newsfeedItemAnimatedBlock.trackCode) && this.decoration == newsfeedItemAnimatedBlock.decoration && Intrinsics.a(this.subtitle, newsfeedItemAnimatedBlock.subtitle) && Intrinsics.a(this.button, newsfeedItemAnimatedBlock.button);
        }

        @Nullable
        public final NewsfeedItemAnimatedBlockAnimation getAnimation() {
            return this.animation;
        }

        @Nullable
        public final String getBlockId() {
            return this.blockId;
        }

        @Nullable
        public final BaseLinkButton getButton() {
            return this.button;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final Decoration getDecoration() {
            return this.decoration;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            String str = this.blockId;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation = this.animation;
            int iHashCode3 = (iHashCode2 + (newsfeedItemAnimatedBlockAnimation == null ? 0 : newsfeedItemAnimatedBlockAnimation.hashCode())) * 31;
            String str3 = this.trackCode;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Decoration decoration = this.decoration;
            int iHashCode5 = (iHashCode4 + (decoration == null ? 0 : decoration.hashCode())) * 31;
            String str4 = this.subtitle;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BaseLinkButton baseLinkButton = this.button;
            return iHashCode6 + (baseLinkButton != null ? baseLinkButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.blockId;
            String str2 = this.text;
            NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation = this.animation;
            String str3 = this.trackCode;
            Decoration decoration = this.decoration;
            String str4 = this.subtitle;
            BaseLinkButton baseLinkButton = this.button;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemAnimatedBlock(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            a.q(i, ", blockId=", str, ", text=", sb2);
            sb2.append(str2);
            sb2.append(", animation=");
            sb2.append(newsfeedItemAnimatedBlockAnimation);
            sb2.append(", trackCode=");
            sb2.append(str3);
            sb2.append(", decoration=");
            sb2.append(decoration);
            sb2.append(", subtitle=");
            sb2.append(str4);
            sb2.append(", button=");
            sb2.append(baseLinkButton);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemAnimatedBlock(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable NewsfeedItemAnimatedBlockAnimation newsfeedItemAnimatedBlockAnimation, @Nullable String str3, @Nullable Decoration decoration, @Nullable String str4, @Nullable BaseLinkButton baseLinkButton) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.blockId = str;
            this.text = str2;
            this.animation = newsfeedItemAnimatedBlockAnimation;
            this.trackCode = str3;
            this.decoration = decoration;
            this.subtitle = str4;
            this.button = baseLinkButton;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemAppsCarousel extends NewsfeedNewsfeedItem {

        @b("button")
        @NotNull
        private final DiscoverCarouselButton button;

        @b("date")
        private final int date;

        @b("items")
        @NotNull
        private final List<DiscoverCarouselItem> items;

        @b("objects")
        @Nullable
        private final List<AppsApp> objects;

        @b("objects_type")
        @Nullable
        private final DiscoverCarouselObjectsType objectsType;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("title")
        @NotNull
        private final String title;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemAppsCarousel(DiscoverCarouselButton discoverCarouselButton, List list, String str, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, List list2, DiscoverCarouselObjectsType discoverCarouselObjectsType, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(discoverCarouselButton, list, str, newsfeedNewsfeedItemType, userId, i, (i10 & 64) != 0 ? null : list2, (i10 & 128) != 0 ? null : discoverCarouselObjectsType, (i10 & 256) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemAppsCarousel copy$default(NewsfeedItemAppsCarousel newsfeedItemAppsCarousel, DiscoverCarouselButton discoverCarouselButton, List list, String str, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, List list2, DiscoverCarouselObjectsType discoverCarouselObjectsType, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                discoverCarouselButton = newsfeedItemAppsCarousel.button;
            }
            if ((i10 & 2) != 0) {
                list = newsfeedItemAppsCarousel.items;
            }
            if ((i10 & 4) != 0) {
                str = newsfeedItemAppsCarousel.title;
            }
            if ((i10 & 8) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemAppsCarousel.type;
            }
            if ((i10 & 16) != 0) {
                userId = newsfeedItemAppsCarousel.sourceId;
            }
            if ((i10 & 32) != 0) {
                i = newsfeedItemAppsCarousel.date;
            }
            if ((i10 & 64) != 0) {
                list2 = newsfeedItemAppsCarousel.objects;
            }
            if ((i10 & 128) != 0) {
                discoverCarouselObjectsType = newsfeedItemAppsCarousel.objectsType;
            }
            if ((i10 & 256) != 0) {
                str2 = newsfeedItemAppsCarousel.trackCode;
            }
            DiscoverCarouselObjectsType discoverCarouselObjectsType2 = discoverCarouselObjectsType;
            String str3 = str2;
            int i11 = i;
            List list3 = list2;
            UserId userId2 = userId;
            String str4 = str;
            return newsfeedItemAppsCarousel.copy(discoverCarouselButton, list, str4, newsfeedNewsfeedItemType, userId2, i11, list3, discoverCarouselObjectsType2, str3);
        }

        @NotNull
        public final DiscoverCarouselButton component1() {
            return this.button;
        }

        @NotNull
        public final List<DiscoverCarouselItem> component2() {
            return this.items;
        }

        @NotNull
        public final String component3() {
            return this.title;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component4() {
            return this.type;
        }

        @NotNull
        public final UserId component5() {
            return this.sourceId;
        }

        public final int component6() {
            return this.date;
        }

        @Nullable
        public final List<AppsApp> component7() {
            return this.objects;
        }

        @Nullable
        public final DiscoverCarouselObjectsType component8() {
            return this.objectsType;
        }

        @Nullable
        public final String component9() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedItemAppsCarousel copy(@NotNull DiscoverCarouselButton button, @NotNull List<DiscoverCarouselItem> items, @NotNull String title, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable List<AppsApp> list, @Nullable DiscoverCarouselObjectsType discoverCarouselObjectsType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemAppsCarousel(button, items, title, type, sourceId, i, list, discoverCarouselObjectsType, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAppsCarousel)) {
                return false;
            }
            NewsfeedItemAppsCarousel newsfeedItemAppsCarousel = (NewsfeedItemAppsCarousel) obj;
            return Intrinsics.a(this.button, newsfeedItemAppsCarousel.button) && Intrinsics.a(this.items, newsfeedItemAppsCarousel.items) && Intrinsics.a(this.title, newsfeedItemAppsCarousel.title) && this.type == newsfeedItemAppsCarousel.type && Intrinsics.a(this.sourceId, newsfeedItemAppsCarousel.sourceId) && this.date == newsfeedItemAppsCarousel.date && Intrinsics.a(this.objects, newsfeedItemAppsCarousel.objects) && this.objectsType == newsfeedItemAppsCarousel.objectsType && Intrinsics.a(this.trackCode, newsfeedItemAppsCarousel.trackCode);
        }

        @NotNull
        public final DiscoverCarouselButton getButton() {
            return this.button;
        }

        public final int getDate() {
            return this.date;
        }

        @NotNull
        public final List<DiscoverCarouselItem> getItems() {
            return this.items;
        }

        @Nullable
        public final List<AppsApp> getObjects() {
            return this.objects;
        }

        @Nullable
        public final DiscoverCarouselObjectsType getObjectsType() {
            return this.objectsType;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, (this.type.hashCode() + a.e(u.i(this.items, this.button.hashCode() * 31, 31), 31, this.title)) * 31, 31), 31);
            List<AppsApp> list = this.objects;
            int iHashCode = (iG + (list == null ? 0 : list.hashCode())) * 31;
            DiscoverCarouselObjectsType discoverCarouselObjectsType = this.objectsType;
            int iHashCode2 = (iHashCode + (discoverCarouselObjectsType == null ? 0 : discoverCarouselObjectsType.hashCode())) * 31;
            String str = this.trackCode;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            DiscoverCarouselButton discoverCarouselButton = this.button;
            List<DiscoverCarouselItem> list = this.items;
            String str = this.title;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            List<AppsApp> list2 = this.objects;
            DiscoverCarouselObjectsType discoverCarouselObjectsType = this.objectsType;
            String str2 = this.trackCode;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemAppsCarousel(button=");
            sb2.append(discoverCarouselButton);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", title=");
            sb2.append(str);
            sb2.append(", type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", objects=");
            sb2.append(list2);
            sb2.append(", objectsType=");
            sb2.append(discoverCarouselObjectsType);
            sb2.append(", trackCode=");
            return u.o(sb2, str2, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemAppsCarousel(@NotNull DiscoverCarouselButton button, @NotNull List<DiscoverCarouselItem> items, @NotNull String title, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable List<AppsApp> list, @Nullable DiscoverCarouselObjectsType discoverCarouselObjectsType, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.button = button;
            this.items = items;
            this.title = title;
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.objects = list;
            this.objectsType = discoverCarouselObjectsType;
            this.trackCode = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemAudio extends NewsfeedNewsfeedItem {

        @b("audio")
        @Nullable
        private final NewsfeedItemAudioAudio audio;

        @b("date")
        private final int date;

        @b("post_id")
        @Nullable
        private final Integer postId;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemAudio(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemAudioAudio newsfeedItemAudioAudio, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : newsfeedItemAudioAudio, (i10 & 16) != 0 ? null : num);
        }

        public static /* synthetic */ NewsfeedItemAudio copy$default(NewsfeedItemAudio newsfeedItemAudio, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemAudioAudio newsfeedItemAudioAudio, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemAudio.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemAudio.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemAudio.date;
            }
            if ((i10 & 8) != 0) {
                newsfeedItemAudioAudio = newsfeedItemAudio.audio;
            }
            if ((i10 & 16) != 0) {
                num = newsfeedItemAudio.postId;
            }
            Integer num2 = num;
            int i11 = i;
            return newsfeedItemAudio.copy(newsfeedNewsfeedItemType, userId, i11, newsfeedItemAudioAudio, num2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemAudioAudio component4() {
            return this.audio;
        }

        @Nullable
        public final Integer component5() {
            return this.postId;
        }

        @NotNull
        public final NewsfeedItemAudio copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemAudioAudio newsfeedItemAudioAudio, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemAudio(type, sourceId, i, newsfeedItemAudioAudio, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAudio)) {
                return false;
            }
            NewsfeedItemAudio newsfeedItemAudio = (NewsfeedItemAudio) obj;
            return this.type == newsfeedItemAudio.type && Intrinsics.a(this.sourceId, newsfeedItemAudio.sourceId) && this.date == newsfeedItemAudio.date && Intrinsics.a(this.audio, newsfeedItemAudio.audio) && Intrinsics.a(this.postId, newsfeedItemAudio.postId);
        }

        @Nullable
        public final NewsfeedItemAudioAudio getAudio() {
            return this.audio;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final Integer getPostId() {
            return this.postId;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            NewsfeedItemAudioAudio newsfeedItemAudioAudio = this.audio;
            int iHashCode = (iG + (newsfeedItemAudioAudio == null ? 0 : newsfeedItemAudioAudio.hashCode())) * 31;
            Integer num = this.postId;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemAudioAudio newsfeedItemAudioAudio = this.audio;
            Integer num = this.postId;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemAudio(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", audio=");
            sb2.append(newsfeedItemAudioAudio);
            sb2.append(", postId=");
            return u.m(sb2, num, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemAudio(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemAudioAudio newsfeedItemAudioAudio, @Nullable Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.audio = newsfeedItemAudioAudio;
            this.postId = num;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemClipsBlock extends NewsfeedNewsfeedItem {

        @b("button")
        @Nullable
        private final BaseLinkButton button;

        @b("date")
        private final int date;

        @b("items")
        @Nullable
        private final List<VideoVideo> items;

        @b("next_from")
        @Nullable
        private final String nextFrom;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("title")
        @Nullable
        private final String title;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemClipsBlock(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, List list, String str3, BaseLinkButton baseLinkButton, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : baseLinkButton);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemClipsBlock copy$default(NewsfeedItemClipsBlock newsfeedItemClipsBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, List list, String str3, BaseLinkButton baseLinkButton, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemClipsBlock.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemClipsBlock.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemClipsBlock.date;
            }
            if ((i10 & 8) != 0) {
                str = newsfeedItemClipsBlock.title;
            }
            if ((i10 & 16) != 0) {
                str2 = newsfeedItemClipsBlock.trackCode;
            }
            if ((i10 & 32) != 0) {
                list = newsfeedItemClipsBlock.items;
            }
            if ((i10 & 64) != 0) {
                str3 = newsfeedItemClipsBlock.nextFrom;
            }
            if ((i10 & 128) != 0) {
                baseLinkButton = newsfeedItemClipsBlock.button;
            }
            String str4 = str3;
            BaseLinkButton baseLinkButton2 = baseLinkButton;
            String str5 = str2;
            List list2 = list;
            return newsfeedItemClipsBlock.copy(newsfeedNewsfeedItemType, userId, i, str, str5, list2, str4, baseLinkButton2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final String component4() {
            return this.title;
        }

        @Nullable
        public final String component5() {
            return this.trackCode;
        }

        @Nullable
        public final List<VideoVideo> component6() {
            return this.items;
        }

        @Nullable
        public final String component7() {
            return this.nextFrom;
        }

        @Nullable
        public final BaseLinkButton component8() {
            return this.button;
        }

        @NotNull
        public final NewsfeedItemClipsBlock copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable List<VideoVideo> list, @Nullable String str3, @Nullable BaseLinkButton baseLinkButton) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemClipsBlock(type, sourceId, i, str, str2, list, str3, baseLinkButton);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemClipsBlock)) {
                return false;
            }
            NewsfeedItemClipsBlock newsfeedItemClipsBlock = (NewsfeedItemClipsBlock) obj;
            return this.type == newsfeedItemClipsBlock.type && Intrinsics.a(this.sourceId, newsfeedItemClipsBlock.sourceId) && this.date == newsfeedItemClipsBlock.date && Intrinsics.a(this.title, newsfeedItemClipsBlock.title) && Intrinsics.a(this.trackCode, newsfeedItemClipsBlock.trackCode) && Intrinsics.a(this.items, newsfeedItemClipsBlock.items) && Intrinsics.a(this.nextFrom, newsfeedItemClipsBlock.nextFrom) && Intrinsics.a(this.button, newsfeedItemClipsBlock.button);
        }

        @Nullable
        public final BaseLinkButton getButton() {
            return this.button;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final List<VideoVideo> getItems() {
            return this.items;
        }

        @Nullable
        public final String getNextFrom() {
            return this.nextFrom;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            String str = this.title;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<VideoVideo> list = this.items;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.nextFrom;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BaseLinkButton baseLinkButton = this.button;
            return iHashCode4 + (baseLinkButton != null ? baseLinkButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            String str2 = this.trackCode;
            List<VideoVideo> list = this.items;
            String str3 = this.nextFrom;
            BaseLinkButton baseLinkButton = this.button;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemClipsBlock(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            a.q(i, ", title=", str, ", trackCode=", sb2);
            sb2.append(str2);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", nextFrom=");
            sb2.append(str3);
            sb2.append(", button=");
            sb2.append(baseLinkButton);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemClipsBlock(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable List<VideoVideo> list, @Nullable String str3, @Nullable BaseLinkButton baseLinkButton) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.title = str;
            this.trackCode = str2;
            this.items = list;
            this.nextFrom = str3;
            this.button = baseLinkButton;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemDigest extends NewsfeedNewsfeedItem {

        @b("date")
        private final int date;

        @b("feed_id")
        @Nullable
        private final String feedId;

        @b("footer")
        @Nullable
        private final NewsfeedItemDigestFooter footer;

        @b("header")
        @Nullable
        private final NewsfeedItemDigestHeader header;

        @b("items")
        @Nullable
        private final List<NewsfeedItemDigestItem> items;

        @b("main_post_ids")
        @Nullable
        private final List<String> mainPostIds;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("template")
        @Nullable
        private final Template template;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Template {
            LIST("list"),
            GRID("grid"),
            SINGLE("single");


            @NotNull
            private final String value;

            Template(String str) {
                this.value = str;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ NewsfeedItemDigest(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, List list, List list2, Template template, NewsfeedItemDigestHeader newsfeedItemDigestHeader, NewsfeedItemDigestFooter newsfeedItemDigestFooter, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : list2, (i10 & 64) != 0 ? null : template, (i10 & 128) != 0 ? null : newsfeedItemDigestHeader, (i10 & 256) != 0 ? null : newsfeedItemDigestFooter, (i10 & 512) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemDigest copy$default(NewsfeedItemDigest newsfeedItemDigest, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, List list, List list2, Template template, NewsfeedItemDigestHeader newsfeedItemDigestHeader, NewsfeedItemDigestFooter newsfeedItemDigestFooter, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemDigest.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemDigest.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemDigest.date;
            }
            if ((i10 & 8) != 0) {
                str = newsfeedItemDigest.feedId;
            }
            if ((i10 & 16) != 0) {
                list = newsfeedItemDigest.items;
            }
            if ((i10 & 32) != 0) {
                list2 = newsfeedItemDigest.mainPostIds;
            }
            if ((i10 & 64) != 0) {
                template = newsfeedItemDigest.template;
            }
            if ((i10 & 128) != 0) {
                newsfeedItemDigestHeader = newsfeedItemDigest.header;
            }
            if ((i10 & 256) != 0) {
                newsfeedItemDigestFooter = newsfeedItemDigest.footer;
            }
            if ((i10 & 512) != 0) {
                str2 = newsfeedItemDigest.trackCode;
            }
            NewsfeedItemDigestFooter newsfeedItemDigestFooter2 = newsfeedItemDigestFooter;
            String str3 = str2;
            Template template2 = template;
            NewsfeedItemDigestHeader newsfeedItemDigestHeader2 = newsfeedItemDigestHeader;
            List list3 = list;
            List list4 = list2;
            return newsfeedItemDigest.copy(newsfeedNewsfeedItemType, userId, i, str, list3, list4, template2, newsfeedItemDigestHeader2, newsfeedItemDigestFooter2, str3);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @Nullable
        public final String component10() {
            return this.trackCode;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final String component4() {
            return this.feedId;
        }

        @Nullable
        public final List<NewsfeedItemDigestItem> component5() {
            return this.items;
        }

        @Nullable
        public final List<String> component6() {
            return this.mainPostIds;
        }

        @Nullable
        public final Template component7() {
            return this.template;
        }

        @Nullable
        public final NewsfeedItemDigestHeader component8() {
            return this.header;
        }

        @Nullable
        public final NewsfeedItemDigestFooter component9() {
            return this.footer;
        }

        @NotNull
        public final NewsfeedItemDigest copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable List<NewsfeedItemDigestItem> list, @Nullable List<String> list2, @Nullable Template template, @Nullable NewsfeedItemDigestHeader newsfeedItemDigestHeader, @Nullable NewsfeedItemDigestFooter newsfeedItemDigestFooter, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemDigest(type, sourceId, i, str, list, list2, template, newsfeedItemDigestHeader, newsfeedItemDigestFooter, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemDigest)) {
                return false;
            }
            NewsfeedItemDigest newsfeedItemDigest = (NewsfeedItemDigest) obj;
            return this.type == newsfeedItemDigest.type && Intrinsics.a(this.sourceId, newsfeedItemDigest.sourceId) && this.date == newsfeedItemDigest.date && Intrinsics.a(this.feedId, newsfeedItemDigest.feedId) && Intrinsics.a(this.items, newsfeedItemDigest.items) && Intrinsics.a(this.mainPostIds, newsfeedItemDigest.mainPostIds) && this.template == newsfeedItemDigest.template && Intrinsics.a(this.header, newsfeedItemDigest.header) && Intrinsics.a(this.footer, newsfeedItemDigest.footer) && Intrinsics.a(this.trackCode, newsfeedItemDigest.trackCode);
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final String getFeedId() {
            return this.feedId;
        }

        @Nullable
        public final NewsfeedItemDigestFooter getFooter() {
            return this.footer;
        }

        @Nullable
        public final NewsfeedItemDigestHeader getHeader() {
            return this.header;
        }

        @Nullable
        public final List<NewsfeedItemDigestItem> getItems() {
            return this.items;
        }

        @Nullable
        public final List<String> getMainPostIds() {
            return this.mainPostIds;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final Template getTemplate() {
            return this.template;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            String str = this.feedId;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            List<NewsfeedItemDigestItem> list = this.items;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.mainPostIds;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Template template = this.template;
            int iHashCode4 = (iHashCode3 + (template == null ? 0 : template.hashCode())) * 31;
            NewsfeedItemDigestHeader newsfeedItemDigestHeader = this.header;
            int iHashCode5 = (iHashCode4 + (newsfeedItemDigestHeader == null ? 0 : newsfeedItemDigestHeader.hashCode())) * 31;
            NewsfeedItemDigestFooter newsfeedItemDigestFooter = this.footer;
            int iHashCode6 = (iHashCode5 + (newsfeedItemDigestFooter == null ? 0 : newsfeedItemDigestFooter.hashCode())) * 31;
            String str2 = this.trackCode;
            return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.feedId;
            List<NewsfeedItemDigestItem> list = this.items;
            List<String> list2 = this.mainPostIds;
            Template template = this.template;
            NewsfeedItemDigestHeader newsfeedItemDigestHeader = this.header;
            NewsfeedItemDigestFooter newsfeedItemDigestFooter = this.footer;
            String str2 = this.trackCode;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemDigest(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            a.q(i, ", feedId=", str, ", items=", sb2);
            a.u(sb2, list, ", mainPostIds=", list2, ", template=");
            sb2.append(template);
            sb2.append(", header=");
            sb2.append(newsfeedItemDigestHeader);
            sb2.append(", footer=");
            sb2.append(newsfeedItemDigestFooter);
            sb2.append(", trackCode=");
            sb2.append(str2);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemDigest(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable List<NewsfeedItemDigestItem> list, @Nullable List<String> list2, @Nullable Template template, @Nullable NewsfeedItemDigestHeader newsfeedItemDigestHeader, @Nullable NewsfeedItemDigestFooter newsfeedItemDigestFooter, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.feedId = str;
            this.items = list;
            this.mainPostIds = list2;
            this.template = template;
            this.header = newsfeedItemDigestHeader;
            this.footer = newsfeedItemDigestFooter;
            this.trackCode = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemExpertCardWidget extends NewsfeedNewsfeedItem {

        @b("expert_card")
        @Nullable
        private final NewsfeedExpertCardWidget expertCard;

        @b("type")
        @Nullable
        private final Type type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Type {
            EXPERT_CARD("expert_card");


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

        public NewsfeedItemExpertCardWidget() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NewsfeedItemExpertCardWidget copy$default(NewsfeedItemExpertCardWidget newsfeedItemExpertCardWidget, Type type, NewsfeedExpertCardWidget newsfeedExpertCardWidget, int i, Object obj) {
            if ((i & 1) != 0) {
                type = newsfeedItemExpertCardWidget.type;
            }
            if ((i & 2) != 0) {
                newsfeedExpertCardWidget = newsfeedItemExpertCardWidget.expertCard;
            }
            return newsfeedItemExpertCardWidget.copy(type, newsfeedExpertCardWidget);
        }

        @Nullable
        public final Type component1() {
            return this.type;
        }

        @Nullable
        public final NewsfeedExpertCardWidget component2() {
            return this.expertCard;
        }

        @NotNull
        public final NewsfeedItemExpertCardWidget copy(@Nullable Type type, @Nullable NewsfeedExpertCardWidget newsfeedExpertCardWidget) {
            return new NewsfeedItemExpertCardWidget(type, newsfeedExpertCardWidget);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemExpertCardWidget)) {
                return false;
            }
            NewsfeedItemExpertCardWidget newsfeedItemExpertCardWidget = (NewsfeedItemExpertCardWidget) obj;
            return this.type == newsfeedItemExpertCardWidget.type && Intrinsics.a(this.expertCard, newsfeedItemExpertCardWidget.expertCard);
        }

        @Nullable
        public final NewsfeedExpertCardWidget getExpertCard() {
            return this.expertCard;
        }

        @Nullable
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            Type type = this.type;
            int iHashCode = (type == null ? 0 : type.hashCode()) * 31;
            NewsfeedExpertCardWidget newsfeedExpertCardWidget = this.expertCard;
            return iHashCode + (newsfeedExpertCardWidget != null ? newsfeedExpertCardWidget.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NewsfeedItemExpertCardWidget(type=" + this.type + ", expertCard=" + this.expertCard + ")";
        }

        public /* synthetic */ NewsfeedItemExpertCardWidget(Type type, NewsfeedExpertCardWidget newsfeedExpertCardWidget, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : newsfeedExpertCardWidget);
        }

        public NewsfeedItemExpertCardWidget(@Nullable Type type, @Nullable NewsfeedExpertCardWidget newsfeedExpertCardWidget) {
            super(null);
            this.type = type;
            this.expertCard = newsfeedExpertCardWidget;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemFeedbackPoll extends NewsfeedNewsfeedItem {

        @b("banner")
        @NotNull
        private final NewsfeedItemFeedbackPollBanner banner;

        @b("date")
        private final int date;

        @b("poll")
        @NotNull
        private final NewsfeedItemFeedbackPollPoll poll;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemFeedbackPoll(NewsfeedItemFeedbackPollBanner newsfeedItemFeedbackPollBanner, NewsfeedItemFeedbackPollPoll newsfeedItemFeedbackPollPoll, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedItemFeedbackPollBanner, newsfeedItemFeedbackPollPoll, newsfeedNewsfeedItemType, userId, i, (i10 & 32) != 0 ? null : str);
        }

        public static /* synthetic */ NewsfeedItemFeedbackPoll copy$default(NewsfeedItemFeedbackPoll newsfeedItemFeedbackPoll, NewsfeedItemFeedbackPollBanner newsfeedItemFeedbackPollBanner, NewsfeedItemFeedbackPollPoll newsfeedItemFeedbackPollPoll, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedItemFeedbackPollBanner = newsfeedItemFeedbackPoll.banner;
            }
            if ((i10 & 2) != 0) {
                newsfeedItemFeedbackPollPoll = newsfeedItemFeedbackPoll.poll;
            }
            if ((i10 & 4) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemFeedbackPoll.type;
            }
            if ((i10 & 8) != 0) {
                userId = newsfeedItemFeedbackPoll.sourceId;
            }
            if ((i10 & 16) != 0) {
                i = newsfeedItemFeedbackPoll.date;
            }
            if ((i10 & 32) != 0) {
                str = newsfeedItemFeedbackPoll.trackCode;
            }
            int i11 = i;
            String str2 = str;
            return newsfeedItemFeedbackPoll.copy(newsfeedItemFeedbackPollBanner, newsfeedItemFeedbackPollPoll, newsfeedNewsfeedItemType, userId, i11, str2);
        }

        @NotNull
        public final NewsfeedItemFeedbackPollBanner component1() {
            return this.banner;
        }

        @NotNull
        public final NewsfeedItemFeedbackPollPoll component2() {
            return this.poll;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component3() {
            return this.type;
        }

        @NotNull
        public final UserId component4() {
            return this.sourceId;
        }

        public final int component5() {
            return this.date;
        }

        @Nullable
        public final String component6() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedItemFeedbackPoll copy(@NotNull NewsfeedItemFeedbackPollBanner banner, @NotNull NewsfeedItemFeedbackPollPoll poll, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            Intrinsics.checkNotNullParameter(poll, "poll");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemFeedbackPoll(banner, poll, type, sourceId, i, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFeedbackPoll)) {
                return false;
            }
            NewsfeedItemFeedbackPoll newsfeedItemFeedbackPoll = (NewsfeedItemFeedbackPoll) obj;
            return Intrinsics.a(this.banner, newsfeedItemFeedbackPoll.banner) && Intrinsics.a(this.poll, newsfeedItemFeedbackPoll.poll) && this.type == newsfeedItemFeedbackPoll.type && Intrinsics.a(this.sourceId, newsfeedItemFeedbackPoll.sourceId) && this.date == newsfeedItemFeedbackPoll.date && Intrinsics.a(this.trackCode, newsfeedItemFeedbackPoll.trackCode);
        }

        @NotNull
        public final NewsfeedItemFeedbackPollBanner getBanner() {
            return this.banner;
        }

        public final int getDate() {
            return this.date;
        }

        @NotNull
        public final NewsfeedItemFeedbackPollPoll getPoll() {
            return this.poll;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, (this.type.hashCode() + ((this.poll.hashCode() + (this.banner.hashCode() * 31)) * 31)) * 31, 31), 31);
            String str = this.trackCode;
            return iG + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "NewsfeedItemFeedbackPoll(banner=" + this.banner + ", poll=" + this.poll + ", type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", trackCode=" + this.trackCode + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemFeedbackPoll(@NotNull NewsfeedItemFeedbackPollBanner banner, @NotNull NewsfeedItemFeedbackPollPoll poll, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(banner, "banner");
            Intrinsics.checkNotNullParameter(poll, "poll");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.banner = banner;
            this.poll = poll;
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.trackCode = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemFriend extends NewsfeedNewsfeedItem {

        @b("date")
        private final int date;

        @b("friends")
        @Nullable
        private final NewsfeedItemFriendFriends friends;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemFriend(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemFriendFriends newsfeedItemFriendFriends, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : newsfeedItemFriendFriends);
        }

        public static /* synthetic */ NewsfeedItemFriend copy$default(NewsfeedItemFriend newsfeedItemFriend, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemFriendFriends newsfeedItemFriendFriends, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemFriend.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemFriend.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemFriend.date;
            }
            if ((i10 & 8) != 0) {
                newsfeedItemFriendFriends = newsfeedItemFriend.friends;
            }
            return newsfeedItemFriend.copy(newsfeedNewsfeedItemType, userId, i, newsfeedItemFriendFriends);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemFriendFriends component4() {
            return this.friends;
        }

        @NotNull
        public final NewsfeedItemFriend copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemFriendFriends newsfeedItemFriendFriends) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemFriend(type, sourceId, i, newsfeedItemFriendFriends);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriend)) {
                return false;
            }
            NewsfeedItemFriend newsfeedItemFriend = (NewsfeedItemFriend) obj;
            return this.type == newsfeedItemFriend.type && Intrinsics.a(this.sourceId, newsfeedItemFriend.sourceId) && this.date == newsfeedItemFriend.date && Intrinsics.a(this.friends, newsfeedItemFriend.friends);
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemFriendFriends getFriends() {
            return this.friends;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            NewsfeedItemFriendFriends newsfeedItemFriendFriends = this.friends;
            return iG + (newsfeedItemFriendFriends == null ? 0 : newsfeedItemFriendFriends.hashCode());
        }

        @NotNull
        public String toString() {
            return "NewsfeedItemFriend(type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", friends=" + this.friends + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemFriend(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemFriendFriends newsfeedItemFriendFriends) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.friends = newsfeedItemFriendFriends;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemPhoto extends NewsfeedNewsfeedItem {

        @b("carousel_offset")
        @Nullable
        private final Integer carouselOffset;

        @b("date")
        private final int date;

        @b("photos")
        @Nullable
        private final NewsfeedItemPhotoPhotos photos;

        @b("post_id")
        @Nullable
        private final Integer postId;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemPhoto(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemPhotoPhotos newsfeedItemPhotoPhotos, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : newsfeedItemPhotoPhotos, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2);
        }

        public static /* synthetic */ NewsfeedItemPhoto copy$default(NewsfeedItemPhoto newsfeedItemPhoto, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemPhotoPhotos newsfeedItemPhotoPhotos, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemPhoto.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemPhoto.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemPhoto.date;
            }
            if ((i10 & 8) != 0) {
                newsfeedItemPhotoPhotos = newsfeedItemPhoto.photos;
            }
            if ((i10 & 16) != 0) {
                num = newsfeedItemPhoto.postId;
            }
            if ((i10 & 32) != 0) {
                num2 = newsfeedItemPhoto.carouselOffset;
            }
            Integer num3 = num;
            Integer num4 = num2;
            return newsfeedItemPhoto.copy(newsfeedNewsfeedItemType, userId, i, newsfeedItemPhotoPhotos, num3, num4);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemPhotoPhotos component4() {
            return this.photos;
        }

        @Nullable
        public final Integer component5() {
            return this.postId;
        }

        @Nullable
        public final Integer component6() {
            return this.carouselOffset;
        }

        @NotNull
        public final NewsfeedItemPhoto copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemPhotoPhotos newsfeedItemPhotoPhotos, @Nullable Integer num, @Nullable Integer num2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemPhoto(type, sourceId, i, newsfeedItemPhotoPhotos, num, num2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPhoto)) {
                return false;
            }
            NewsfeedItemPhoto newsfeedItemPhoto = (NewsfeedItemPhoto) obj;
            return this.type == newsfeedItemPhoto.type && Intrinsics.a(this.sourceId, newsfeedItemPhoto.sourceId) && this.date == newsfeedItemPhoto.date && Intrinsics.a(this.photos, newsfeedItemPhoto.photos) && Intrinsics.a(this.postId, newsfeedItemPhoto.postId) && Intrinsics.a(this.carouselOffset, newsfeedItemPhoto.carouselOffset);
        }

        @Nullable
        public final Integer getCarouselOffset() {
            return this.carouselOffset;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemPhotoPhotos getPhotos() {
            return this.photos;
        }

        @Nullable
        public final Integer getPostId() {
            return this.postId;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            NewsfeedItemPhotoPhotos newsfeedItemPhotoPhotos = this.photos;
            int iHashCode = (iG + (newsfeedItemPhotoPhotos == null ? 0 : newsfeedItemPhotoPhotos.hashCode())) * 31;
            Integer num = this.postId;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NewsfeedItemPhoto(type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", photos=" + this.photos + ", postId=" + this.postId + ", carouselOffset=" + this.carouselOffset + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemPhoto(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemPhotoPhotos newsfeedItemPhotoPhotos, @Nullable Integer num, @Nullable Integer num2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.photos = newsfeedItemPhotoPhotos;
            this.postId = num;
            this.carouselOffset = num2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemPhotoTag extends NewsfeedNewsfeedItem {

        @b("carousel_offset")
        @Nullable
        private final Integer carouselOffset;

        @b("date")
        private final int date;

        @b("photo_tags")
        @Nullable
        private final NewsfeedItemPhotoTagPhotoTags photoTags;

        @b("post_id")
        @Nullable
        private final Integer postId;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemPhotoTag(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemPhotoTagPhotoTags newsfeedItemPhotoTagPhotoTags, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : newsfeedItemPhotoTagPhotoTags, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2);
        }

        public static /* synthetic */ NewsfeedItemPhotoTag copy$default(NewsfeedItemPhotoTag newsfeedItemPhotoTag, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemPhotoTagPhotoTags newsfeedItemPhotoTagPhotoTags, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemPhotoTag.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemPhotoTag.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemPhotoTag.date;
            }
            if ((i10 & 8) != 0) {
                newsfeedItemPhotoTagPhotoTags = newsfeedItemPhotoTag.photoTags;
            }
            if ((i10 & 16) != 0) {
                num = newsfeedItemPhotoTag.postId;
            }
            if ((i10 & 32) != 0) {
                num2 = newsfeedItemPhotoTag.carouselOffset;
            }
            Integer num3 = num;
            Integer num4 = num2;
            return newsfeedItemPhotoTag.copy(newsfeedNewsfeedItemType, userId, i, newsfeedItemPhotoTagPhotoTags, num3, num4);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemPhotoTagPhotoTags component4() {
            return this.photoTags;
        }

        @Nullable
        public final Integer component5() {
            return this.postId;
        }

        @Nullable
        public final Integer component6() {
            return this.carouselOffset;
        }

        @NotNull
        public final NewsfeedItemPhotoTag copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemPhotoTagPhotoTags newsfeedItemPhotoTagPhotoTags, @Nullable Integer num, @Nullable Integer num2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemPhotoTag(type, sourceId, i, newsfeedItemPhotoTagPhotoTags, num, num2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPhotoTag)) {
                return false;
            }
            NewsfeedItemPhotoTag newsfeedItemPhotoTag = (NewsfeedItemPhotoTag) obj;
            return this.type == newsfeedItemPhotoTag.type && Intrinsics.a(this.sourceId, newsfeedItemPhotoTag.sourceId) && this.date == newsfeedItemPhotoTag.date && Intrinsics.a(this.photoTags, newsfeedItemPhotoTag.photoTags) && Intrinsics.a(this.postId, newsfeedItemPhotoTag.postId) && Intrinsics.a(this.carouselOffset, newsfeedItemPhotoTag.carouselOffset);
        }

        @Nullable
        public final Integer getCarouselOffset() {
            return this.carouselOffset;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemPhotoTagPhotoTags getPhotoTags() {
            return this.photoTags;
        }

        @Nullable
        public final Integer getPostId() {
            return this.postId;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            NewsfeedItemPhotoTagPhotoTags newsfeedItemPhotoTagPhotoTags = this.photoTags;
            int iHashCode = (iG + (newsfeedItemPhotoTagPhotoTags == null ? 0 : newsfeedItemPhotoTagPhotoTags.hashCode())) * 31;
            Integer num = this.postId;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NewsfeedItemPhotoTag(type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", photoTags=" + this.photoTags + ", postId=" + this.postId + ", carouselOffset=" + this.carouselOffset + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemPhotoTag(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemPhotoTagPhotoTags newsfeedItemPhotoTagPhotoTags, @Nullable Integer num, @Nullable Integer num2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.photoTags = newsfeedItemPhotoTagPhotoTags;
            this.postId = num;
            this.carouselOffset = num2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemPromoButton extends NewsfeedNewsfeedItem {

        @b("action")
        @Nullable
        private final NewsfeedItemPromoButtonAction action;

        @b("date")
        private final int date;

        @b(DebugMeta.JsonKeys.IMAGES)
        @Nullable
        private final List<NewsfeedItemPromoButtonImage> images;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("text")
        @Nullable
        private final String text;

        @b("title")
        @Nullable
        private final String title;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemPromoButton(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction, List list, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : newsfeedItemPromoButtonAction, (i10 & 64) != 0 ? null : list, (i10 & 128) != 0 ? null : str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemPromoButton copy$default(NewsfeedItemPromoButton newsfeedItemPromoButton, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction, List list, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemPromoButton.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemPromoButton.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemPromoButton.date;
            }
            if ((i10 & 8) != 0) {
                str = newsfeedItemPromoButton.text;
            }
            if ((i10 & 16) != 0) {
                str2 = newsfeedItemPromoButton.title;
            }
            if ((i10 & 32) != 0) {
                newsfeedItemPromoButtonAction = newsfeedItemPromoButton.action;
            }
            if ((i10 & 64) != 0) {
                list = newsfeedItemPromoButton.images;
            }
            if ((i10 & 128) != 0) {
                str3 = newsfeedItemPromoButton.trackCode;
            }
            List list2 = list;
            String str4 = str3;
            String str5 = str2;
            NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction2 = newsfeedItemPromoButtonAction;
            return newsfeedItemPromoButton.copy(newsfeedNewsfeedItemType, userId, i, str, str5, newsfeedItemPromoButtonAction2, list2, str4);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final String component4() {
            return this.text;
        }

        @Nullable
        public final String component5() {
            return this.title;
        }

        @Nullable
        public final NewsfeedItemPromoButtonAction component6() {
            return this.action;
        }

        @Nullable
        public final List<NewsfeedItemPromoButtonImage> component7() {
            return this.images;
        }

        @Nullable
        public final String component8() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedItemPromoButton copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction, @Nullable List<NewsfeedItemPromoButtonImage> list, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemPromoButton(type, sourceId, i, str, str2, newsfeedItemPromoButtonAction, list, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPromoButton)) {
                return false;
            }
            NewsfeedItemPromoButton newsfeedItemPromoButton = (NewsfeedItemPromoButton) obj;
            return this.type == newsfeedItemPromoButton.type && Intrinsics.a(this.sourceId, newsfeedItemPromoButton.sourceId) && this.date == newsfeedItemPromoButton.date && Intrinsics.a(this.text, newsfeedItemPromoButton.text) && Intrinsics.a(this.title, newsfeedItemPromoButton.title) && Intrinsics.a(this.action, newsfeedItemPromoButton.action) && Intrinsics.a(this.images, newsfeedItemPromoButton.images) && Intrinsics.a(this.trackCode, newsfeedItemPromoButton.trackCode);
        }

        @Nullable
        public final NewsfeedItemPromoButtonAction getAction() {
            return this.action;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final List<NewsfeedItemPromoButtonImage> getImages() {
            return this.images;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            String str = this.text;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction = this.action;
            int iHashCode3 = (iHashCode2 + (newsfeedItemPromoButtonAction == null ? 0 : newsfeedItemPromoButtonAction.hashCode())) * 31;
            List<NewsfeedItemPromoButtonImage> list = this.images;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.trackCode;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.text;
            String str2 = this.title;
            NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction = this.action;
            List<NewsfeedItemPromoButtonImage> list = this.images;
            String str3 = this.trackCode;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemPromoButton(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            a.q(i, ", text=", str, ", title=", sb2);
            sb2.append(str2);
            sb2.append(", action=");
            sb2.append(newsfeedItemPromoButtonAction);
            sb2.append(", images=");
            sb2.append(list);
            sb2.append(", trackCode=");
            sb2.append(str3);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemPromoButton(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable NewsfeedItemPromoButtonAction newsfeedItemPromoButtonAction, @Nullable List<NewsfeedItemPromoButtonImage> list, @Nullable String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.text = str;
            this.title = str2;
            this.action = newsfeedItemPromoButtonAction;
            this.images = list;
            this.trackCode = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemRecognizeBlock extends NewsfeedNewsfeedItem {

        @b("date")
        private final int date;

        @b("end_card")
        @Nullable
        private final PhotosTagsSuggestionItemEndCard endCard;

        @b("items")
        @Nullable
        private final List<PhotosTagsSuggestionItem> items;

        @b("recognition_article_link")
        @Nullable
        private final String recognitionArticleLink;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemRecognizeBlock(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard, String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : photosTagsSuggestionItemEndCard, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemRecognizeBlock copy$default(NewsfeedItemRecognizeBlock newsfeedItemRecognizeBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemRecognizeBlock.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemRecognizeBlock.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemRecognizeBlock.date;
            }
            if ((i10 & 8) != 0) {
                photosTagsSuggestionItemEndCard = newsfeedItemRecognizeBlock.endCard;
            }
            if ((i10 & 16) != 0) {
                str = newsfeedItemRecognizeBlock.recognitionArticleLink;
            }
            if ((i10 & 32) != 0) {
                str2 = newsfeedItemRecognizeBlock.trackCode;
            }
            if ((i10 & 64) != 0) {
                list = newsfeedItemRecognizeBlock.items;
            }
            String str3 = str2;
            List list2 = list;
            String str4 = str;
            int i11 = i;
            return newsfeedItemRecognizeBlock.copy(newsfeedNewsfeedItemType, userId, i11, photosTagsSuggestionItemEndCard, str4, str3, list2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final PhotosTagsSuggestionItemEndCard component4() {
            return this.endCard;
        }

        @Nullable
        public final String component5() {
            return this.recognitionArticleLink;
        }

        @Nullable
        public final String component6() {
            return this.trackCode;
        }

        @Nullable
        public final List<PhotosTagsSuggestionItem> component7() {
            return this.items;
        }

        @NotNull
        public final NewsfeedItemRecognizeBlock copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard, @Nullable String str, @Nullable String str2, @Nullable List<PhotosTagsSuggestionItem> list) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemRecognizeBlock(type, sourceId, i, photosTagsSuggestionItemEndCard, str, str2, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecognizeBlock)) {
                return false;
            }
            NewsfeedItemRecognizeBlock newsfeedItemRecognizeBlock = (NewsfeedItemRecognizeBlock) obj;
            return this.type == newsfeedItemRecognizeBlock.type && Intrinsics.a(this.sourceId, newsfeedItemRecognizeBlock.sourceId) && this.date == newsfeedItemRecognizeBlock.date && Intrinsics.a(this.endCard, newsfeedItemRecognizeBlock.endCard) && Intrinsics.a(this.recognitionArticleLink, newsfeedItemRecognizeBlock.recognitionArticleLink) && Intrinsics.a(this.trackCode, newsfeedItemRecognizeBlock.trackCode) && Intrinsics.a(this.items, newsfeedItemRecognizeBlock.items);
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final PhotosTagsSuggestionItemEndCard getEndCard() {
            return this.endCard;
        }

        @Nullable
        public final List<PhotosTagsSuggestionItem> getItems() {
            return this.items;
        }

        @Nullable
        public final String getRecognitionArticleLink() {
            return this.recognitionArticleLink;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard = this.endCard;
            int iHashCode = (iG + (photosTagsSuggestionItemEndCard == null ? 0 : photosTagsSuggestionItemEndCard.hashCode())) * 31;
            String str = this.recognitionArticleLink;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<PhotosTagsSuggestionItem> list = this.items;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard = this.endCard;
            String str = this.recognitionArticleLink;
            String str2 = this.trackCode;
            List<PhotosTagsSuggestionItem> list = this.items;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemRecognizeBlock(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", endCard=");
            sb2.append(photosTagsSuggestionItemEndCard);
            sb2.append(", recognitionArticleLink=");
            l7.o.t(sb2, str, ", trackCode=", str2, ", items=");
            return z.h(sb2, list, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemRecognizeBlock(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard, @Nullable String str, @Nullable String str2, @Nullable List<PhotosTagsSuggestionItem> list) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.endCard = photosTagsSuggestionItemEndCard;
            this.recognitionArticleLink = str;
            this.trackCode = str2;
            this.items = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemRecommendedAppBlock extends NewsfeedNewsfeedItem {

        @b(App.TYPE)
        @NotNull
        private final AppsApp app;

        @b("app_cover")
        @Nullable
        private final List<BaseImage> appCover;

        @b("button_text")
        @NotNull
        private final String buttonText;

        @b("date")
        private final int date;

        @b("friends_avatars")
        @Nullable
        private final List<List<BaseImage>> friendsAvatars;

        @b("friends_playing_text")
        @Nullable
        private final String friendsPlayingText;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("title")
        @NotNull
        private final String title;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemRecommendedAppBlock(AppsApp appsApp, String str, String str2, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str3, String str4, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(appsApp, str, str2, newsfeedNewsfeedItemType, userId, i, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemRecommendedAppBlock copy$default(NewsfeedItemRecommendedAppBlock newsfeedItemRecommendedAppBlock, AppsApp appsApp, String str, String str2, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str3, String str4, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                appsApp = newsfeedItemRecommendedAppBlock.app;
            }
            if ((i10 & 2) != 0) {
                str = newsfeedItemRecommendedAppBlock.title;
            }
            if ((i10 & 4) != 0) {
                str2 = newsfeedItemRecommendedAppBlock.buttonText;
            }
            if ((i10 & 8) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemRecommendedAppBlock.type;
            }
            if ((i10 & 16) != 0) {
                userId = newsfeedItemRecommendedAppBlock.sourceId;
            }
            if ((i10 & 32) != 0) {
                i = newsfeedItemRecommendedAppBlock.date;
            }
            if ((i10 & 64) != 0) {
                str3 = newsfeedItemRecommendedAppBlock.trackCode;
            }
            if ((i10 & 128) != 0) {
                str4 = newsfeedItemRecommendedAppBlock.friendsPlayingText;
            }
            if ((i10 & 256) != 0) {
                list = newsfeedItemRecommendedAppBlock.friendsAvatars;
            }
            if ((i10 & 512) != 0) {
                list2 = newsfeedItemRecommendedAppBlock.appCover;
            }
            List list3 = list;
            List list4 = list2;
            String str5 = str3;
            String str6 = str4;
            UserId userId2 = userId;
            int i11 = i;
            return newsfeedItemRecommendedAppBlock.copy(appsApp, str, str2, newsfeedNewsfeedItemType, userId2, i11, str5, str6, list3, list4);
        }

        @NotNull
        public final AppsApp component1() {
            return this.app;
        }

        @Nullable
        public final List<BaseImage> component10() {
            return this.appCover;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final String component3() {
            return this.buttonText;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component4() {
            return this.type;
        }

        @NotNull
        public final UserId component5() {
            return this.sourceId;
        }

        public final int component6() {
            return this.date;
        }

        @Nullable
        public final String component7() {
            return this.trackCode;
        }

        @Nullable
        public final String component8() {
            return this.friendsPlayingText;
        }

        @Nullable
        public final List<List<BaseImage>> component9() {
            return this.friendsAvatars;
        }

        @NotNull
        public final NewsfeedItemRecommendedAppBlock copy(@NotNull AppsApp app, @NotNull String title, @NotNull String buttonText, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable List<? extends List<BaseImage>> list, @Nullable List<BaseImage> list2) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemRecommendedAppBlock(app, title, buttonText, type, sourceId, i, str, str2, list, list2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedAppBlock)) {
                return false;
            }
            NewsfeedItemRecommendedAppBlock newsfeedItemRecommendedAppBlock = (NewsfeedItemRecommendedAppBlock) obj;
            return Intrinsics.a(this.app, newsfeedItemRecommendedAppBlock.app) && Intrinsics.a(this.title, newsfeedItemRecommendedAppBlock.title) && Intrinsics.a(this.buttonText, newsfeedItemRecommendedAppBlock.buttonText) && this.type == newsfeedItemRecommendedAppBlock.type && Intrinsics.a(this.sourceId, newsfeedItemRecommendedAppBlock.sourceId) && this.date == newsfeedItemRecommendedAppBlock.date && Intrinsics.a(this.trackCode, newsfeedItemRecommendedAppBlock.trackCode) && Intrinsics.a(this.friendsPlayingText, newsfeedItemRecommendedAppBlock.friendsPlayingText) && Intrinsics.a(this.friendsAvatars, newsfeedItemRecommendedAppBlock.friendsAvatars) && Intrinsics.a(this.appCover, newsfeedItemRecommendedAppBlock.appCover);
        }

        @NotNull
        public final AppsApp getApp() {
            return this.app;
        }

        @Nullable
        public final List<BaseImage> getAppCover() {
            return this.appCover;
        }

        @NotNull
        public final String getButtonText() {
            return this.buttonText;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final List<List<BaseImage>> getFriendsAvatars() {
            return this.friendsAvatars;
        }

        @Nullable
        public final String getFriendsPlayingText() {
            return this.friendsPlayingText;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, (this.type.hashCode() + a.e(a.e(this.app.hashCode() * 31, 31, this.title), 31, this.buttonText)) * 31, 31), 31);
            String str = this.trackCode;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.friendsPlayingText;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<List<BaseImage>> list = this.friendsAvatars;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<BaseImage> list2 = this.appCover;
            return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AppsApp appsApp = this.app;
            String str = this.title;
            String str2 = this.buttonText;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str3 = this.trackCode;
            String str4 = this.friendsPlayingText;
            List<List<BaseImage>> list = this.friendsAvatars;
            List<BaseImage> list2 = this.appCover;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemRecommendedAppBlock(app=");
            sb2.append(appsApp);
            sb2.append(", title=");
            sb2.append(str);
            sb2.append(", buttonText=");
            sb2.append(str2);
            sb2.append(", type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", trackCode=");
            l7.o.t(sb2, str3, ", friendsPlayingText=", str4, ", friendsAvatars=");
            return a.l(sb2, list, ", appCover=", list2, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemRecommendedAppBlock(@NotNull AppsApp app, @NotNull String title, @NotNull String buttonText, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable List<? extends List<BaseImage>> list, @Nullable List<BaseImage> list2) {
            super(null);
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.app = app;
            this.title = title;
            this.buttonText = buttonText;
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.trackCode = str;
            this.friendsPlayingText = str2;
            this.friendsAvatars = list;
            this.appCover = list2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemRecommendedChatsBlock extends NewsfeedNewsfeedItem {

        @b("button")
        @NotNull
        private final BaseLinkButton button;

        @b("count")
        private final int count;

        @b("date")
        private final int date;

        @b("items")
        @NotNull
        private final List<MessagesChatSuggestion> items;

        @b("next_from")
        @Nullable
        private final String nextFrom;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("track_code")
        @NotNull
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemRecommendedChatsBlock(List list, int i, String str, BaseLinkButton baseLinkButton, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, str, baseLinkButton, newsfeedNewsfeedItemType, userId, i10, (i11 & 128) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemRecommendedChatsBlock copy$default(NewsfeedItemRecommendedChatsBlock newsfeedItemRecommendedChatsBlock, List list, int i, String str, BaseLinkButton baseLinkButton, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = newsfeedItemRecommendedChatsBlock.items;
            }
            if ((i11 & 2) != 0) {
                i = newsfeedItemRecommendedChatsBlock.count;
            }
            if ((i11 & 4) != 0) {
                str = newsfeedItemRecommendedChatsBlock.trackCode;
            }
            if ((i11 & 8) != 0) {
                baseLinkButton = newsfeedItemRecommendedChatsBlock.button;
            }
            if ((i11 & 16) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemRecommendedChatsBlock.type;
            }
            if ((i11 & 32) != 0) {
                userId = newsfeedItemRecommendedChatsBlock.sourceId;
            }
            if ((i11 & 64) != 0) {
                i10 = newsfeedItemRecommendedChatsBlock.date;
            }
            if ((i11 & 128) != 0) {
                str2 = newsfeedItemRecommendedChatsBlock.nextFrom;
            }
            int i12 = i10;
            String str3 = str2;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType2 = newsfeedNewsfeedItemType;
            UserId userId2 = userId;
            return newsfeedItemRecommendedChatsBlock.copy(list, i, str, baseLinkButton, newsfeedNewsfeedItemType2, userId2, i12, str3);
        }

        @NotNull
        public final List<MessagesChatSuggestion> component1() {
            return this.items;
        }

        public final int component2() {
            return this.count;
        }

        @NotNull
        public final String component3() {
            return this.trackCode;
        }

        @NotNull
        public final BaseLinkButton component4() {
            return this.button;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component5() {
            return this.type;
        }

        @NotNull
        public final UserId component6() {
            return this.sourceId;
        }

        public final int component7() {
            return this.date;
        }

        @Nullable
        public final String component8() {
            return this.nextFrom;
        }

        @NotNull
        public final NewsfeedItemRecommendedChatsBlock copy(@NotNull List<MessagesChatSuggestion> items, int i, @NotNull String trackCode, @NotNull BaseLinkButton button, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i10, @Nullable String str) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemRecommendedChatsBlock(items, i, trackCode, button, type, sourceId, i10, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedChatsBlock)) {
                return false;
            }
            NewsfeedItemRecommendedChatsBlock newsfeedItemRecommendedChatsBlock = (NewsfeedItemRecommendedChatsBlock) obj;
            return Intrinsics.a(this.items, newsfeedItemRecommendedChatsBlock.items) && this.count == newsfeedItemRecommendedChatsBlock.count && Intrinsics.a(this.trackCode, newsfeedItemRecommendedChatsBlock.trackCode) && Intrinsics.a(this.button, newsfeedItemRecommendedChatsBlock.button) && this.type == newsfeedItemRecommendedChatsBlock.type && Intrinsics.a(this.sourceId, newsfeedItemRecommendedChatsBlock.sourceId) && this.date == newsfeedItemRecommendedChatsBlock.date && Intrinsics.a(this.nextFrom, newsfeedItemRecommendedChatsBlock.nextFrom);
        }

        @NotNull
        public final BaseLinkButton getButton() {
            return this.button;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getDate() {
            return this.date;
        }

        @NotNull
        public final List<MessagesChatSuggestion> getItems() {
            return this.items;
        }

        @Nullable
        public final String getNextFrom() {
            return this.nextFrom;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, (this.type.hashCode() + ((this.button.hashCode() + a.e(u.g(this.count, this.items.hashCode() * 31, 31), 31, this.trackCode)) * 31)) * 31, 31), 31);
            String str = this.nextFrom;
            return iG + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "NewsfeedItemRecommendedChatsBlock(items=" + this.items + ", count=" + this.count + ", trackCode=" + this.trackCode + ", button=" + this.button + ", type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", nextFrom=" + this.nextFrom + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemRecommendedChatsBlock(@NotNull List<MessagesChatSuggestion> items, int i, @NotNull String trackCode, @NotNull BaseLinkButton button, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i10, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.items = items;
            this.count = i;
            this.trackCode = trackCode;
            this.button = button;
            this.type = type;
            this.sourceId = sourceId;
            this.date = i10;
            this.nextFrom = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemRecommendedGroupsBlock extends NewsfeedNewsfeedItem {

        @b("button")
        @NotNull
        private final BaseLinkButton button;

        @b("count")
        private final int count;

        @b("date")
        private final int date;

        @b("items")
        @NotNull
        private final List<GroupsSuggestion> items;

        @b("next_from")
        @Nullable
        private final String nextFrom;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("title")
        @NotNull
        private final String title;

        @b("track_code")
        @NotNull
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemRecommendedGroupsBlock(String str, List list, int i, String str2, BaseLinkButton baseLinkButton, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, i, str2, baseLinkButton, newsfeedNewsfeedItemType, userId, i10, (i11 & 256) != 0 ? null : str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemRecommendedGroupsBlock copy$default(NewsfeedItemRecommendedGroupsBlock newsfeedItemRecommendedGroupsBlock, String str, List list, int i, String str2, BaseLinkButton baseLinkButton, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i10, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = newsfeedItemRecommendedGroupsBlock.title;
            }
            if ((i11 & 2) != 0) {
                list = newsfeedItemRecommendedGroupsBlock.items;
            }
            if ((i11 & 4) != 0) {
                i = newsfeedItemRecommendedGroupsBlock.count;
            }
            if ((i11 & 8) != 0) {
                str2 = newsfeedItemRecommendedGroupsBlock.trackCode;
            }
            if ((i11 & 16) != 0) {
                baseLinkButton = newsfeedItemRecommendedGroupsBlock.button;
            }
            if ((i11 & 32) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemRecommendedGroupsBlock.type;
            }
            if ((i11 & 64) != 0) {
                userId = newsfeedItemRecommendedGroupsBlock.sourceId;
            }
            if ((i11 & 128) != 0) {
                i10 = newsfeedItemRecommendedGroupsBlock.date;
            }
            if ((i11 & 256) != 0) {
                str3 = newsfeedItemRecommendedGroupsBlock.nextFrom;
            }
            int i12 = i10;
            String str4 = str3;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType2 = newsfeedNewsfeedItemType;
            UserId userId2 = userId;
            BaseLinkButton baseLinkButton2 = baseLinkButton;
            int i13 = i;
            return newsfeedItemRecommendedGroupsBlock.copy(str, list, i13, str2, baseLinkButton2, newsfeedNewsfeedItemType2, userId2, i12, str4);
        }

        @NotNull
        public final String component1() {
            return this.title;
        }

        @NotNull
        public final List<GroupsSuggestion> component2() {
            return this.items;
        }

        public final int component3() {
            return this.count;
        }

        @NotNull
        public final String component4() {
            return this.trackCode;
        }

        @NotNull
        public final BaseLinkButton component5() {
            return this.button;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component6() {
            return this.type;
        }

        @NotNull
        public final UserId component7() {
            return this.sourceId;
        }

        public final int component8() {
            return this.date;
        }

        @Nullable
        public final String component9() {
            return this.nextFrom;
        }

        @NotNull
        public final NewsfeedItemRecommendedGroupsBlock copy(@NotNull String title, @NotNull List<GroupsSuggestion> items, int i, @NotNull String trackCode, @NotNull BaseLinkButton button, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i10, @Nullable String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemRecommendedGroupsBlock(title, items, i, trackCode, button, type, sourceId, i10, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedGroupsBlock)) {
                return false;
            }
            NewsfeedItemRecommendedGroupsBlock newsfeedItemRecommendedGroupsBlock = (NewsfeedItemRecommendedGroupsBlock) obj;
            return Intrinsics.a(this.title, newsfeedItemRecommendedGroupsBlock.title) && Intrinsics.a(this.items, newsfeedItemRecommendedGroupsBlock.items) && this.count == newsfeedItemRecommendedGroupsBlock.count && Intrinsics.a(this.trackCode, newsfeedItemRecommendedGroupsBlock.trackCode) && Intrinsics.a(this.button, newsfeedItemRecommendedGroupsBlock.button) && this.type == newsfeedItemRecommendedGroupsBlock.type && Intrinsics.a(this.sourceId, newsfeedItemRecommendedGroupsBlock.sourceId) && this.date == newsfeedItemRecommendedGroupsBlock.date && Intrinsics.a(this.nextFrom, newsfeedItemRecommendedGroupsBlock.nextFrom);
        }

        @NotNull
        public final BaseLinkButton getButton() {
            return this.button;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getDate() {
            return this.date;
        }

        @NotNull
        public final List<GroupsSuggestion> getItems() {
            return this.items;
        }

        @Nullable
        public final String getNextFrom() {
            return this.nextFrom;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, (this.type.hashCode() + ((this.button.hashCode() + a.e(u.g(this.count, u.i(this.items, this.title.hashCode() * 31, 31), 31), 31, this.trackCode)) * 31)) * 31, 31), 31);
            String str = this.nextFrom;
            return iG + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.title;
            List<GroupsSuggestion> list = this.items;
            int i = this.count;
            String str2 = this.trackCode;
            BaseLinkButton baseLinkButton = this.button;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i10 = this.date;
            String str3 = this.nextFrom;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemRecommendedGroupsBlock(title=");
            sb2.append(str);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", count=");
            a.q(i, ", trackCode=", str2, ", button=", sb2);
            sb2.append(baseLinkButton);
            sb2.append(", type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i10);
            sb2.append(", nextFrom=");
            return u.o(sb2, str3, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemRecommendedGroupsBlock(@NotNull String title, @NotNull List<GroupsSuggestion> items, int i, @NotNull String trackCode, @NotNull BaseLinkButton button, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i10, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.title = title;
            this.items = items;
            this.count = i;
            this.trackCode = trackCode;
            this.button = button;
            this.type = type;
            this.sourceId = sourceId;
            this.date = i10;
            this.nextFrom = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemStoriesBlock extends NewsfeedNewsfeedItem {

        @b("block_type")
        @Nullable
        private final BlockType blockType;

        @b("date")
        private final int date;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("stories")
        @Nullable
        private final List<StoriesStory> stories;

        @b("title")
        @Nullable
        private final String title;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum BlockType {
            LOCAL("local"),
            REMOTE("remote");


            @NotNull
            private final String value;

            BlockType(String str) {
                this.value = str;
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ NewsfeedItemStoriesBlock(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, BlockType blockType, List list, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : blockType, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemStoriesBlock copy$default(NewsfeedItemStoriesBlock newsfeedItemStoriesBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, BlockType blockType, List list, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemStoriesBlock.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemStoriesBlock.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemStoriesBlock.date;
            }
            if ((i10 & 8) != 0) {
                blockType = newsfeedItemStoriesBlock.blockType;
            }
            if ((i10 & 16) != 0) {
                list = newsfeedItemStoriesBlock.stories;
            }
            if ((i10 & 32) != 0) {
                str = newsfeedItemStoriesBlock.title;
            }
            if ((i10 & 64) != 0) {
                str2 = newsfeedItemStoriesBlock.trackCode;
            }
            String str3 = str;
            String str4 = str2;
            List list2 = list;
            int i11 = i;
            return newsfeedItemStoriesBlock.copy(newsfeedNewsfeedItemType, userId, i11, blockType, list2, str3, str4);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final BlockType component4() {
            return this.blockType;
        }

        @Nullable
        public final List<StoriesStory> component5() {
            return this.stories;
        }

        @Nullable
        public final String component6() {
            return this.title;
        }

        @Nullable
        public final String component7() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedItemStoriesBlock copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable BlockType blockType, @Nullable List<StoriesStory> list, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemStoriesBlock(type, sourceId, i, blockType, list, str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemStoriesBlock)) {
                return false;
            }
            NewsfeedItemStoriesBlock newsfeedItemStoriesBlock = (NewsfeedItemStoriesBlock) obj;
            return this.type == newsfeedItemStoriesBlock.type && Intrinsics.a(this.sourceId, newsfeedItemStoriesBlock.sourceId) && this.date == newsfeedItemStoriesBlock.date && this.blockType == newsfeedItemStoriesBlock.blockType && Intrinsics.a(this.stories, newsfeedItemStoriesBlock.stories) && Intrinsics.a(this.title, newsfeedItemStoriesBlock.title) && Intrinsics.a(this.trackCode, newsfeedItemStoriesBlock.trackCode);
        }

        @Nullable
        public final BlockType getBlockType() {
            return this.blockType;
        }

        public final int getDate() {
            return this.date;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final List<StoriesStory> getStories() {
            return this.stories;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            BlockType blockType = this.blockType;
            int iHashCode = (iG + (blockType == null ? 0 : blockType.hashCode())) * 31;
            List<StoriesStory> list = this.stories;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            BlockType blockType = this.blockType;
            List<StoriesStory> list = this.stories;
            String str = this.title;
            String str2 = this.trackCode;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemStoriesBlock(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", blockType=");
            sb2.append(blockType);
            sb2.append(", stories=");
            sb2.append(list);
            sb2.append(", title=");
            sb2.append(str);
            sb2.append(", trackCode=");
            return u.o(sb2, str2, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemStoriesBlock(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable BlockType blockType, @Nullable List<StoriesStory> list, @Nullable String str, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.blockType = blockType;
            this.stories = list;
            this.title = str;
            this.trackCode = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemTextliveBlock extends NewsfeedNewsfeedItem {

        @b("date")
        private final int date;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("textlive_textpost_block")
        @NotNull
        private final TextlivesTextliveTextpostBlock textliveTextpostBlock;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemTextliveBlock(TextlivesTextliveTextpostBlock textlivesTextliveTextpostBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(textlivesTextliveTextpostBlock, newsfeedNewsfeedItemType, userId, i, (i10 & 16) != 0 ? null : str);
        }

        public static /* synthetic */ NewsfeedItemTextliveBlock copy$default(NewsfeedItemTextliveBlock newsfeedItemTextliveBlock, TextlivesTextliveTextpostBlock textlivesTextliveTextpostBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                textlivesTextliveTextpostBlock = newsfeedItemTextliveBlock.textliveTextpostBlock;
            }
            if ((i10 & 2) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemTextliveBlock.type;
            }
            if ((i10 & 4) != 0) {
                userId = newsfeedItemTextliveBlock.sourceId;
            }
            if ((i10 & 8) != 0) {
                i = newsfeedItemTextliveBlock.date;
            }
            if ((i10 & 16) != 0) {
                str = newsfeedItemTextliveBlock.trackCode;
            }
            String str2 = str;
            UserId userId2 = userId;
            return newsfeedItemTextliveBlock.copy(textlivesTextliveTextpostBlock, newsfeedNewsfeedItemType, userId2, i, str2);
        }

        @NotNull
        public final TextlivesTextliveTextpostBlock component1() {
            return this.textliveTextpostBlock;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component2() {
            return this.type;
        }

        @NotNull
        public final UserId component3() {
            return this.sourceId;
        }

        public final int component4() {
            return this.date;
        }

        @Nullable
        public final String component5() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedItemTextliveBlock copy(@NotNull TextlivesTextliveTextpostBlock textliveTextpostBlock, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str) {
            Intrinsics.checkNotNullParameter(textliveTextpostBlock, "textliveTextpostBlock");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemTextliveBlock(textliveTextpostBlock, type, sourceId, i, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemTextliveBlock)) {
                return false;
            }
            NewsfeedItemTextliveBlock newsfeedItemTextliveBlock = (NewsfeedItemTextliveBlock) obj;
            return Intrinsics.a(this.textliveTextpostBlock, newsfeedItemTextliveBlock.textliveTextpostBlock) && this.type == newsfeedItemTextliveBlock.type && Intrinsics.a(this.sourceId, newsfeedItemTextliveBlock.sourceId) && this.date == newsfeedItemTextliveBlock.date && Intrinsics.a(this.trackCode, newsfeedItemTextliveBlock.trackCode);
        }

        public final int getDate() {
            return this.date;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final TextlivesTextliveTextpostBlock getTextliveTextpostBlock() {
            return this.textliveTextpostBlock;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, (this.type.hashCode() + (this.textliveTextpostBlock.hashCode() * 31)) * 31, 31), 31);
            String str = this.trackCode;
            return iG + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            TextlivesTextliveTextpostBlock textlivesTextliveTextpostBlock = this.textliveTextpostBlock;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.trackCode;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemTextliveBlock(textliveTextpostBlock=");
            sb2.append(textlivesTextliveTextpostBlock);
            sb2.append(", type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", trackCode=");
            return u.o(sb2, str, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemTextliveBlock(@NotNull TextlivesTextliveTextpostBlock textliveTextpostBlock, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(textliveTextpostBlock, "textliveTextpostBlock");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.textliveTextpostBlock = textliveTextpostBlock;
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.trackCode = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemTopic extends NewsfeedNewsfeedItem {

        @b(UserFeedback.JsonKeys.COMMENTS)
        @Nullable
        private final BaseCommentsInfo comments;

        @b("date")
        private final int date;

        @b("likes")
        @Nullable
        private final BaseLikesInfo likes;

        @b("post_id")
        private final int postId;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("text")
        @NotNull
        private final String text;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemTopic(int i, String str, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i10, BaseCommentsInfo baseCommentsInfo, BaseLikesInfo baseLikesInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, newsfeedNewsfeedItemType, userId, i10, (i11 & 32) != 0 ? null : baseCommentsInfo, (i11 & 64) != 0 ? null : baseLikesInfo);
        }

        public static /* synthetic */ NewsfeedItemTopic copy$default(NewsfeedItemTopic newsfeedItemTopic, int i, String str, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i10, BaseCommentsInfo baseCommentsInfo, BaseLikesInfo baseLikesInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i = newsfeedItemTopic.postId;
            }
            if ((i11 & 2) != 0) {
                str = newsfeedItemTopic.text;
            }
            if ((i11 & 4) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemTopic.type;
            }
            if ((i11 & 8) != 0) {
                userId = newsfeedItemTopic.sourceId;
            }
            if ((i11 & 16) != 0) {
                i10 = newsfeedItemTopic.date;
            }
            if ((i11 & 32) != 0) {
                baseCommentsInfo = newsfeedItemTopic.comments;
            }
            if ((i11 & 64) != 0) {
                baseLikesInfo = newsfeedItemTopic.likes;
            }
            BaseCommentsInfo baseCommentsInfo2 = baseCommentsInfo;
            BaseLikesInfo baseLikesInfo2 = baseLikesInfo;
            int i12 = i10;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType2 = newsfeedNewsfeedItemType;
            return newsfeedItemTopic.copy(i, str, newsfeedNewsfeedItemType2, userId, i12, baseCommentsInfo2, baseLikesInfo2);
        }

        public final int component1() {
            return this.postId;
        }

        @NotNull
        public final String component2() {
            return this.text;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component3() {
            return this.type;
        }

        @NotNull
        public final UserId component4() {
            return this.sourceId;
        }

        public final int component5() {
            return this.date;
        }

        @Nullable
        public final BaseCommentsInfo component6() {
            return this.comments;
        }

        @Nullable
        public final BaseLikesInfo component7() {
            return this.likes;
        }

        @NotNull
        public final NewsfeedItemTopic copy(int i, @NotNull String text, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i10, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable BaseLikesInfo baseLikesInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemTopic(i, text, type, sourceId, i10, baseCommentsInfo, baseLikesInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemTopic)) {
                return false;
            }
            NewsfeedItemTopic newsfeedItemTopic = (NewsfeedItemTopic) obj;
            return this.postId == newsfeedItemTopic.postId && Intrinsics.a(this.text, newsfeedItemTopic.text) && this.type == newsfeedItemTopic.type && Intrinsics.a(this.sourceId, newsfeedItemTopic.sourceId) && this.date == newsfeedItemTopic.date && Intrinsics.a(this.comments, newsfeedItemTopic.comments) && Intrinsics.a(this.likes, newsfeedItemTopic.likes);
        }

        @Nullable
        public final BaseCommentsInfo getComments() {
            return this.comments;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final BaseLikesInfo getLikes() {
            return this.likes;
        }

        public final int getPostId() {
            return this.postId;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, (this.type.hashCode() + a.e(Integer.hashCode(this.postId) * 31, 31, this.text)) * 31, 31), 31);
            BaseCommentsInfo baseCommentsInfo = this.comments;
            int iHashCode = (iG + (baseCommentsInfo == null ? 0 : baseCommentsInfo.hashCode())) * 31;
            BaseLikesInfo baseLikesInfo = this.likes;
            return iHashCode + (baseLikesInfo != null ? baseLikesInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i = this.postId;
            String str = this.text;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i10 = this.date;
            BaseCommentsInfo baseCommentsInfo = this.comments;
            BaseLikesInfo baseLikesInfo = this.likes;
            StringBuilder sbI = pe.a.i(i, "NewsfeedItemTopic(postId=", ", text=", str, ", type=");
            sbI.append(newsfeedNewsfeedItemType);
            sbI.append(", sourceId=");
            sbI.append(userId);
            sbI.append(", date=");
            sbI.append(i10);
            sbI.append(", comments=");
            sbI.append(baseCommentsInfo);
            sbI.append(", likes=");
            sbI.append(baseLikesInfo);
            sbI.append(")");
            return sbI.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemTopic(int i, @NotNull String text, @NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i10, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable BaseLikesInfo baseLikesInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.postId = i;
            this.text = text;
            this.type = type;
            this.sourceId = sourceId;
            this.date = i10;
            this.comments = baseCommentsInfo;
            this.likes = baseLikesInfo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemVideo extends NewsfeedNewsfeedItem {

        @b("carousel_offset")
        @Nullable
        private final Integer carouselOffset;

        @b("date")
        private final int date;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        @b(RRWebVideoEvent.EVENT_TAG)
        @Nullable
        private final NewsfeedItemVideoVideo video;

        public /* synthetic */ NewsfeedItemVideo(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemVideoVideo newsfeedItemVideoVideo, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : newsfeedItemVideoVideo, (i10 & 16) != 0 ? null : num);
        }

        public static /* synthetic */ NewsfeedItemVideo copy$default(NewsfeedItemVideo newsfeedItemVideo, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemVideoVideo newsfeedItemVideoVideo, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemVideo.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemVideo.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemVideo.date;
            }
            if ((i10 & 8) != 0) {
                newsfeedItemVideoVideo = newsfeedItemVideo.video;
            }
            if ((i10 & 16) != 0) {
                num = newsfeedItemVideo.carouselOffset;
            }
            Integer num2 = num;
            int i11 = i;
            return newsfeedItemVideo.copy(newsfeedNewsfeedItemType, userId, i11, newsfeedItemVideoVideo, num2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final NewsfeedItemVideoVideo component4() {
            return this.video;
        }

        @Nullable
        public final Integer component5() {
            return this.carouselOffset;
        }

        @NotNull
        public final NewsfeedItemVideo copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemVideoVideo newsfeedItemVideoVideo, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemVideo(type, sourceId, i, newsfeedItemVideoVideo, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideo)) {
                return false;
            }
            NewsfeedItemVideo newsfeedItemVideo = (NewsfeedItemVideo) obj;
            return this.type == newsfeedItemVideo.type && Intrinsics.a(this.sourceId, newsfeedItemVideo.sourceId) && this.date == newsfeedItemVideo.date && Intrinsics.a(this.video, newsfeedItemVideo.video) && Intrinsics.a(this.carouselOffset, newsfeedItemVideo.carouselOffset);
        }

        @Nullable
        public final Integer getCarouselOffset() {
            return this.carouselOffset;
        }

        public final int getDate() {
            return this.date;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        @Nullable
        public final NewsfeedItemVideoVideo getVideo() {
            return this.video;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            NewsfeedItemVideoVideo newsfeedItemVideoVideo = this.video;
            int iHashCode = (iG + (newsfeedItemVideoVideo == null ? 0 : newsfeedItemVideoVideo.hashCode())) * 31;
            Integer num = this.carouselOffset;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemVideoVideo newsfeedItemVideoVideo = this.video;
            Integer num = this.carouselOffset;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemVideo(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", video=");
            sb2.append(newsfeedItemVideoVideo);
            sb2.append(", carouselOffset=");
            return u.m(sb2, num, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemVideo(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemVideoVideo newsfeedItemVideoVideo, @Nullable Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.video = newsfeedItemVideoVideo;
            this.carouselOffset = num;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemVideoPostcardBlock extends NewsfeedNewsfeedItem {

        @b("buttons")
        @Nullable
        private final List<BaseLinkButton> buttons;

        @b("date")
        private final int date;

        @b("description")
        @Nullable
        private final String description;

        @b("item")
        @Nullable
        private final VideoVideoFull item;

        @b("privacy_text")
        @Nullable
        private final String privacyText;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("title")
        @Nullable
        private final String title;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemVideoPostcardBlock(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, String str3, String str4, VideoVideoFull videoVideoFull, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : videoVideoFull, (i10 & 256) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemVideoPostcardBlock copy$default(NewsfeedItemVideoPostcardBlock newsfeedItemVideoPostcardBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, String str3, String str4, VideoVideoFull videoVideoFull, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemVideoPostcardBlock.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemVideoPostcardBlock.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemVideoPostcardBlock.date;
            }
            if ((i10 & 8) != 0) {
                str = newsfeedItemVideoPostcardBlock.title;
            }
            if ((i10 & 16) != 0) {
                str2 = newsfeedItemVideoPostcardBlock.description;
            }
            if ((i10 & 32) != 0) {
                str3 = newsfeedItemVideoPostcardBlock.privacyText;
            }
            if ((i10 & 64) != 0) {
                str4 = newsfeedItemVideoPostcardBlock.trackCode;
            }
            if ((i10 & 128) != 0) {
                videoVideoFull = newsfeedItemVideoPostcardBlock.item;
            }
            if ((i10 & 256) != 0) {
                list = newsfeedItemVideoPostcardBlock.buttons;
            }
            VideoVideoFull videoVideoFull2 = videoVideoFull;
            List list2 = list;
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            int i11 = i;
            return newsfeedItemVideoPostcardBlock.copy(newsfeedNewsfeedItemType, userId, i11, str, str7, str5, str6, videoVideoFull2, list2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final String component4() {
            return this.title;
        }

        @Nullable
        public final String component5() {
            return this.description;
        }

        @Nullable
        public final String component6() {
            return this.privacyText;
        }

        @Nullable
        public final String component7() {
            return this.trackCode;
        }

        @Nullable
        public final VideoVideoFull component8() {
            return this.item;
        }

        @Nullable
        public final List<BaseLinkButton> component9() {
            return this.buttons;
        }

        @NotNull
        public final NewsfeedItemVideoPostcardBlock copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable VideoVideoFull videoVideoFull, @Nullable List<BaseLinkButton> list) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemVideoPostcardBlock(type, sourceId, i, str, str2, str3, str4, videoVideoFull, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideoPostcardBlock)) {
                return false;
            }
            NewsfeedItemVideoPostcardBlock newsfeedItemVideoPostcardBlock = (NewsfeedItemVideoPostcardBlock) obj;
            return this.type == newsfeedItemVideoPostcardBlock.type && Intrinsics.a(this.sourceId, newsfeedItemVideoPostcardBlock.sourceId) && this.date == newsfeedItemVideoPostcardBlock.date && Intrinsics.a(this.title, newsfeedItemVideoPostcardBlock.title) && Intrinsics.a(this.description, newsfeedItemVideoPostcardBlock.description) && Intrinsics.a(this.privacyText, newsfeedItemVideoPostcardBlock.privacyText) && Intrinsics.a(this.trackCode, newsfeedItemVideoPostcardBlock.trackCode) && Intrinsics.a(this.item, newsfeedItemVideoPostcardBlock.item) && Intrinsics.a(this.buttons, newsfeedItemVideoPostcardBlock.buttons);
        }

        @Nullable
        public final List<BaseLinkButton> getButtons() {
            return this.buttons;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final VideoVideoFull getItem() {
            return this.item;
        }

        @Nullable
        public final String getPrivacyText() {
            return this.privacyText;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            String str = this.title;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.privacyText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackCode;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            VideoVideoFull videoVideoFull = this.item;
            int iHashCode5 = (iHashCode4 + (videoVideoFull == null ? 0 : videoVideoFull.hashCode())) * 31;
            List<BaseLinkButton> list = this.buttons;
            return iHashCode5 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            String str2 = this.description;
            String str3 = this.privacyText;
            String str4 = this.trackCode;
            VideoVideoFull videoVideoFull = this.item;
            List<BaseLinkButton> list = this.buttons;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemVideoPostcardBlock(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            a.q(i, ", title=", str, ", description=", sb2);
            l7.o.t(sb2, str2, ", privacyText=", str3, ", trackCode=");
            sb2.append(str4);
            sb2.append(", item=");
            sb2.append(videoVideoFull);
            sb2.append(", buttons=");
            return z.h(sb2, list, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemVideoPostcardBlock(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable VideoVideoFull videoVideoFull, @Nullable List<BaseLinkButton> list) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.title = str;
            this.description = str2;
            this.privacyText = str3;
            this.trackCode = str4;
            this.item = videoVideoFull;
            this.buttons = list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemVideosForYouBlock extends NewsfeedNewsfeedItem {

        @b("button")
        @Nullable
        private final BaseLinkButton button;

        @b("date")
        private final int date;

        @b("items")
        @Nullable
        private final List<VideoVideoFull> items;

        @b("next_from")
        @Nullable
        private final String nextFrom;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("title")
        @Nullable
        private final String title;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        public /* synthetic */ NewsfeedItemVideosForYouBlock(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, List list, String str3, BaseLinkButton baseLinkButton, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : baseLinkButton);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemVideosForYouBlock copy$default(NewsfeedItemVideosForYouBlock newsfeedItemVideosForYouBlock, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, String str, String str2, List list, String str3, BaseLinkButton baseLinkButton, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                newsfeedNewsfeedItemType = newsfeedItemVideosForYouBlock.type;
            }
            if ((i10 & 2) != 0) {
                userId = newsfeedItemVideosForYouBlock.sourceId;
            }
            if ((i10 & 4) != 0) {
                i = newsfeedItemVideosForYouBlock.date;
            }
            if ((i10 & 8) != 0) {
                str = newsfeedItemVideosForYouBlock.title;
            }
            if ((i10 & 16) != 0) {
                str2 = newsfeedItemVideosForYouBlock.trackCode;
            }
            if ((i10 & 32) != 0) {
                list = newsfeedItemVideosForYouBlock.items;
            }
            if ((i10 & 64) != 0) {
                str3 = newsfeedItemVideosForYouBlock.nextFrom;
            }
            if ((i10 & 128) != 0) {
                baseLinkButton = newsfeedItemVideosForYouBlock.button;
            }
            String str4 = str3;
            BaseLinkButton baseLinkButton2 = baseLinkButton;
            String str5 = str2;
            List list2 = list;
            return newsfeedItemVideosForYouBlock.copy(newsfeedNewsfeedItemType, userId, i, str, str5, list2, str4, baseLinkButton2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final String component4() {
            return this.title;
        }

        @Nullable
        public final String component5() {
            return this.trackCode;
        }

        @Nullable
        public final List<VideoVideoFull> component6() {
            return this.items;
        }

        @Nullable
        public final String component7() {
            return this.nextFrom;
        }

        @Nullable
        public final BaseLinkButton component8() {
            return this.button;
        }

        @NotNull
        public final NewsfeedItemVideosForYouBlock copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable List<VideoVideoFull> list, @Nullable String str3, @Nullable BaseLinkButton baseLinkButton) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemVideosForYouBlock(type, sourceId, i, str, str2, list, str3, baseLinkButton);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideosForYouBlock)) {
                return false;
            }
            NewsfeedItemVideosForYouBlock newsfeedItemVideosForYouBlock = (NewsfeedItemVideosForYouBlock) obj;
            return this.type == newsfeedItemVideosForYouBlock.type && Intrinsics.a(this.sourceId, newsfeedItemVideosForYouBlock.sourceId) && this.date == newsfeedItemVideosForYouBlock.date && Intrinsics.a(this.title, newsfeedItemVideosForYouBlock.title) && Intrinsics.a(this.trackCode, newsfeedItemVideosForYouBlock.trackCode) && Intrinsics.a(this.items, newsfeedItemVideosForYouBlock.items) && Intrinsics.a(this.nextFrom, newsfeedItemVideosForYouBlock.nextFrom) && Intrinsics.a(this.button, newsfeedItemVideosForYouBlock.button);
        }

        @Nullable
        public final BaseLinkButton getButton() {
            return this.button;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final List<VideoVideoFull> getItems() {
            return this.items;
        }

        @Nullable
        public final String getNextFrom() {
            return this.nextFrom;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            String str = this.title;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<VideoVideoFull> list = this.items;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.nextFrom;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BaseLinkButton baseLinkButton = this.button;
            return iHashCode4 + (baseLinkButton != null ? baseLinkButton.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            String str2 = this.trackCode;
            List<VideoVideoFull> list = this.items;
            String str3 = this.nextFrom;
            BaseLinkButton baseLinkButton = this.button;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemVideosForYouBlock(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            a.q(i, ", title=", str, ", trackCode=", sb2);
            sb2.append(str2);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", nextFrom=");
            sb2.append(str3);
            sb2.append(", button=");
            sb2.append(baseLinkButton);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemVideosForYouBlock(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable String str, @Nullable String str2, @Nullable List<VideoVideoFull> list, @Nullable String str3, @Nullable BaseLinkButton baseLinkButton) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.title = str;
            this.trackCode = str2;
            this.items = list;
            this.nextFrom = str3;
            this.button = baseLinkButton;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemWallpost extends NewsfeedNewsfeedItem {

        @b("access_key")
        @Nullable
        private final String accessKey;

        @b("attachments")
        @Nullable
        private final List<WallWallpostAttachment> attachments;

        @b("can_delete")
        @Nullable
        private final BaseBoolInt canDelete;

        @b("can_edit")
        @Nullable
        private final BaseBoolInt canEdit;

        @b("can_pin")
        @Nullable
        private final BaseBoolInt canPin;

        @b("carousel_offset")
        @Nullable
        private final Integer carouselOffset;

        @b(UserFeedback.JsonKeys.COMMENTS)
        @Nullable
        private final BaseCommentsInfo comments;

        @b("copy_history")
        @Nullable
        private final List<WallWallpostFull> copyHistory;

        @b("copyright")
        @Nullable
        private final WallPostCopyright copyright;

        @b("created_by")
        @Nullable
        private final UserId createdBy;

        @b("date")
        private final int date;

        @b("donut")
        @Nullable
        private final WallWallpostDonut donut;

        @b("edited")
        @Nullable
        private final Integer edited;

        @b(Feedback.TYPE)
        @Nullable
        private final NewsfeedItemWallpostFeedback feedback;

        @b("from_id")
        @Nullable
        private final UserId fromId;

        @b(User.JsonKeys.GEO)
        @Nullable
        private final WallGeo geo;

        @b("hash")
        @Nullable
        private final String hash;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @b("id")
        @Nullable
        private final Integer f15204id;

        @b("is_archived")
        @Nullable
        private final Boolean isArchived;

        @b("is_deleted")
        @Nullable
        private final Boolean isDeleted;

        @b("is_favorite")
        @Nullable
        private final Boolean isFavorite;

        @b("is_pinned")
        @Nullable
        private final Integer isPinned;

        @b("likes")
        @Nullable
        private final BaseLikesInfo likes;

        @b("marked_as_ads")
        @Nullable
        private final BaseBoolInt markedAsAds;

        @b("owner_id")
        @Nullable
        private final UserId ownerId;

        @b("parents_stack")
        @Nullable
        private final List<Integer> parentsStack;

        @b("post_id")
        @Nullable
        private final Integer postId;

        @b("post_source")
        @Nullable
        private final WallPostSource postSource;

        @b("post_type")
        @Nullable
        private final WallPostType postType;

        @b("reposts")
        @Nullable
        private final BaseRepostsInfo reposts;

        @b("short_text_rate")
        @Nullable
        private final Float shortTextRate;

        @b("signer_id")
        @Nullable
        private final UserId signerId;

        @b("source_id")
        @NotNull
        private final UserId sourceId;

        @b("text")
        @Nullable
        private final String text;

        @b("topic_id")
        @Nullable
        private final TopicId topicId;

        @b("type")
        @NotNull
        private final NewsfeedNewsfeedItemType type;

        @b("views")
        @Nullable
        private final WallViews views;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum TopicId {
            EMPTY_TOPIC(0),
            ART(1),
            IT(7),
            GAMES(12),
            MUSIC(16),
            PHOTO(19),
            SCIENCE_AND_TECH(21),
            SPORT(23),
            TRAVEL(25),
            TV_AND_CINEMA(26),
            HUMOR(32),
            FASHION(43);

            private final int value;

            TopicId(int i) {
                this.value = i;
            }

            public final int getValue() {
                return this.value;
            }
        }

        public /* synthetic */ NewsfeedItemWallpost(NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback, Integer num, List list, BaseBoolInt baseBoolInt, UserId userId2, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, WallWallpostDonut wallWallpostDonut, Integer num2, BaseCommentsInfo baseCommentsInfo, BaseBoolInt baseBoolInt4, TopicId topicId, Float f10, String str, String str2, Boolean bool, List list2, WallPostCopyright wallPostCopyright, Integer num3, UserId userId3, WallGeo wallGeo, Integer num4, Boolean bool2, Boolean bool3, BaseLikesInfo baseLikesInfo, UserId userId4, Integer num5, List list3, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId5, String str3, WallViews wallViews, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(newsfeedNewsfeedItemType, userId, i, (i10 & 8) != 0 ? null : newsfeedItemWallpostFeedback, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : baseBoolInt, (i10 & 128) != 0 ? null : userId2, (i10 & 256) != 0 ? null : baseBoolInt2, (i10 & 512) != 0 ? null : baseBoolInt3, (i10 & 1024) != 0 ? null : wallWallpostDonut, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : baseCommentsInfo, (i10 & 8192) != 0 ? null : baseBoolInt4, (i10 & 16384) != 0 ? null : topicId, (32768 & i10) != 0 ? null : f10, (65536 & i10) != 0 ? null : str, (131072 & i10) != 0 ? null : str2, (262144 & i10) != 0 ? null : bool, (524288 & i10) != 0 ? null : list2, (1048576 & i10) != 0 ? null : wallPostCopyright, (2097152 & i10) != 0 ? null : num3, (4194304 & i10) != 0 ? null : userId3, (8388608 & i10) != 0 ? null : wallGeo, (16777216 & i10) != 0 ? null : num4, (33554432 & i10) != 0 ? null : bool2, (67108864 & i10) != 0 ? null : bool3, (134217728 & i10) != 0 ? null : baseLikesInfo, (268435456 & i10) != 0 ? null : userId4, (536870912 & i10) != 0 ? null : num5, (1073741824 & i10) != 0 ? null : list3, (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : wallPostSource, (i11 & 1) != 0 ? null : wallPostType, (i11 & 2) != 0 ? null : baseRepostsInfo, (i11 & 4) != 0 ? null : userId5, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : wallViews);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemWallpost copy$default(NewsfeedItemWallpost newsfeedItemWallpost, NewsfeedNewsfeedItemType newsfeedNewsfeedItemType, UserId userId, int i, NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback, Integer num, List list, BaseBoolInt baseBoolInt, UserId userId2, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, WallWallpostDonut wallWallpostDonut, Integer num2, BaseCommentsInfo baseCommentsInfo, BaseBoolInt baseBoolInt4, TopicId topicId, Float f10, String str, String str2, Boolean bool, List list2, WallPostCopyright wallPostCopyright, Integer num3, UserId userId3, WallGeo wallGeo, Integer num4, Boolean bool2, Boolean bool3, BaseLikesInfo baseLikesInfo, UserId userId4, Integer num5, List list3, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId5, String str3, WallViews wallViews, int i10, int i11, Object obj) {
            WallViews wallViews2;
            String str4;
            WallPostCopyright wallPostCopyright2;
            Integer num6;
            UserId userId6;
            WallGeo wallGeo2;
            Integer num7;
            Boolean bool4;
            Boolean bool5;
            BaseLikesInfo baseLikesInfo2;
            UserId userId7;
            Integer num8;
            List list4;
            WallPostSource wallPostSource2;
            WallPostType wallPostType2;
            BaseRepostsInfo baseRepostsInfo2;
            UserId userId8;
            TopicId topicId2;
            List list5;
            BaseBoolInt baseBoolInt5;
            UserId userId9;
            BaseBoolInt baseBoolInt6;
            BaseBoolInt baseBoolInt7;
            WallWallpostDonut wallWallpostDonut2;
            Integer num9;
            BaseCommentsInfo baseCommentsInfo2;
            BaseBoolInt baseBoolInt8;
            Float f11;
            String str5;
            String str6;
            Boolean bool6;
            List list6;
            UserId userId10;
            int i12;
            NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback2;
            Integer num10;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType2 = (i10 & 1) != 0 ? newsfeedItemWallpost.type : newsfeedNewsfeedItemType;
            UserId userId11 = (i10 & 2) != 0 ? newsfeedItemWallpost.sourceId : userId;
            int i13 = (i10 & 4) != 0 ? newsfeedItemWallpost.date : i;
            NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback3 = (i10 & 8) != 0 ? newsfeedItemWallpost.feedback : newsfeedItemWallpostFeedback;
            Integer num11 = (i10 & 16) != 0 ? newsfeedItemWallpost.carouselOffset : num;
            List list7 = (i10 & 32) != 0 ? newsfeedItemWallpost.copyHistory : list;
            BaseBoolInt baseBoolInt9 = (i10 & 64) != 0 ? newsfeedItemWallpost.canEdit : baseBoolInt;
            UserId userId12 = (i10 & 128) != 0 ? newsfeedItemWallpost.createdBy : userId2;
            BaseBoolInt baseBoolInt10 = (i10 & 256) != 0 ? newsfeedItemWallpost.canDelete : baseBoolInt2;
            BaseBoolInt baseBoolInt11 = (i10 & 512) != 0 ? newsfeedItemWallpost.canPin : baseBoolInt3;
            WallWallpostDonut wallWallpostDonut3 = (i10 & 1024) != 0 ? newsfeedItemWallpost.donut : wallWallpostDonut;
            Integer num12 = (i10 & 2048) != 0 ? newsfeedItemWallpost.isPinned : num2;
            BaseCommentsInfo baseCommentsInfo3 = (i10 & 4096) != 0 ? newsfeedItemWallpost.comments : baseCommentsInfo;
            BaseBoolInt baseBoolInt12 = (i10 & 8192) != 0 ? newsfeedItemWallpost.markedAsAds : baseBoolInt4;
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType3 = newsfeedNewsfeedItemType2;
            TopicId topicId3 = (i10 & 16384) != 0 ? newsfeedItemWallpost.topicId : topicId;
            Float f12 = (i10 & 32768) != 0 ? newsfeedItemWallpost.shortTextRate : f10;
            String str7 = (i10 & 65536) != 0 ? newsfeedItemWallpost.hash : str;
            String str8 = (i10 & 131072) != 0 ? newsfeedItemWallpost.accessKey : str2;
            Boolean bool7 = (i10 & 262144) != 0 ? newsfeedItemWallpost.isDeleted : bool;
            List list8 = (i10 & 524288) != 0 ? newsfeedItemWallpost.attachments : list2;
            WallPostCopyright wallPostCopyright3 = (i10 & 1048576) != 0 ? newsfeedItemWallpost.copyright : wallPostCopyright;
            Integer num13 = (i10 & 2097152) != 0 ? newsfeedItemWallpost.edited : num3;
            UserId userId13 = (i10 & 4194304) != 0 ? newsfeedItemWallpost.fromId : userId3;
            WallGeo wallGeo3 = (i10 & 8388608) != 0 ? newsfeedItemWallpost.geo : wallGeo;
            Integer num14 = (i10 & 16777216) != 0 ? newsfeedItemWallpost.f15204id : num4;
            Boolean bool8 = (i10 & 33554432) != 0 ? newsfeedItemWallpost.isArchived : bool2;
            Boolean bool9 = (i10 & 67108864) != 0 ? newsfeedItemWallpost.isFavorite : bool3;
            BaseLikesInfo baseLikesInfo3 = (i10 & 134217728) != 0 ? newsfeedItemWallpost.likes : baseLikesInfo;
            UserId userId14 = (i10 & 268435456) != 0 ? newsfeedItemWallpost.ownerId : userId4;
            Integer num15 = (i10 & 536870912) != 0 ? newsfeedItemWallpost.postId : num5;
            List list9 = (i10 & 1073741824) != 0 ? newsfeedItemWallpost.parentsStack : list3;
            WallPostSource wallPostSource3 = (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? newsfeedItemWallpost.postSource : wallPostSource;
            WallPostType wallPostType3 = (i11 & 1) != 0 ? newsfeedItemWallpost.postType : wallPostType;
            BaseRepostsInfo baseRepostsInfo3 = (i11 & 2) != 0 ? newsfeedItemWallpost.reposts : baseRepostsInfo;
            UserId userId15 = (i11 & 4) != 0 ? newsfeedItemWallpost.signerId : userId5;
            String str9 = (i11 & 8) != 0 ? newsfeedItemWallpost.text : str3;
            if ((i11 & 16) != 0) {
                str4 = str9;
                wallViews2 = newsfeedItemWallpost.views;
                num6 = num13;
                userId6 = userId13;
                wallGeo2 = wallGeo3;
                num7 = num14;
                bool4 = bool8;
                bool5 = bool9;
                baseLikesInfo2 = baseLikesInfo3;
                userId7 = userId14;
                num8 = num15;
                list4 = list9;
                wallPostSource2 = wallPostSource3;
                wallPostType2 = wallPostType3;
                baseRepostsInfo2 = baseRepostsInfo3;
                userId8 = userId15;
                topicId2 = topicId3;
                baseBoolInt5 = baseBoolInt9;
                userId9 = userId12;
                baseBoolInt6 = baseBoolInt10;
                baseBoolInt7 = baseBoolInt11;
                wallWallpostDonut2 = wallWallpostDonut3;
                num9 = num12;
                baseCommentsInfo2 = baseCommentsInfo3;
                baseBoolInt8 = baseBoolInt12;
                f11 = f12;
                str5 = str7;
                str6 = str8;
                bool6 = bool7;
                list6 = list8;
                wallPostCopyright2 = wallPostCopyright3;
                userId10 = userId11;
                i12 = i13;
                newsfeedItemWallpostFeedback2 = newsfeedItemWallpostFeedback3;
                num10 = num11;
                list5 = list7;
            } else {
                wallViews2 = wallViews;
                str4 = str9;
                wallPostCopyright2 = wallPostCopyright3;
                num6 = num13;
                userId6 = userId13;
                wallGeo2 = wallGeo3;
                num7 = num14;
                bool4 = bool8;
                bool5 = bool9;
                baseLikesInfo2 = baseLikesInfo3;
                userId7 = userId14;
                num8 = num15;
                list4 = list9;
                wallPostSource2 = wallPostSource3;
                wallPostType2 = wallPostType3;
                baseRepostsInfo2 = baseRepostsInfo3;
                userId8 = userId15;
                topicId2 = topicId3;
                list5 = list7;
                baseBoolInt5 = baseBoolInt9;
                userId9 = userId12;
                baseBoolInt6 = baseBoolInt10;
                baseBoolInt7 = baseBoolInt11;
                wallWallpostDonut2 = wallWallpostDonut3;
                num9 = num12;
                baseCommentsInfo2 = baseCommentsInfo3;
                baseBoolInt8 = baseBoolInt12;
                f11 = f12;
                str5 = str7;
                str6 = str8;
                bool6 = bool7;
                list6 = list8;
                userId10 = userId11;
                i12 = i13;
                newsfeedItemWallpostFeedback2 = newsfeedItemWallpostFeedback3;
                num10 = num11;
            }
            return newsfeedItemWallpost.copy(newsfeedNewsfeedItemType3, userId10, i12, newsfeedItemWallpostFeedback2, num10, list5, baseBoolInt5, userId9, baseBoolInt6, baseBoolInt7, wallWallpostDonut2, num9, baseCommentsInfo2, baseBoolInt8, topicId2, f11, str5, str6, bool6, list6, wallPostCopyright2, num6, userId6, wallGeo2, num7, bool4, bool5, baseLikesInfo2, userId7, num8, list4, wallPostSource2, wallPostType2, baseRepostsInfo2, userId8, str4, wallViews2);
        }

        @NotNull
        public final NewsfeedNewsfeedItemType component1() {
            return this.type;
        }

        @Nullable
        public final BaseBoolInt component10() {
            return this.canPin;
        }

        @Nullable
        public final WallWallpostDonut component11() {
            return this.donut;
        }

        @Nullable
        public final Integer component12() {
            return this.isPinned;
        }

        @Nullable
        public final BaseCommentsInfo component13() {
            return this.comments;
        }

        @Nullable
        public final BaseBoolInt component14() {
            return this.markedAsAds;
        }

        @Nullable
        public final TopicId component15() {
            return this.topicId;
        }

        @Nullable
        public final Float component16() {
            return this.shortTextRate;
        }

        @Nullable
        public final String component17() {
            return this.hash;
        }

        @Nullable
        public final String component18() {
            return this.accessKey;
        }

        @Nullable
        public final Boolean component19() {
            return this.isDeleted;
        }

        @NotNull
        public final UserId component2() {
            return this.sourceId;
        }

        @Nullable
        public final List<WallWallpostAttachment> component20() {
            return this.attachments;
        }

        @Nullable
        public final WallPostCopyright component21() {
            return this.copyright;
        }

        @Nullable
        public final Integer component22() {
            return this.edited;
        }

        @Nullable
        public final UserId component23() {
            return this.fromId;
        }

        @Nullable
        public final WallGeo component24() {
            return this.geo;
        }

        @Nullable
        public final Integer component25() {
            return this.f15204id;
        }

        @Nullable
        public final Boolean component26() {
            return this.isArchived;
        }

        @Nullable
        public final Boolean component27() {
            return this.isFavorite;
        }

        @Nullable
        public final BaseLikesInfo component28() {
            return this.likes;
        }

        @Nullable
        public final UserId component29() {
            return this.ownerId;
        }

        public final int component3() {
            return this.date;
        }

        @Nullable
        public final Integer component30() {
            return this.postId;
        }

        @Nullable
        public final List<Integer> component31() {
            return this.parentsStack;
        }

        @Nullable
        public final WallPostSource component32() {
            return this.postSource;
        }

        @Nullable
        public final WallPostType component33() {
            return this.postType;
        }

        @Nullable
        public final BaseRepostsInfo component34() {
            return this.reposts;
        }

        @Nullable
        public final UserId component35() {
            return this.signerId;
        }

        @Nullable
        public final String component36() {
            return this.text;
        }

        @Nullable
        public final WallViews component37() {
            return this.views;
        }

        @Nullable
        public final NewsfeedItemWallpostFeedback component4() {
            return this.feedback;
        }

        @Nullable
        public final Integer component5() {
            return this.carouselOffset;
        }

        @Nullable
        public final List<WallWallpostFull> component6() {
            return this.copyHistory;
        }

        @Nullable
        public final BaseBoolInt component7() {
            return this.canEdit;
        }

        @Nullable
        public final UserId component8() {
            return this.createdBy;
        }

        @Nullable
        public final BaseBoolInt component9() {
            return this.canDelete;
        }

        @NotNull
        public final NewsfeedItemWallpost copy(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback, @Nullable Integer num, @Nullable List<WallWallpostFull> list, @Nullable BaseBoolInt baseBoolInt, @Nullable UserId userId, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable WallWallpostDonut wallWallpostDonut, @Nullable Integer num2, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable BaseBoolInt baseBoolInt4, @Nullable TopicId topicId, @Nullable Float f10, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable List<WallWallpostAttachment> list2, @Nullable WallPostCopyright wallPostCopyright, @Nullable Integer num3, @Nullable UserId userId2, @Nullable WallGeo wallGeo, @Nullable Integer num4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BaseLikesInfo baseLikesInfo, @Nullable UserId userId3, @Nullable Integer num5, @Nullable List<Integer> list3, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId4, @Nullable String str3, @Nullable WallViews wallViews) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new NewsfeedItemWallpost(type, sourceId, i, newsfeedItemWallpostFeedback, num, list, baseBoolInt, userId, baseBoolInt2, baseBoolInt3, wallWallpostDonut, num2, baseCommentsInfo, baseBoolInt4, topicId, f10, str, str2, bool, list2, wallPostCopyright, num3, userId2, wallGeo, num4, bool2, bool3, baseLikesInfo, userId3, num5, list3, wallPostSource, wallPostType, baseRepostsInfo, userId4, str3, wallViews);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemWallpost)) {
                return false;
            }
            NewsfeedItemWallpost newsfeedItemWallpost = (NewsfeedItemWallpost) obj;
            return this.type == newsfeedItemWallpost.type && Intrinsics.a(this.sourceId, newsfeedItemWallpost.sourceId) && this.date == newsfeedItemWallpost.date && Intrinsics.a(this.feedback, newsfeedItemWallpost.feedback) && Intrinsics.a(this.carouselOffset, newsfeedItemWallpost.carouselOffset) && Intrinsics.a(this.copyHistory, newsfeedItemWallpost.copyHistory) && this.canEdit == newsfeedItemWallpost.canEdit && Intrinsics.a(this.createdBy, newsfeedItemWallpost.createdBy) && this.canDelete == newsfeedItemWallpost.canDelete && this.canPin == newsfeedItemWallpost.canPin && Intrinsics.a(this.donut, newsfeedItemWallpost.donut) && Intrinsics.a(this.isPinned, newsfeedItemWallpost.isPinned) && Intrinsics.a(this.comments, newsfeedItemWallpost.comments) && this.markedAsAds == newsfeedItemWallpost.markedAsAds && this.topicId == newsfeedItemWallpost.topicId && Intrinsics.a(this.shortTextRate, newsfeedItemWallpost.shortTextRate) && Intrinsics.a(this.hash, newsfeedItemWallpost.hash) && Intrinsics.a(this.accessKey, newsfeedItemWallpost.accessKey) && Intrinsics.a(this.isDeleted, newsfeedItemWallpost.isDeleted) && Intrinsics.a(this.attachments, newsfeedItemWallpost.attachments) && Intrinsics.a(this.copyright, newsfeedItemWallpost.copyright) && Intrinsics.a(this.edited, newsfeedItemWallpost.edited) && Intrinsics.a(this.fromId, newsfeedItemWallpost.fromId) && Intrinsics.a(this.geo, newsfeedItemWallpost.geo) && Intrinsics.a(this.f15204id, newsfeedItemWallpost.f15204id) && Intrinsics.a(this.isArchived, newsfeedItemWallpost.isArchived) && Intrinsics.a(this.isFavorite, newsfeedItemWallpost.isFavorite) && Intrinsics.a(this.likes, newsfeedItemWallpost.likes) && Intrinsics.a(this.ownerId, newsfeedItemWallpost.ownerId) && Intrinsics.a(this.postId, newsfeedItemWallpost.postId) && Intrinsics.a(this.parentsStack, newsfeedItemWallpost.parentsStack) && Intrinsics.a(this.postSource, newsfeedItemWallpost.postSource) && this.postType == newsfeedItemWallpost.postType && Intrinsics.a(this.reposts, newsfeedItemWallpost.reposts) && Intrinsics.a(this.signerId, newsfeedItemWallpost.signerId) && Intrinsics.a(this.text, newsfeedItemWallpost.text) && Intrinsics.a(this.views, newsfeedItemWallpost.views);
        }

        @Nullable
        public final String getAccessKey() {
            return this.accessKey;
        }

        @Nullable
        public final List<WallWallpostAttachment> getAttachments() {
            return this.attachments;
        }

        @Nullable
        public final BaseBoolInt getCanDelete() {
            return this.canDelete;
        }

        @Nullable
        public final BaseBoolInt getCanEdit() {
            return this.canEdit;
        }

        @Nullable
        public final BaseBoolInt getCanPin() {
            return this.canPin;
        }

        @Nullable
        public final Integer getCarouselOffset() {
            return this.carouselOffset;
        }

        @Nullable
        public final BaseCommentsInfo getComments() {
            return this.comments;
        }

        @Nullable
        public final List<WallWallpostFull> getCopyHistory() {
            return this.copyHistory;
        }

        @Nullable
        public final WallPostCopyright getCopyright() {
            return this.copyright;
        }

        @Nullable
        public final UserId getCreatedBy() {
            return this.createdBy;
        }

        public final int getDate() {
            return this.date;
        }

        @Nullable
        public final WallWallpostDonut getDonut() {
            return this.donut;
        }

        @Nullable
        public final Integer getEdited() {
            return this.edited;
        }

        @Nullable
        public final NewsfeedItemWallpostFeedback getFeedback() {
            return this.feedback;
        }

        @Nullable
        public final UserId getFromId() {
            return this.fromId;
        }

        @Nullable
        public final WallGeo getGeo() {
            return this.geo;
        }

        @Nullable
        public final String getHash() {
            return this.hash;
        }

        @Nullable
        public final Integer getId() {
            return this.f15204id;
        }

        @Nullable
        public final BaseLikesInfo getLikes() {
            return this.likes;
        }

        @Nullable
        public final BaseBoolInt getMarkedAsAds() {
            return this.markedAsAds;
        }

        @Nullable
        public final UserId getOwnerId() {
            return this.ownerId;
        }

        @Nullable
        public final List<Integer> getParentsStack() {
            return this.parentsStack;
        }

        @Nullable
        public final Integer getPostId() {
            return this.postId;
        }

        @Nullable
        public final WallPostSource getPostSource() {
            return this.postSource;
        }

        @Nullable
        public final WallPostType getPostType() {
            return this.postType;
        }

        @Nullable
        public final BaseRepostsInfo getReposts() {
            return this.reposts;
        }

        @Nullable
        public final Float getShortTextRate() {
            return this.shortTextRate;
        }

        @Nullable
        public final UserId getSignerId() {
            return this.signerId;
        }

        @NotNull
        public final UserId getSourceId() {
            return this.sourceId;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final TopicId getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final NewsfeedNewsfeedItemType getType() {
            return this.type;
        }

        @Nullable
        public final WallViews getViews() {
            return this.views;
        }

        public int hashCode() {
            int iG = u.g(this.date, l7.o.e(this.sourceId, this.type.hashCode() * 31, 31), 31);
            NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback = this.feedback;
            int iHashCode = (iG + (newsfeedItemWallpostFeedback == null ? 0 : newsfeedItemWallpostFeedback.hashCode())) * 31;
            Integer num = this.carouselOffset;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<WallWallpostFull> list = this.copyHistory;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            BaseBoolInt baseBoolInt = this.canEdit;
            int iHashCode4 = (iHashCode3 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
            UserId userId = this.createdBy;
            int iHashCode5 = (iHashCode4 + (userId == null ? 0 : userId.hashCode())) * 31;
            BaseBoolInt baseBoolInt2 = this.canDelete;
            int iHashCode6 = (iHashCode5 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
            BaseBoolInt baseBoolInt3 = this.canPin;
            int iHashCode7 = (iHashCode6 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
            WallWallpostDonut wallWallpostDonut = this.donut;
            int iHashCode8 = (iHashCode7 + (wallWallpostDonut == null ? 0 : wallWallpostDonut.hashCode())) * 31;
            Integer num2 = this.isPinned;
            int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BaseCommentsInfo baseCommentsInfo = this.comments;
            int iHashCode10 = (iHashCode9 + (baseCommentsInfo == null ? 0 : baseCommentsInfo.hashCode())) * 31;
            BaseBoolInt baseBoolInt4 = this.markedAsAds;
            int iHashCode11 = (iHashCode10 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
            TopicId topicId = this.topicId;
            int iHashCode12 = (iHashCode11 + (topicId == null ? 0 : topicId.hashCode())) * 31;
            Float f10 = this.shortTextRate;
            int iHashCode13 = (iHashCode12 + (f10 == null ? 0 : f10.hashCode())) * 31;
            String str = this.hash;
            int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accessKey;
            int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isDeleted;
            int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<WallWallpostAttachment> list2 = this.attachments;
            int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
            WallPostCopyright wallPostCopyright = this.copyright;
            int iHashCode18 = (iHashCode17 + (wallPostCopyright == null ? 0 : wallPostCopyright.hashCode())) * 31;
            Integer num3 = this.edited;
            int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
            UserId userId2 = this.fromId;
            int iHashCode20 = (iHashCode19 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
            WallGeo wallGeo = this.geo;
            int iHashCode21 = (iHashCode20 + (wallGeo == null ? 0 : wallGeo.hashCode())) * 31;
            Integer num4 = this.f15204id;
            int iHashCode22 = (iHashCode21 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Boolean bool2 = this.isArchived;
            int iHashCode23 = (iHashCode22 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isFavorite;
            int iHashCode24 = (iHashCode23 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            BaseLikesInfo baseLikesInfo = this.likes;
            int iHashCode25 = (iHashCode24 + (baseLikesInfo == null ? 0 : baseLikesInfo.hashCode())) * 31;
            UserId userId3 = this.ownerId;
            int iHashCode26 = (iHashCode25 + (userId3 == null ? 0 : userId3.hashCode())) * 31;
            Integer num5 = this.postId;
            int iHashCode27 = (iHashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
            List<Integer> list3 = this.parentsStack;
            int iHashCode28 = (iHashCode27 + (list3 == null ? 0 : list3.hashCode())) * 31;
            WallPostSource wallPostSource = this.postSource;
            int iHashCode29 = (iHashCode28 + (wallPostSource == null ? 0 : wallPostSource.hashCode())) * 31;
            WallPostType wallPostType = this.postType;
            int iHashCode30 = (iHashCode29 + (wallPostType == null ? 0 : wallPostType.hashCode())) * 31;
            BaseRepostsInfo baseRepostsInfo = this.reposts;
            int iHashCode31 = (iHashCode30 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
            UserId userId4 = this.signerId;
            int iHashCode32 = (iHashCode31 + (userId4 == null ? 0 : userId4.hashCode())) * 31;
            String str3 = this.text;
            int iHashCode33 = (iHashCode32 + (str3 == null ? 0 : str3.hashCode())) * 31;
            WallViews wallViews = this.views;
            return iHashCode33 + (wallViews != null ? wallViews.hashCode() : 0);
        }

        @Nullable
        public final Boolean isArchived() {
            return this.isArchived;
        }

        @Nullable
        public final Boolean isDeleted() {
            return this.isDeleted;
        }

        @Nullable
        public final Boolean isFavorite() {
            return this.isFavorite;
        }

        @Nullable
        public final Integer isPinned() {
            return this.isPinned;
        }

        @NotNull
        public String toString() {
            NewsfeedNewsfeedItemType newsfeedNewsfeedItemType = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback = this.feedback;
            Integer num = this.carouselOffset;
            List<WallWallpostFull> list = this.copyHistory;
            BaseBoolInt baseBoolInt = this.canEdit;
            UserId userId2 = this.createdBy;
            BaseBoolInt baseBoolInt2 = this.canDelete;
            BaseBoolInt baseBoolInt3 = this.canPin;
            WallWallpostDonut wallWallpostDonut = this.donut;
            Integer num2 = this.isPinned;
            BaseCommentsInfo baseCommentsInfo = this.comments;
            BaseBoolInt baseBoolInt4 = this.markedAsAds;
            TopicId topicId = this.topicId;
            Float f10 = this.shortTextRate;
            String str = this.hash;
            String str2 = this.accessKey;
            Boolean bool = this.isDeleted;
            List<WallWallpostAttachment> list2 = this.attachments;
            WallPostCopyright wallPostCopyright = this.copyright;
            Integer num3 = this.edited;
            UserId userId3 = this.fromId;
            WallGeo wallGeo = this.geo;
            Integer num4 = this.f15204id;
            Boolean bool2 = this.isArchived;
            Boolean bool3 = this.isFavorite;
            BaseLikesInfo baseLikesInfo = this.likes;
            UserId userId4 = this.ownerId;
            Integer num5 = this.postId;
            List<Integer> list3 = this.parentsStack;
            WallPostSource wallPostSource = this.postSource;
            WallPostType wallPostType = this.postType;
            BaseRepostsInfo baseRepostsInfo = this.reposts;
            UserId userId5 = this.signerId;
            String str3 = this.text;
            WallViews wallViews = this.views;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemWallpost(type=");
            sb2.append(newsfeedNewsfeedItemType);
            sb2.append(", sourceId=");
            sb2.append(userId);
            sb2.append(", date=");
            sb2.append(i);
            sb2.append(", feedback=");
            sb2.append(newsfeedItemWallpostFeedback);
            sb2.append(", carouselOffset=");
            sb2.append(num);
            sb2.append(", copyHistory=");
            sb2.append(list);
            sb2.append(", canEdit=");
            sb2.append(baseBoolInt);
            sb2.append(", createdBy=");
            sb2.append(userId2);
            sb2.append(", canDelete=");
            a.s(sb2, baseBoolInt2, ", canPin=", baseBoolInt3, ", donut=");
            sb2.append(wallWallpostDonut);
            sb2.append(", isPinned=");
            sb2.append(num2);
            sb2.append(", comments=");
            sb2.append(baseCommentsInfo);
            sb2.append(", markedAsAds=");
            sb2.append(baseBoolInt4);
            sb2.append(", topicId=");
            sb2.append(topicId);
            sb2.append(", shortTextRate=");
            sb2.append(f10);
            sb2.append(", hash=");
            l7.o.t(sb2, str, ", accessKey=", str2, ", isDeleted=");
            sb2.append(bool);
            sb2.append(", attachments=");
            sb2.append(list2);
            sb2.append(", copyright=");
            sb2.append(wallPostCopyright);
            sb2.append(", edited=");
            sb2.append(num3);
            sb2.append(", fromId=");
            sb2.append(userId3);
            sb2.append(", geo=");
            sb2.append(wallGeo);
            sb2.append(", id=");
            sb2.append(num4);
            sb2.append(", isArchived=");
            sb2.append(bool2);
            sb2.append(", isFavorite=");
            sb2.append(bool3);
            sb2.append(", likes=");
            sb2.append(baseLikesInfo);
            sb2.append(", ownerId=");
            sb2.append(userId4);
            sb2.append(", postId=");
            sb2.append(num5);
            sb2.append(", parentsStack=");
            sb2.append(list3);
            sb2.append(", postSource=");
            sb2.append(wallPostSource);
            sb2.append(", postType=");
            sb2.append(wallPostType);
            sb2.append(", reposts=");
            sb2.append(baseRepostsInfo);
            sb2.append(", signerId=");
            sb2.append(userId5);
            sb2.append(", text=");
            sb2.append(str3);
            sb2.append(", views=");
            sb2.append(wallViews);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemWallpost(@NotNull NewsfeedNewsfeedItemType type, @NotNull UserId sourceId, int i, @Nullable NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback, @Nullable Integer num, @Nullable List<WallWallpostFull> list, @Nullable BaseBoolInt baseBoolInt, @Nullable UserId userId, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable WallWallpostDonut wallWallpostDonut, @Nullable Integer num2, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable BaseBoolInt baseBoolInt4, @Nullable TopicId topicId, @Nullable Float f10, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable List<WallWallpostAttachment> list2, @Nullable WallPostCopyright wallPostCopyright, @Nullable Integer num3, @Nullable UserId userId2, @Nullable WallGeo wallGeo, @Nullable Integer num4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BaseLikesInfo baseLikesInfo, @Nullable UserId userId3, @Nullable Integer num5, @Nullable List<Integer> list3, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId4, @Nullable String str3, @Nullable WallViews wallViews) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.type = type;
            this.sourceId = sourceId;
            this.date = i;
            this.feedback = newsfeedItemWallpostFeedback;
            this.carouselOffset = num;
            this.copyHistory = list;
            this.canEdit = baseBoolInt;
            this.createdBy = userId;
            this.canDelete = baseBoolInt2;
            this.canPin = baseBoolInt3;
            this.donut = wallWallpostDonut;
            this.isPinned = num2;
            this.comments = baseCommentsInfo;
            this.markedAsAds = baseBoolInt4;
            this.topicId = topicId;
            this.shortTextRate = f10;
            this.hash = str;
            this.accessKey = str2;
            this.isDeleted = bool;
            this.attachments = list2;
            this.copyright = wallPostCopyright;
            this.edited = num3;
            this.fromId = userId2;
            this.geo = wallGeo;
            this.f15204id = num4;
            this.isArchived = bool2;
            this.isFavorite = bool3;
            this.likes = baseLikesInfo;
            this.ownerId = userId3;
            this.postId = num5;
            this.parentsStack = list3;
            this.postSource = wallPostSource;
            this.postType = wallPostType;
            this.reposts = baseRepostsInfo;
            this.signerId = userId4;
            this.text = str3;
            this.views = wallViews;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemWorkiCarouselBlock extends NewsfeedNewsfeedItem {

        @b("block_title")
        @Nullable
        private final String blockTitle;

        @b("items")
        @NotNull
        private final List<ClassifiedsWorkiCarouselItem> items;

        @b("more_button")
        @Nullable
        private final BaseLinkButton moreButton;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final Type type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Type {
            WORKI_CAROUSEL("worki_carousel");


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

        public /* synthetic */ NewsfeedItemWorkiCarouselBlock(Type type, List list, String str, BaseLinkButton baseLinkButton, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : baseLinkButton, (i & 16) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemWorkiCarouselBlock copy$default(NewsfeedItemWorkiCarouselBlock newsfeedItemWorkiCarouselBlock, Type type, List list, String str, BaseLinkButton baseLinkButton, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                type = newsfeedItemWorkiCarouselBlock.type;
            }
            if ((i & 2) != 0) {
                list = newsfeedItemWorkiCarouselBlock.items;
            }
            if ((i & 4) != 0) {
                str = newsfeedItemWorkiCarouselBlock.blockTitle;
            }
            if ((i & 8) != 0) {
                baseLinkButton = newsfeedItemWorkiCarouselBlock.moreButton;
            }
            if ((i & 16) != 0) {
                str2 = newsfeedItemWorkiCarouselBlock.trackCode;
            }
            String str3 = str2;
            String str4 = str;
            return newsfeedItemWorkiCarouselBlock.copy(type, list, str4, baseLinkButton, str3);
        }

        @NotNull
        public final Type component1() {
            return this.type;
        }

        @NotNull
        public final List<ClassifiedsWorkiCarouselItem> component2() {
            return this.items;
        }

        @Nullable
        public final String component3() {
            return this.blockTitle;
        }

        @Nullable
        public final BaseLinkButton component4() {
            return this.moreButton;
        }

        @Nullable
        public final String component5() {
            return this.trackCode;
        }

        @NotNull
        public final NewsfeedItemWorkiCarouselBlock copy(@NotNull Type type, @NotNull List<ClassifiedsWorkiCarouselItem> items, @Nullable String str, @Nullable BaseLinkButton baseLinkButton, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(items, "items");
            return new NewsfeedItemWorkiCarouselBlock(type, items, str, baseLinkButton, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemWorkiCarouselBlock)) {
                return false;
            }
            NewsfeedItemWorkiCarouselBlock newsfeedItemWorkiCarouselBlock = (NewsfeedItemWorkiCarouselBlock) obj;
            return this.type == newsfeedItemWorkiCarouselBlock.type && Intrinsics.a(this.items, newsfeedItemWorkiCarouselBlock.items) && Intrinsics.a(this.blockTitle, newsfeedItemWorkiCarouselBlock.blockTitle) && Intrinsics.a(this.moreButton, newsfeedItemWorkiCarouselBlock.moreButton) && Intrinsics.a(this.trackCode, newsfeedItemWorkiCarouselBlock.trackCode);
        }

        @Nullable
        public final String getBlockTitle() {
            return this.blockTitle;
        }

        @NotNull
        public final List<ClassifiedsWorkiCarouselItem> getItems() {
            return this.items;
        }

        @Nullable
        public final BaseLinkButton getMoreButton() {
            return this.moreButton;
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
            int i = u.i(this.items, this.type.hashCode() * 31, 31);
            String str = this.blockTitle;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            BaseLinkButton baseLinkButton = this.moreButton;
            int iHashCode2 = (iHashCode + (baseLinkButton == null ? 0 : baseLinkButton.hashCode())) * 31;
            String str2 = this.trackCode;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Type type = this.type;
            List<ClassifiedsWorkiCarouselItem> list = this.items;
            String str = this.blockTitle;
            BaseLinkButton baseLinkButton = this.moreButton;
            String str2 = this.trackCode;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemWorkiCarouselBlock(type=");
            sb2.append(type);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", blockTitle=");
            sb2.append(str);
            sb2.append(", moreButton=");
            sb2.append(baseLinkButton);
            sb2.append(", trackCode=");
            return u.o(sb2, str2, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemWorkiCarouselBlock(@NotNull Type type, @NotNull List<ClassifiedsWorkiCarouselItem> items, @Nullable String str, @Nullable BaseLinkButton baseLinkButton, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(items, "items");
            this.type = type;
            this.items = items;
            this.blockTitle = str;
            this.moreButton = baseLinkButton;
            this.trackCode = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemYoulaCarouselBlock extends NewsfeedNewsfeedItem {

        @b("block_description")
        @Nullable
        private final String blockDescription;

        @b("block_title")
        @Nullable
        private final String blockTitle;

        @b("create_button_url")
        @NotNull
        private final String createButtonUrl;

        @b("group")
        @Nullable
        private final ClassifiedsYoulaCarouselBlockGroup group;

        @b("items")
        @NotNull
        private final List<ClassifiedsYoulaItemExtended> items;

        @b("more_button_url")
        @NotNull
        private final String moreButtonUrl;

        @b("track_code")
        @Nullable
        private final String trackCode;

        @b("type")
        @NotNull
        private final Type type;

        @b("view_style")
        @Nullable
        private final String viewStyle;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Type {
            YOULA_CAROUSEL("youla_carousel");


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

        public /* synthetic */ NewsfeedItemYoulaCarouselBlock(Type type, List list, String str, String str2, String str3, String str4, String str5, ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, list, str, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : classifiedsYoulaCarouselBlockGroup, (i & 256) != 0 ? null : str6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewsfeedItemYoulaCarouselBlock copy$default(NewsfeedItemYoulaCarouselBlock newsfeedItemYoulaCarouselBlock, Type type, List list, String str, String str2, String str3, String str4, String str5, ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                type = newsfeedItemYoulaCarouselBlock.type;
            }
            if ((i & 2) != 0) {
                list = newsfeedItemYoulaCarouselBlock.items;
            }
            if ((i & 4) != 0) {
                str = newsfeedItemYoulaCarouselBlock.createButtonUrl;
            }
            if ((i & 8) != 0) {
                str2 = newsfeedItemYoulaCarouselBlock.moreButtonUrl;
            }
            if ((i & 16) != 0) {
                str3 = newsfeedItemYoulaCarouselBlock.blockTitle;
            }
            if ((i & 32) != 0) {
                str4 = newsfeedItemYoulaCarouselBlock.blockDescription;
            }
            if ((i & 64) != 0) {
                str5 = newsfeedItemYoulaCarouselBlock.trackCode;
            }
            if ((i & 128) != 0) {
                classifiedsYoulaCarouselBlockGroup = newsfeedItemYoulaCarouselBlock.group;
            }
            if ((i & 256) != 0) {
                str6 = newsfeedItemYoulaCarouselBlock.viewStyle;
            }
            ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup2 = classifiedsYoulaCarouselBlockGroup;
            String str7 = str6;
            String str8 = str4;
            String str9 = str5;
            String str10 = str3;
            String str11 = str;
            return newsfeedItemYoulaCarouselBlock.copy(type, list, str11, str2, str10, str8, str9, classifiedsYoulaCarouselBlockGroup2, str7);
        }

        @NotNull
        public final Type component1() {
            return this.type;
        }

        @NotNull
        public final List<ClassifiedsYoulaItemExtended> component2() {
            return this.items;
        }

        @NotNull
        public final String component3() {
            return this.createButtonUrl;
        }

        @NotNull
        public final String component4() {
            return this.moreButtonUrl;
        }

        @Nullable
        public final String component5() {
            return this.blockTitle;
        }

        @Nullable
        public final String component6() {
            return this.blockDescription;
        }

        @Nullable
        public final String component7() {
            return this.trackCode;
        }

        @Nullable
        public final ClassifiedsYoulaCarouselBlockGroup component8() {
            return this.group;
        }

        @Nullable
        public final String component9() {
            return this.viewStyle;
        }

        @NotNull
        public final NewsfeedItemYoulaCarouselBlock copy(@NotNull Type type, @NotNull List<ClassifiedsYoulaItemExtended> items, @NotNull String createButtonUrl, @NotNull String moreButtonUrl, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(createButtonUrl, "createButtonUrl");
            Intrinsics.checkNotNullParameter(moreButtonUrl, "moreButtonUrl");
            return new NewsfeedItemYoulaCarouselBlock(type, items, createButtonUrl, moreButtonUrl, str, str2, str3, classifiedsYoulaCarouselBlockGroup, str4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemYoulaCarouselBlock)) {
                return false;
            }
            NewsfeedItemYoulaCarouselBlock newsfeedItemYoulaCarouselBlock = (NewsfeedItemYoulaCarouselBlock) obj;
            return this.type == newsfeedItemYoulaCarouselBlock.type && Intrinsics.a(this.items, newsfeedItemYoulaCarouselBlock.items) && Intrinsics.a(this.createButtonUrl, newsfeedItemYoulaCarouselBlock.createButtonUrl) && Intrinsics.a(this.moreButtonUrl, newsfeedItemYoulaCarouselBlock.moreButtonUrl) && Intrinsics.a(this.blockTitle, newsfeedItemYoulaCarouselBlock.blockTitle) && Intrinsics.a(this.blockDescription, newsfeedItemYoulaCarouselBlock.blockDescription) && Intrinsics.a(this.trackCode, newsfeedItemYoulaCarouselBlock.trackCode) && Intrinsics.a(this.group, newsfeedItemYoulaCarouselBlock.group) && Intrinsics.a(this.viewStyle, newsfeedItemYoulaCarouselBlock.viewStyle);
        }

        @Nullable
        public final String getBlockDescription() {
            return this.blockDescription;
        }

        @Nullable
        public final String getBlockTitle() {
            return this.blockTitle;
        }

        @NotNull
        public final String getCreateButtonUrl() {
            return this.createButtonUrl;
        }

        @Nullable
        public final ClassifiedsYoulaCarouselBlockGroup getGroup() {
            return this.group;
        }

        @NotNull
        public final List<ClassifiedsYoulaItemExtended> getItems() {
            return this.items;
        }

        @NotNull
        public final String getMoreButtonUrl() {
            return this.moreButtonUrl;
        }

        @Nullable
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        @Nullable
        public final String getViewStyle() {
            return this.viewStyle;
        }

        public int hashCode() {
            int iE = a.e(a.e(u.i(this.items, this.type.hashCode() * 31, 31), 31, this.createButtonUrl), 31, this.moreButtonUrl);
            String str = this.blockTitle;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.blockDescription;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackCode;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup = this.group;
            int iHashCode4 = (iHashCode3 + (classifiedsYoulaCarouselBlockGroup == null ? 0 : classifiedsYoulaCarouselBlockGroup.hashCode())) * 31;
            String str4 = this.viewStyle;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Type type = this.type;
            List<ClassifiedsYoulaItemExtended> list = this.items;
            String str = this.createButtonUrl;
            String str2 = this.moreButtonUrl;
            String str3 = this.blockTitle;
            String str4 = this.blockDescription;
            String str5 = this.trackCode;
            ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup = this.group;
            String str6 = this.viewStyle;
            StringBuilder sb2 = new StringBuilder("NewsfeedItemYoulaCarouselBlock(type=");
            sb2.append(type);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", createButtonUrl=");
            l7.o.t(sb2, str, ", moreButtonUrl=", str2, ", blockTitle=");
            l7.o.t(sb2, str3, ", blockDescription=", str4, ", trackCode=");
            sb2.append(str5);
            sb2.append(", group=");
            sb2.append(classifiedsYoulaCarouselBlockGroup);
            sb2.append(", viewStyle=");
            return u.o(sb2, str6, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemYoulaCarouselBlock(@NotNull Type type, @NotNull List<ClassifiedsYoulaItemExtended> items, @NotNull String createButtonUrl, @NotNull String moreButtonUrl, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup, @Nullable String str4) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(createButtonUrl, "createButtonUrl");
            Intrinsics.checkNotNullParameter(moreButtonUrl, "moreButtonUrl");
            this.type = type;
            this.items = items;
            this.createButtonUrl = createButtonUrl;
            this.moreButtonUrl = moreButtonUrl;
            this.blockTitle = str;
            this.blockDescription = str2;
            this.trackCode = str3;
            this.group = classifiedsYoulaCarouselBlockGroup;
            this.viewStyle = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class NewsfeedItemYoulaGroupsBlock extends NewsfeedNewsfeedItem {

        @b("data")
        @Nullable
        private final ClassifiedsYoulaGroupsBlock data;

        @b("is_async")
        private final boolean isAsync;

        @b("title")
        @NotNull
        private final String title;

        @b("track_code")
        @NotNull
        private final String trackCode;

        @b("type")
        @NotNull
        private final Type type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public enum Type {
            YOULA_GROUPS_BLOCK("youla_groups_block");


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

        public /* synthetic */ NewsfeedItemYoulaGroupsBlock(Type type, String str, String str2, boolean z5, ClassifiedsYoulaGroupsBlock classifiedsYoulaGroupsBlock, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, str2, z5, (i & 16) != 0 ? null : classifiedsYoulaGroupsBlock);
        }

        public static /* synthetic */ NewsfeedItemYoulaGroupsBlock copy$default(NewsfeedItemYoulaGroupsBlock newsfeedItemYoulaGroupsBlock, Type type, String str, String str2, boolean z5, ClassifiedsYoulaGroupsBlock classifiedsYoulaGroupsBlock, int i, Object obj) {
            if ((i & 1) != 0) {
                type = newsfeedItemYoulaGroupsBlock.type;
            }
            if ((i & 2) != 0) {
                str = newsfeedItemYoulaGroupsBlock.title;
            }
            if ((i & 4) != 0) {
                str2 = newsfeedItemYoulaGroupsBlock.trackCode;
            }
            if ((i & 8) != 0) {
                z5 = newsfeedItemYoulaGroupsBlock.isAsync;
            }
            if ((i & 16) != 0) {
                classifiedsYoulaGroupsBlock = newsfeedItemYoulaGroupsBlock.data;
            }
            ClassifiedsYoulaGroupsBlock classifiedsYoulaGroupsBlock2 = classifiedsYoulaGroupsBlock;
            String str3 = str2;
            return newsfeedItemYoulaGroupsBlock.copy(type, str, str3, z5, classifiedsYoulaGroupsBlock2);
        }

        @NotNull
        public final Type component1() {
            return this.type;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final String component3() {
            return this.trackCode;
        }

        public final boolean component4() {
            return this.isAsync;
        }

        @Nullable
        public final ClassifiedsYoulaGroupsBlock component5() {
            return this.data;
        }

        @NotNull
        public final NewsfeedItemYoulaGroupsBlock copy(@NotNull Type type, @NotNull String title, @NotNull String trackCode, boolean z5, @Nullable ClassifiedsYoulaGroupsBlock classifiedsYoulaGroupsBlock) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            return new NewsfeedItemYoulaGroupsBlock(type, title, trackCode, z5, classifiedsYoulaGroupsBlock);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemYoulaGroupsBlock)) {
                return false;
            }
            NewsfeedItemYoulaGroupsBlock newsfeedItemYoulaGroupsBlock = (NewsfeedItemYoulaGroupsBlock) obj;
            return this.type == newsfeedItemYoulaGroupsBlock.type && Intrinsics.a(this.title, newsfeedItemYoulaGroupsBlock.title) && Intrinsics.a(this.trackCode, newsfeedItemYoulaGroupsBlock.trackCode) && this.isAsync == newsfeedItemYoulaGroupsBlock.isAsync && Intrinsics.a(this.data, newsfeedItemYoulaGroupsBlock.data);
        }

        @Nullable
        public final ClassifiedsYoulaGroupsBlock getData() {
            return this.data;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTrackCode() {
            return this.trackCode;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        public int hashCode() {
            int iE = a.e(a.e(this.type.hashCode() * 31, 31, this.title), 31, this.trackCode);
            boolean z5 = this.isAsync;
            ?? r22 = z5;
            if (z5) {
                r22 = 1;
            }
            int i = (iE + r22) * 31;
            ClassifiedsYoulaGroupsBlock classifiedsYoulaGroupsBlock = this.data;
            return i + (classifiedsYoulaGroupsBlock == null ? 0 : classifiedsYoulaGroupsBlock.hashCode());
        }

        public final boolean isAsync() {
            return this.isAsync;
        }

        @NotNull
        public String toString() {
            return "NewsfeedItemYoulaGroupsBlock(type=" + this.type + ", title=" + this.title + ", trackCode=" + this.trackCode + ", isAsync=" + this.isAsync + ", data=" + this.data + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsfeedItemYoulaGroupsBlock(@NotNull Type type, @NotNull String title, @NotNull String trackCode, boolean z5, @Nullable ClassifiedsYoulaGroupsBlock classifiedsYoulaGroupsBlock) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(trackCode, "trackCode");
            this.type = type;
            this.title = title;
            this.trackCode = trackCode;
            this.isAsync = z5;
            this.data = classifiedsYoulaGroupsBlock;
        }
    }

    public /* synthetic */ NewsfeedNewsfeedItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NewsfeedNewsfeedItem() {
    }
}
