package ch.hsr.mge.masterdetailflow.presentation;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import ch.hsr.mge.masterdetailflow.domain.Notes;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemRoot) {
            super(itemRoot);
        }
    }

    public NotesAdapter(Notes notes, ItemSelectionListener selectionListener) {
        throw new AssertionError("not implemented");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        throw new AssertionError("not implemented");
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        throw new AssertionError("not implemented");
    }

    @Override
    public int getItemCount() {
        throw new AssertionError("not implemented");
    }

}