package com.vk.sdk.api.account.dto;

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
public final class AccountUserSettingsInterests {

    @b("about")
    @Nullable
    private final AccountUserSettingsInterest about;

    @b("activities")
    @Nullable
    private final AccountUserSettingsInterest activities;

    @b("books")
    @Nullable
    private final AccountUserSettingsInterest books;

    @b("games")
    @Nullable
    private final AccountUserSettingsInterest games;

    @b("interests")
    @Nullable
    private final AccountUserSettingsInterest interests;

    @b("movies")
    @Nullable
    private final AccountUserSettingsInterest movies;

    @b("music")
    @Nullable
    private final AccountUserSettingsInterest music;

    @b("quotes")
    @Nullable
    private final AccountUserSettingsInterest quotes;

    @b("tv")
    @Nullable
    private final AccountUserSettingsInterest tv;

    public AccountUserSettingsInterests() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ AccountUserSettingsInterests copy$default(AccountUserSettingsInterests accountUserSettingsInterests, AccountUserSettingsInterest accountUserSettingsInterest, AccountUserSettingsInterest accountUserSettingsInterest2, AccountUserSettingsInterest accountUserSettingsInterest3, AccountUserSettingsInterest accountUserSettingsInterest4, AccountUserSettingsInterest accountUserSettingsInterest5, AccountUserSettingsInterest accountUserSettingsInterest6, AccountUserSettingsInterest accountUserSettingsInterest7, AccountUserSettingsInterest accountUserSettingsInterest8, AccountUserSettingsInterest accountUserSettingsInterest9, int i, Object obj) {
        if ((i & 1) != 0) {
            accountUserSettingsInterest = accountUserSettingsInterests.activities;
        }
        if ((i & 2) != 0) {
            accountUserSettingsInterest2 = accountUserSettingsInterests.interests;
        }
        if ((i & 4) != 0) {
            accountUserSettingsInterest3 = accountUserSettingsInterests.music;
        }
        if ((i & 8) != 0) {
            accountUserSettingsInterest4 = accountUserSettingsInterests.tv;
        }
        if ((i & 16) != 0) {
            accountUserSettingsInterest5 = accountUserSettingsInterests.movies;
        }
        if ((i & 32) != 0) {
            accountUserSettingsInterest6 = accountUserSettingsInterests.books;
        }
        if ((i & 64) != 0) {
            accountUserSettingsInterest7 = accountUserSettingsInterests.games;
        }
        if ((i & 128) != 0) {
            accountUserSettingsInterest8 = accountUserSettingsInterests.quotes;
        }
        if ((i & 256) != 0) {
            accountUserSettingsInterest9 = accountUserSettingsInterests.about;
        }
        AccountUserSettingsInterest accountUserSettingsInterest10 = accountUserSettingsInterest8;
        AccountUserSettingsInterest accountUserSettingsInterest11 = accountUserSettingsInterest9;
        AccountUserSettingsInterest accountUserSettingsInterest12 = accountUserSettingsInterest6;
        AccountUserSettingsInterest accountUserSettingsInterest13 = accountUserSettingsInterest7;
        AccountUserSettingsInterest accountUserSettingsInterest14 = accountUserSettingsInterest5;
        AccountUserSettingsInterest accountUserSettingsInterest15 = accountUserSettingsInterest3;
        return accountUserSettingsInterests.copy(accountUserSettingsInterest, accountUserSettingsInterest2, accountUserSettingsInterest15, accountUserSettingsInterest4, accountUserSettingsInterest14, accountUserSettingsInterest12, accountUserSettingsInterest13, accountUserSettingsInterest10, accountUserSettingsInterest11);
    }

    @Nullable
    public final AccountUserSettingsInterest component1() {
        return this.activities;
    }

    @Nullable
    public final AccountUserSettingsInterest component2() {
        return this.interests;
    }

