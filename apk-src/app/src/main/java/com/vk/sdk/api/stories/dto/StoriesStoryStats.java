package com.vk.sdk.api.stories.dto;

import kotlin.Metadata;
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
public final class StoriesStoryStats {

    @b("answer")
    @NotNull
    private final StoriesStoryStatsStat answer;

    @b("bans")
    @NotNull
    private final StoriesStoryStatsStat bans;

    @b("likes")
    @NotNull
    private final StoriesStoryStatsStat likes;

    @b("open_link")
    @NotNull
    private final StoriesStoryStatsStat openLink;

    @b("replies")
    @NotNull
    private final StoriesStoryStatsStat replies;

    @b("shares")
    @NotNull
    private final StoriesStoryStatsStat shares;

    @b("subscribers")
    @NotNull
    private final StoriesStoryStatsStat subscribers;

    @b("views")
    @NotNull
    private final StoriesStoryStatsStat views;

    public StoriesStoryStats(@NotNull StoriesStoryStatsStat answer, @NotNull StoriesStoryStatsStat bans, @NotNull StoriesStoryStatsStat openLink, @NotNull StoriesStoryStatsStat replies, @NotNull StoriesStoryStatsStat shares, @NotNull StoriesStoryStatsStat subscribers, @NotNull StoriesStoryStatsStat views, @NotNull StoriesStoryStatsStat likes) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(bans, "bans");
        Intrinsics.checkNotNullParameter(openLink, "openLink");
        Intrinsics.checkNotNullParameter(replies, "replies");
        Intrinsics.checkNotNullParameter(shares, "shares");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(likes, "likes");
        this.answer = answer;
        this.bans = bans;
        this.openLink = openLink;
        this.replies = replies;
        this.shares = shares;
        this.subscribers = subscribers;
        this.views = views;
        this.likes = likes;
    }

    public static /* synthetic */ StoriesStoryStats copy$default(StoriesStoryStats storiesStoryStats, StoriesStoryStatsStat storiesStoryStatsStat, StoriesStoryStatsStat storiesStoryStatsStat2, StoriesStoryStatsStat storiesStoryStatsStat3, StoriesStoryStatsStat storiesStoryStatsStat4, StoriesStoryStatsStat storiesStoryStatsStat5, StoriesStoryStatsStat storiesStoryStatsStat6, StoriesStoryStatsStat storiesStoryStatsStat7, StoriesStoryStatsStat storiesStoryStatsStat8, int i, Object obj) {
        if ((i & 1) != 0) {
            storiesStoryStatsStat = storiesStoryStats.answer;
        }
        if ((i & 2) != 0) {
            storiesStoryStatsStat2 = storiesStoryStats.bans;
        }
        if ((i & 4) != 0) {
            storiesStoryStatsStat3 = storiesStoryStats.openLink;
        }
        if ((i & 8) != 0) {
            storiesStoryStatsStat4 = storiesStoryStats.replies;
        }
        if ((i & 16) != 0) {
            storiesStoryStatsStat5 = storiesStoryStats.shares;
        }
        if ((i & 32) != 0) {
            storiesStoryStatsStat6 = storiesStoryStats.subscribers;
        }
        if ((i & 64) != 0) {
            storiesStoryStatsStat7 = storiesStoryStats.views;
        }
        if ((i & 128) != 0) {
            storiesStoryStatsStat8 = storiesStoryStats.likes;
        }
        StoriesStoryStatsStat storiesStoryStatsStat9 = storiesStoryStatsStat7;
        StoriesStoryStatsStat storiesStoryStatsStat10 = storiesStoryStatsStat8;
        StoriesStoryStatsStat storiesStoryStatsStat11 = storiesStoryStatsStat5;
        StoriesStoryStatsStat storiesStoryStatsStat12 = storiesStoryStatsStat6;
        return storiesStoryStats.copy(storiesStoryStatsStat, storiesStoryStatsStat2, storiesStoryStatsStat3, storiesStoryStatsStat4, storiesStoryStatsStat11, storiesStoryStatsStat12, storiesStoryStatsStat9, storiesStoryStatsStat10);
    }

    @NotNull
    public final StoriesStoryStatsStat component1() {
        return this.answer;
    }

    @NotNull
    public final StoriesStoryStatsStat component2() {
        return this.bans;
    }

    @NotNull
    public final StoriesStoryStatsStat component3() {
        return this.openLink;
    }

    @NotNull
    public final StoriesStoryStatsStat component4() {
        return this.replies;
    }

    @NotNull
    public final StoriesStoryStatsStat component5() {
        return this.shares;
    }

    @NotNull
    public final StoriesStoryStatsStat component6() {
        return this.subscribers;
    }

    @NotNull
    public final StoriesStoryStatsStat component7() {
        return this.views;
    }

    @NotNull
    public final StoriesStoryStatsStat component8() {
        return this.likes;
    }

    @NotNull
    public final StoriesStoryStats copy(@NotNull StoriesStoryStatsStat answer, @NotNull StoriesStoryStatsStat bans, @NotNull StoriesStoryStatsStat openLink, @NotNull StoriesStoryStatsStat replies, @NotNull StoriesStoryStatsStat shares, @NotNull StoriesStoryStatsStat subscribers, @NotNull StoriesStoryStatsStat views, @NotNull StoriesStoryStatsStat likes) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(bans, "bans");
        Intrinsics.checkNotNullParameter(openLink, "openLink");
        Intrinsics.checkNotNullParameter(replies, "replies");
        Intrinsics.checkNotNullParameter(shares, "shares");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(likes, "likes");
        return new StoriesStoryStats(answer, bans, openLink, replies, shares, subscribers, views, likes);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryStats)) {
            return false;
        }
        StoriesStoryStats storiesStoryStats = (StoriesStoryStats) obj;
        return Intrinsics.a(this.answer, storiesStoryStats.answer) && Intrinsics.a(this.bans, storiesStoryStats.bans) && Intrinsics.a(this.openLink, storiesStoryStats.openLink) && Intrinsics.a(this.replies, storiesStoryStats.replies) && Intrinsics.a(this.shares, storiesStoryStats.shares) && Intrinsics.a(this.subscribers, storiesStoryStats.subscribers) && Intrinsics.a(this.views, storiesStoryStats.views) && Intrinsics.a(this.likes, storiesStoryStats.likes);
    }

    @NotNull
    public final StoriesStoryStatsStat getAnswer() {
        return this.answer;
    }

    @NotNull
    public final StoriesStoryStatsStat getBans() {
        return this.bans;
    }

    @NotNull
    public final StoriesStoryStatsStat getLikes() {
        return this.likes;
    }

    @NotNull
    public final StoriesStoryStatsStat getOpenLink() {
        return this.openLink;
    }

    @NotNull
    public final StoriesStoryStatsStat getReplies() {
        return this.replies;
    }

    @NotNull
    public final StoriesStoryStatsStat getShares() {
        return this.shares;
    }

    @NotNull
    public final StoriesStoryStatsStat getSubscribers() {
        return this.subscribers;
    }

    @NotNull
    public final StoriesStoryStatsStat getViews() {
        return this.views;
    }

    public int hashCode() {
        return this.likes.hashCode() + ((this.views.hashCode() + ((this.subscribers.hashCode() + ((this.shares.hashCode() + ((this.replies.hashCode() + ((this.openLink.hashCode() + ((this.bans.hashCode() + (this.answer.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "StoriesStoryStats(answer=" + this.answer + ", bans=" + this.bans + ", openLink=" + this.openLink + ", replies=" + this.replies + ", shares=" + this.shares + ", subscribers=" + this.subscribers + ", views=" + this.views + ", likes=" + this.likes + ")";
    }
}
