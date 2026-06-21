package com.vk.dto.common.id;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class UserIdKt {
    private static volatile Function0<Unit> legacyObserver = UserIdKt$legacyObserver$1.INSTANCE;

    public static final UserId abs(UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "<this>");
        return userId.copy(Math.abs(userId.getValue()));
    }

    public static final boolean isGroupId(UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "<this>");
        return userId.getValue() < 0;
    }

    public static final boolean isReal(UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "<this>");
        return userId.getValue() != 0;
    }

    public static final boolean isUserId(UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "<this>");
        return userId.getValue() > 0;
    }

    public static final int legacyValue(UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "<this>");
        legacyObserver.invoke();
        return (int) userId.getValue();
    }

    public static final List<Integer> mapLegacyValues(List<UserId> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        legacyObserver.invoke();
        List<UserId> list2 = list;
        ArrayList arrayList = new ArrayList(t.j(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(legacyValue((UserId) it.next())));
        }
        return arrayList;
    }

    public static final UserId negative(UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "<this>");
        return userId.copy(-userId.getValue());
    }

    public static final UserId toLegacyUserId(int i) {
        legacyObserver.invoke();
        return new UserId(i);
    }

    public static final UserId toUserId(long j10) {
        return new UserId(j10);
    }

    public static final UserId unaryMinus(UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "<this>");
        return negative(userId);
    }

    private static /* synthetic */ void getLegacyObserver$annotations() {
    }
}
