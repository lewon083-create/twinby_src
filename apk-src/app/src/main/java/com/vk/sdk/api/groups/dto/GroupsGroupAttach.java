package com.vk.sdk.api.groups.dto;

import a0.u;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class GroupsGroupAttach {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15175id;

    @b("is_favorite")
    private final boolean isFavorite;

    @b(RRWebVideoEvent.JsonKeys.SIZE)
    private final int size;

    @b("status")
    @NotNull
    private final String status;

    @b("text")
    @NotNull
    private final String text;

    public GroupsGroupAttach(int i, @NotNull String text, @NotNull String status, int i10, boolean z5) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f15175id = i;
        this.text = text;
        this.status = status;
        this.size = i10;
        this.isFavorite = z5;
    }

    public static /* synthetic */ GroupsGroupAttach copy$default(GroupsGroupAttach groupsGroupAttach, int i, String str, String str2, int i10, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = groupsGroupAttach.f15175id;
        }
        if ((i11 & 2) != 0) {
            str = groupsGroupAttach.text;
        }
        if ((i11 & 4) != 0) {
            str2 = groupsGroupAttach.status;
        }
        if ((i11 & 8) != 0) {
            i10 = groupsGroupAttach.size;
        }
        if ((i11 & 16) != 0) {
            z5 = groupsGroupAttach.isFavorite;
        }
        boolean z10 = z5;
        String str3 = str2;
        return groupsGroupAttach.copy(i, str, str3, i10, z10);
    }

    public final int component1() {
        return this.f15175id;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final String component3() {
        return this.status;
    }

    public final int component4() {
        return this.size;
    }

    public final boolean component5() {
        return this.isFavorite;
    }

    @NotNull
    public final GroupsGroupAttach copy(int i, @NotNull String text, @NotNull String status, int i10, boolean z5) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(status, "status");
        return new GroupsGroupAttach(i, text, status, i10, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupAttach)) {
            return false;
        }
        GroupsGroupAttach groupsGroupAttach = (GroupsGroupAttach) obj;
        return this.f15175id == groupsGroupAttach.f15175id && Intrinsics.a(this.text, groupsGroupAttach.text) && Intrinsics.a(this.status, groupsGroupAttach.status) && this.size == groupsGroupAttach.size && this.isFavorite == groupsGroupAttach.isFavorite;
    }

    public final int getId() {
        return this.f15175id;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iG = u.g(this.size, a.e(a.e(Integer.hashCode(this.f15175id) * 31, 31, this.text), 31, this.status), 31);
        boolean z5 = this.isFavorite;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        return iG + r12;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        int i = this.f15175id;
        String str = this.text;
        String str2 = this.status;
        int i10 = this.size;
        boolean z5 = this.isFavorite;
        StringBuilder sbI = pe.a.i(i, "GroupsGroupAttach(id=", ", text=", str, ", status=");
        o.p(i10, str2, ", size=", ", isFavorite=", sbI);
        sbI.append(z5);
        sbI.append(")");
        return sbI.toString();
    }
}
