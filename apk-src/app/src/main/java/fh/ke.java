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
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ke implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17578a;

    public ke(sy syVar) {
        this.f17578a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final he resolve(ParsingContext parsingContext, me meVar, JSONObject jSONObject) {
        Field field = meVar.f17806a;
        sy syVar = this.f17578a;
        if (((u6) JsonFieldResolver.resolveOptional(parsingContext, meVar.f17808c, jSONObject, "action_animation", syVar.f18522s1, syVar.f18503q1)) == null) {
            Expression expression = le.f17691a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17809d, jSONObject, "actions", syVar.f18464m1, syVar.f18443k1);
        Field field2 = meVar.f17810e;
        TypeHelper typeHelper = le.f17698h;
        v0 v0Var = v0.f18733v;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        Field field3 = meVar.f17811f;
        TypeHelper typeHelper2 = le.i;
        v0 v0Var2 = v0.f18734w;
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.f17812g, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, le.f17702m, le.f17691a);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17813h, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.i, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.f17815k, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, le.f17692b);
        Field field4 = meVar.f17816l;
        TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveExpression(parsingContext, field4, jSONObject, "column_count", typeHelper3, function1, le.f17703n);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.f17817m, jSONObject, "column_span", typeHelper3, function1, le.f17704o);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.f17818n, jSONObject, "content_alignment_horizontal", le.f17699j, v0Var, le.f17693c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.f17819o, jSONObject, "content_alignment_vertical", le.f17700k, v0Var2, le.f17694d);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17820p, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17821q, jSONObject, "doubletap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17822r, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17824t, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, meVar.f17825u, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = le.f17695e;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17826v, jSONObject, "hover_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17827w, jSONObject, "hover_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.f17829y, jSONObject, "items", syVar.f18550u9, syVar.f18530s9);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.A, jSONObject, "longtap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.D, jSONObject, "press_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.E, jSONObject, "press_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.F, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.G, jSONObject, "row_span", typeHelper3, function1, le.f17705p);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.H, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.I, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.N, jSONObject, "transition_triggers", kv.f17646g, le.f17706q);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.O, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, meVar.P, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, meVar.Q, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, le.f17701l, kv.f17653o, le.f17696f);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, meVar.R, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, meVar.S, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, meVar.T, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = le.f17697g;
        }
        return new he(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
