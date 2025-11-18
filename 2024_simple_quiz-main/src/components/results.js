//page for displaying results
import React from 'react';

const Results = ({ score, total }) => {
    return (
        <div>
            <h2>Your Results</h2>
            <p>You answered {score} out of {total} questions correctly.</p>
        </div>
    );
}
export default Results;
