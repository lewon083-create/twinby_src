package com.vk.sdk.api.fave.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.market.dto.MarketMarketItem;
import com.vk.sdk.api.video.dto.VideoVideo;
import com.vk.sdk.api.wall.dto.WallWallpostFull;
import io.sentry.rrweb.RRWebVideoEvent;
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
public final class FaveBookmark {

    @b("added_date")
    private final int addedDate;

    @b("link")
    @Nullable
    private final BaseLink link;

    @b("post")
    @Nullable
    private final WallWallpostFull post;

    @b("product")
    @Nullable
    private final MarketMarketItem product;

    @b("seen")
    private final boolean seen;

    @b("tags")
    @NotNull
    private final List<FaveTag> tags;

    @b("type")
    @NotNull
    private final FaveBookmarkType type;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideo video;

    public FaveBookmark(int i, boolean z5, @NotNull List<FaveTag> tags, @NotNull FaveBookmarkType type, @Nullable BaseLink baseLink, @Nullable WallWallpostFull wallWallpostFull, @Nullable MarketMarketItem marketMarketItem, @Nullable VideoVideo videoVideo) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(type, "type");
        this.addedDate = i;
        this.seen = z5;
        this.tags = tags;
        this.type = type;
        this.link = baseLink;
        this.post = wallWallpostFull;
        this.product = marketMarketItem;
        this.video = videoVideo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaveBookmark copy$default(FaveBookmark faveBookmark, int i, boolean z5, List list, FaveBookmarkType faveBookmarkType, BaseLink baseLink, WallWallpostFull wallWallpostFull, MarketMarketItem marketMarketItem, VideoVideo videoVideo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = faveBookmark.addedDate;
        }
        if ((i10 & 2) != 0) {
            z5 = faveBookmark.seen;
        }
        if ((i10 & 4) != 0) {
            list = faveBookmark.tags;
        }
        if ((i10 & 8) != 0) {
            faveBookmarkType = faveBookmark.type;
        }
        if ((i10 & 16) != 0) {
            baseLink = faveBookmark.link;
        }
        if ((i10 & 32) != 0) {
            wallWallpostFull = faveBookmark.post;
        }
        if ((i10 & 64) != 0) {
            marketMarketItem = faveBookmark.product;
        }
        if ((i10 & 128) != 0) {
            videoVideo = faveBookmark.video;
        }
        MarketMarketItem marketMarketItem2 = marketMarketItem;
        VideoVideo videoVideo2 = videoVideo;
        BaseLink baseLink2 = baseLink;
        WallWallpostFull wallWallpostFull2 = wallWallpostFull;
        return faveBookmark.copy(i, z5, list, faveBookmarkType, baseLink2, wallWallpostFull2, marketMarketItem2, videoVideo2);
    }

    public final int component1() {
        return this.addedDate;
    }

    public final boolean component2() {
        return this.seen;
    }

    @NotNull
    public final List<FaveTag> component3() {
        return this.tags;
    }

    @NotNull
    public final FaveBookmarkType component4() {
        return this.type;
    }

    @Nullable
    public final BaseLink component5() {
        return this.link;
    }

    @Nullable
    public final WallWallpostFull component6() {
        return this.post;
    }

    @Nullable
    public final MarketMarketItem component7() {
        return this.product;
    }

    @Nullable
    public final VideoVideo component8() {
        return this.video;
    }

    @NotNull
    public final FaveBookmark copy(int i, boolean z5, @NotNull List<FaveTag> tags, @NotNull FaveBookmarkType type, @Nullable BaseLink baseLink, @Nullable WallWallpostFull wallWallpostFull, @Nullable MarketMarketItem marketMarketItem, @Nullable VideoVideo videoVideo) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FaveBookmark(i, z5, tags, type, baseLink, wallWallpostFull, marketMarketItem, videoVideo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveBookmark)) {
            return false;
        }
        FaveBookmark faveBookmark = (FaveBookmark) obj;
        return this.addedDate == faveBookmark.addedDate && this.seen == faveBookmark.seen && Intrinsics.a(this.tags, faveBookmark.tags) && this.type == faveBookmark.type && Intrinsics.a(this.link, faveBookmark.link) && Intrinsics.a(this.post, faveBookmark.post) && Intrinsics.a(this.product, faveBookmark.product) && Intrinsics.a(this.video, faveBookmark.video);
    }

    public final int getAddedDate() {
        return this.addedDate;
    }

    @Nullable
    public final BaseLink getLink() {
        return this.link;
    }

    @Nullable
    public final WallWallpostFull getPost() {
        return this.post;
    }

    @Nullable
    public final MarketMarketItem getProduct() {
        return this.product;
    }

    public final boolean getSeen() {
        return this.seen;
    }

    @NotNull
    public final List<FaveTag> getTags() {
        return this.tags;
    }

    @NotNull
    public final FaveBookmarkType getType() {
        return this.type;
    }

    @Nullable
    public final VideoVideo getVideo() {
        return this.video;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.addedDate) * 31;
        boolean z5 = this.seen;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int iHashCode2 = (this.type.hashCode() + u.i(this.tags, (iHashCode + r22) * 31, 31)) * 31;
        BaseLink baseLink = this.link;
        int iHashCode3 = (iHashCode2 + (baseLink == null ? 0 : baseLink.hashCode())) * 31;
        WallWallpostFull wallWallpostFull = this.post;
        int iHashCode4 = (iHashCode3 + (wallWallpostFull == null ? 0 : wallWallpostFull.hashCode())) * 31;
        MarketMarketItem marketMarketItem = this.product;
        int iHashCode5 = (iHashCode4 + (marketMarketItem == null ? 0 : marketMarketItem.hashCode())) * 31;
        VideoVideo videoVideo = this.video;
        return iHashCode5 + (videoVideo != null ? videoVideo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaveBookmark(addedDate=" + this.addedDate + ", seen=" + this.seen + ", tags=" + this.tags + ", type=" + this.type + ", link=" + this.link + ", post=" + this.post + ", product=" + this.product + ", video=" + this.video + ")";
    }

    public /* synthetic */ FaveBookmark(int i, boolean z5, List list, FaveBookmarkType faveBookmarkType, BaseLink baseLink, WallWallpostFull wallWallpostFull, MarketMarketItem marketMarketItem, VideoVideo videoVideo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z5, list, faveBookmarkType, (i10 & 16) != 0 ? null : baseLink, (i10 & 32) != 0 ? null : wallWallpostFull, (i10 & 64) != 0 ? null : marketMarketItem, (i10 & 128) != 0 ? null : videoVideo);
    }
}