    @Nullable
    public final AccountUserSettingsInterest component3() {
        return this.music;
    }

    @Nullable
    public final AccountUserSettingsInterest component4() {
        return this.tv;
    }

    @Nullable
    public final AccountUserSettingsInterest component5() {
        return this.movies;
    }

    @Nullable
    public final AccountUserSettingsInterest component6() {
        return this.books;
    }

    @Nullable
    public final AccountUserSettingsInterest component7() {
        return this.games;
    }

    @Nullable
    public final AccountUserSettingsInterest component8() {
        return this.quotes;
    }

    @Nullable
    public final AccountUserSettingsInterest component9() {
        return this.about;
    }

    @NotNull
    public final AccountUserSettingsInterests copy(@Nullable AccountUserSettingsInterest accountUserSettingsInterest, @Nullable AccountUserSettingsInterest accountUserSettingsInterest2, @Nullable AccountUserSettingsInterest accountUserSettingsInterest3, @Nullable AccountUserSettingsInterest accountUserSettingsInterest4, @Nullable AccountUserSettingsInterest accountUserSettingsInterest5, @Nullable AccountUserSettingsInterest accountUserSettingsInterest6, @Nullable AccountUserSettingsInterest accountUserSettingsInterest7, @Nullable AccountUserSettingsInterest accountUserSettingsInterest8, @Nullable AccountUserSettingsInterest accountUserSettingsInterest9) {
        return new AccountUserSettingsInterests(accountUserSettingsInterest, accountUserSettingsInterest2, accountUserSettingsInterest3, accountUserSettingsInterest4, accountUserSettingsInterest5, accountUserSettingsInterest6, accountUserSettingsInterest7, accountUserSettingsInterest8, accountUserSettingsInterest9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettingsInterests)) {
            return false;
        }
        AccountUserSettingsInterests accountUserSettingsInterests = (AccountUserSettingsInterests) obj;
        return Intrinsics.a(this.activities, accountUserSettingsInterests.activities) && Intrinsics.a(this.interests, accountUserSettingsInterests.interests) && Intrinsics.a(this.music, accountUserSettingsInterests.music) && Intrinsics.a(this.tv, accountUserSettingsInterests.tv) && Intrinsics.a(this.movies, accountUserSettingsInterests.movies) && Intrinsics.a(this.books, accountUserSettingsInterests.books) && Intrinsics.a(this.games, accountUserSettingsInterests.games) && Intrinsics.a(this.quotes, accountUserSettingsInterests.quotes) && Intrinsics.a(this.about, accountUserSettingsInterests.about);
    }

    @Nullable
    public final AccountUserSettingsInterest getAbout() {
        return this.about;
    }

    @Nullable
    public final AccountUserSettingsInterest getActivities() {
        return this.activities;
    }

    @Nullable
    public final AccountUserSettingsInterest getBooks() {
        return this.books;
    }

    @Nullable
    public final AccountUserSettingsInterest getGames() {
        return this.games;
    }

    @Nullable
    public final AccountUserSettingsInterest getInterests() {
        return this.interests;
    }

    @Nullable
    public final AccountUserSettingsInterest getMovies() {
        return this.movies;
    }

    @Nullable
    public final AccountUserSettingsInterest getMusic() {
        return this.music;
    }

    @Nullable
    public final AccountUserSettingsInterest getQuotes() {
        return this.quotes;
    }

    @Nullable
    public final AccountUserSettingsInterest getTv() {
        return this.tv;
    }

    public int hashCode() {
        AccountUserSettingsInterest accountUserSettingsInterest = this.activities;
        int iHashCode = (accountUserSettingsInterest == null ? 0 : accountUserSettingsInterest.hashCode()) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest2 = this.interests;
        int iHashCode2 = (iHashCode + (accountUserSettingsInterest2 == null ? 0 : accountUserSettingsInterest2.hashCode())) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest3 = this.music;
        int iHashCode3 = (iHashCode2 + (accountUserSettingsInterest3 == null ? 0 : accountUserSettingsInterest3.hashCode())) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest4 = this.tv;
        int iHashCode4 = (iHashCode3 + (accountUserSettingsInterest4 == null ? 0 : accountUserSettingsInterest4.hashCode())) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest5 = this.movies;
        int iHashCode5 = (iHashCode4 + (accountUserSettingsInterest5 == null ? 0 : accountUserSettingsInterest5.hashCode())) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest6 = this.books;
        int iHashCode6 = (iHashCode5 + (accountUserSettingsInterest6 == null ? 0 : accountUserSettingsInterest6.hashCode())) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest7 = this.games;
        int iHashCode7 = (iHashCode6 + (accountUserSettingsInterest7 == null ? 0 : accountUserSettingsInterest7.hashCode())) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest8 = this.quotes;
        int iHashCode8 = (iHashCode7 + (accountUserSettingsInterest8 == null ? 0 : accountUserSettingsInterest8.hashCode())) * 31;
        AccountUserSettingsInterest accountUserSettingsInterest9 = this.about;
        return iHashCode8 + (accountUserSettingsInterest9 != null ? accountUserSettingsInterest9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccountUserSettingsInterests(activities=" + this.activities + ", interests=" + this.interests + ", music=" + this.music + ", tv=" + this.tv + ", movies=" + this.movies + ", books=" + this.books + ", games=" + this.games + ", quotes=" + this.quotes + ", about=" + this.about + ")";
    }

    public AccountUserSettingsInterests(@Nullable AccountUserSettingsInterest accountUserSettingsInterest, @Nullable AccountUserSettingsInterest accountUserSettingsInterest2, @Nullable AccountUserSettingsInterest accountUserSettingsInterest3, @Nullable AccountUserSettingsInterest accountUserSettingsInterest4, @Nullable AccountUserSettingsInterest accountUserSettingsInterest5, @Nullable AccountUserSettingsInterest accountUserSettingsInterest6, @Nullable AccountUserSettingsInterest accountUserSettingsInterest7, @Nullable AccountUserSettingsInterest accountUserSettingsInterest8, @Nullable AccountUserSettingsInterest accountUserSettingsInterest9) {
        this.activities = accountUserSettingsInterest;
        this.interests = accountUserSettingsInterest2;
        this.music = accountUserSettingsInterest3;
        this.tv = accountUserSettingsInterest4;
        this.movies = accountUserSettingsInterest5;
        this.books = accountUserSettingsInterest6;
        this.games = accountUserSettingsInterest7;
        this.quotes = accountUserSettingsInterest8;
        this.about = accountUserSettingsInterest9;
    }

    public /* synthetic */ AccountUserSettingsInterests(AccountUserSettingsInterest accountUserSettingsInterest, AccountUserSettingsInterest accountUserSettingsInterest2, AccountUserSettingsInterest accountUserSettingsInterest3, AccountUserSettingsInterest accountUserSettingsInterest4, AccountUserSettingsInterest accountUserSettingsInterest5, AccountUserSettingsInterest accountUserSettingsInterest6, AccountUserSettingsInterest accountUserSettingsInterest7, AccountUserSettingsInterest accountUserSettingsInterest8, AccountUserSettingsInterest accountUserSettingsInterest9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountUserSettingsInterest, (i & 2) != 0 ? null : accountUserSettingsInterest2, (i & 4) != 0 ? null : accountUserSettingsInterest3, (i & 8) != 0 ? null : accountUserSettingsInterest4, (i & 16) != 0 ? null : accountUserSettingsInterest5, (i & 32) != 0 ? null : accountUserSettingsInterest6, (i & 64) != 0 ? null : accountUserSettingsInterest7, (i & 128) != 0 ? null : accountUserSettingsInterest8, (i & 256) != 0 ? null : accountUserSettingsInterest9);
    }
}
