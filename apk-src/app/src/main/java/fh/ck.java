package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.Device;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ck implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17028a;

    public ck(sy syVar) {
        this.f17028a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yj resolve(ParsingContext parsingContext, kk kkVar, JSONObject jSONObject) {
        Field field = kkVar.f17582a;
        sy syVar = this.f17028a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.f17583b, jSONObject, "alignment_horizontal", dk.f17103k, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.f17584c, jSONObject, "alignment_vertical", dk.f17104l, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.f17585d, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, dk.f17109q, dk.f17094a);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.f17586e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.f17587f, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = kkVar.f17589h;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper, function1, dk.f17110r);
        Field field3 = kkVar.i;
        TypeHelper typeHelper2 = dk.f17105m;
        mg mgVar = mg.f17861t;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_axis_alignment", typeHelper2, mgVar, dk.f17095b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.f17590j, jSONObject, "default_item", typeHelper, function1, dk.f17111s, dk.f17096c);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.f17591k, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.f17592l, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.f17594n, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, kkVar.f17595o, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = dk.f17097d;
        }
        lo loVar2 = loVar;
        Field field4 = kkVar.f17597q;
        TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "infinite_scroll", typeHelper3, function12, dk.f17098e);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.f17600t, jSONObject, "items", syVar.f18550u9, syVar.f18530s9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.f17604x, jSONObject, Device.JsonKeys.ORIENTATION, dk.f17106n, mg.f17862u, dk.f17099f);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.A, jSONObject, "restrict_parent_scroll", typeHelper3, function12, dk.f17100g);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.C, jSONObject, "row_span", typeHelper, function1, dk.f17112t);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.D, jSONObject, "scroll_axis_alignment", dk.f17107o, mgVar, dk.f17101h);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.E, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.F, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.K, jSONObject, "transition_triggers", kv.f17646g, dk.f17113u);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.L, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.M, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, kkVar.N, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, dk.f17108p, kv.f17653o, dk.i);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, kkVar.O, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, kkVar.P, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, kkVar.Q, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = dk.f17102j;
        }
        return new yj(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
