package com.vk.sdk.api.prettyCards.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
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
public final class PrettyCardsDeleteResponse {

    @b("card_id")
    @NotNull
    private final String cardId;

    @b("error")
    @Nullable
    private final String error;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    public PrettyCardsDeleteResponse(@NotNull UserId ownerId, @NotNull String cardId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.ownerId = ownerId;
        this.cardId = cardId;
        this.error = str;
    }

    public static /* synthetic */ PrettyCardsDeleteResponse copy$default(PrettyCardsDeleteResponse prettyCardsDeleteResponse, UserId userId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = prettyCardsDeleteResponse.ownerId;
        }
        if ((i & 2) != 0) {
            str = prettyCardsDeleteResponse.cardId;
        }
        if ((i & 4) != 0) {
            str2 = prettyCardsDeleteResponse.error;
        }
        return prettyCardsDeleteResponse.copy(userId, str, str2);
    }

    @NotNull
    public final UserId component1() {
        return this.ownerId;
    }

    @NotNull
    public final String component2() {
        return this.cardId;
    }

    @Nullable
    public final String component3() {
        return this.error;
    }

    @NotNull
    public final PrettyCardsDeleteResponse copy(@NotNull UserId ownerId, @NotNull String cardId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return new PrettyCardsDeleteResponse(ownerId, cardId, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsDeleteResponse)) {
            return false;
        }
        PrettyCardsDeleteResponse prettyCardsDeleteResponse = (PrettyCardsDeleteResponse) obj;
        return Intrinsics.a(this.ownerId, prettyCardsDeleteResponse.ownerId) && Intrinsics.a(this.cardId, prettyCardsDeleteResponse.cardId) && Intrinsics.a(this.error, prettyCardsDeleteResponse.error);
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    public int hashCode() {
        int iE = a.e(this.ownerId.hashCode() * 31, 31, this.cardId);
        String str = this.error;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        UserId userId = this.ownerId;
        String str = this.cardId;
        String str2 = this.error;
        StringBuilder sb2 = new StringBuilder("PrettyCardsDeleteResponse(ownerId=");
        sb2.append(userId);
        sb2.append(", cardId=");
        sb2.append(str);
        sb2.append(", error=");
        return u.o(sb2, str2, ")");
    }

    public /* synthetic */ PrettyCardsDeleteResponse(UserId userId, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, str, (i & 4) != 0 ? null : str2);
    }
}
